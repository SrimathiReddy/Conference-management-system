import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserDataServlet
 */
public class RegisterController extends HttpServlet {

 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  response.setContentType("text/html");
  PrintWriter out = response.getWriter();
  String uname = request.getParameter("user");
  String pass = request.getParameter("pass");
  String email = request.getParameter("email");
  String addr = request.getParameter("address");
  String title = request.getParameter("topic");
  String abs = request.getParameter("abstract");
  

  // validate given input
  if (uname.isEmpty() || pass.isEmpty() || email.isEmpty() || addr.isEmpty() || title.isEmpty() || abs.isEmpty()) {
   RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
   out.println("<font color=red>Please fill all the fields</font>");
   rd.include(request, response);
  } else {
   // inserting data into mysql database 
   // create a test database and student table before running this to create table
   //create table student(name varchar(100), userName varchar(100), pass varchar(100), addr varchar(100), age int, qual varchar(100), percent varchar(100), year varchar(100));
   try {
    
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Conference", "sri","sri"); 

    String query = "insert into register values(?,?,?,?,?,?)";

    PreparedStatement ps = con.prepareStatement(query); // generates sql query

    ps.setString(1,uname);
   
    ps.setString(2, pass);
    ps.setString(3, email);
    ps.setString(4, addr);
    ps.setString(5,title);
    ps.setString(6,abs);

    ps.executeUpdate(); // execute it on test database
    System.out.println("successfuly inserted");
    ps.close();
    con.close();
   } catch (SQLException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
   }
   RequestDispatcher rd = request.getRequestDispatcher(".jsp");
   rd.forward(request, response);
  }
 }
}
