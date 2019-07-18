import java.io.*;
 import javax.servlet.*;
 import javax.servlet.http.*;
 import java.sql.*;
  
 public class registerdisplay extends HttpServlet {
  
     public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
         PrintWriter out = res.getWriter();
         res.setContentType("text/html");
         out.println("<html><body><style> input[type=button]{\n" +
"    float: center;\n" +
"    margin-right: 20px;\n" +
"    margin-top: 20px;\n" +
"    width: 200px;\n" +
"    height: 50px;\n" +
"    font-size: 20px;\n" +
"    font-weight: bold;\n" +
"    color: #000;\n" +
"    background-color:#4CAF50; /*#aef9gh; /*IE fallback*/\n" +
"    background-image: -webkit-gradient(linear, left top, left bottom, from(#acd6ef), to(#6ec2e8));\n" +
"    background-image: -moz-linear-gradient(top left 90deg, #acd6ef 0%, #6ec2e8 100%);\n" +
"    background-image: linear-gradient(top left 90deg, #acd6ef 0%, #6ec2e8 100%);\n" +
"    border-radius: 30px;\n" +
"    border: 1px solid #66add6;\n" +
"    box-shadow: 0 1px 2px rgba(0, 0, 0, .3), inset 0 1px 0 rgba(255, 255, 255, .5);\n" +
"    cursor: pointer;\n" +
"}\n" +
"        </style>");
         try {
             
             Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Conference", "sri", "sri");
             
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select * from register");
              out.println("<h1 align='center'>Conference Details</h1>");
             out.println("<table align='center' border=2 width=80% height=50%>");
             out.println("<tr><th>S.no</th><th>Conference name</th><th>Date</th><th>venue</th><th>Time</th><th>Last date for registration</th></tr>");
             while (rs.next()) {
                 String uname = rs.getString("uname");
                 String password = rs.getString("password");
                 String email = rs.getString("email");
                 String address = rs.getString("address"); 
                 String topic=rs.getString("topic");
                 String abs = rs.getString("abs");
                 String status = rs.getString("status");
                 out.println("<tr><td>" + uname + "</td><td>" + password + "</td><td>" + email + "</td><td>" + address + "</td><td>" + topic + "</td><td>" + abs + "</td><td>" + status + "</td></tr>"); 
             }
             out.println("</table>");
             out.println("<form action='' method='post'>");
             out.println("</br><input type='button' align='center' name='sel' value='Select the candidates'>");
             out.println("</form></html></body>");
             con.close();
            }
             catch (Exception e) {
             out.println("error");
         }
     }
 }