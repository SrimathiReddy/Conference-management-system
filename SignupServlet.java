import java.io.*;  
import java.sql.*;  
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class SignupServlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String n=request.getParameter("userName");  
String p=request.getParameter("userPass");  
String e=request.getParameter("userEmail");  
String c=request.getParameter("userCountry");  
if (n.isEmpty() || p.isEmpty() || e.isEmpty() || c.isEmpty()) {
   RequestDispatcher rd = request.getRequestDispatcher("Signup.html");
   out.println("<font color=red>Please fill all the fields</font>");
   rd.include(request, response);
  } else {
          
try{  

Connection con=DriverManager.getConnection(  
"jdbc:derby://localhost:1527/Conference","sri","sri");  
  
PreparedStatement ps=con.prepareStatement(  
"insert into login values(?,?)");  
  
ps.setString(1,n);  
ps.setString(2,p);  
//ps.setString(3,e);  
//ps.setString(4,c);  
          
int i=ps.executeUpdate();  
if(i>0){  
out.print("alert(You are successfully registered...)");  
RequestDispatcher rd=request.getRequestDispatcher("index.html");  
        rd.forward(request,response); }
      
          
}catch (Exception e2) {System.out.println(e2);}  
          
out.close();  
}  
}
}  