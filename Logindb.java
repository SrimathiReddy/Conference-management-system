import java.sql.*;  
  
public class Logindb {  
public static boolean validate(String name,String pass){  
boolean status=false;  
try{  
Connection con=DriverManager.getConnection(  
"jdbc:derby://localhost:1527/Conference","sri","sri");  
      
PreparedStatement ps=con.prepareStatement(  
"select * from login where name=? and pass=? ");  
ps.setString(1,name);  
ps.setString(2,pass);  
      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
          
}catch(Exception e)
{System.out.println(e);}  
return status;  
}  
}  


