<%-- 
    Document   : register
    Created on : 1 Sep, 2018, 11:34:40 PM
    Author     : ELCOT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<style>
/*div.ex {
	text-align:center ;
        width: 300px;
	padding: 10px;
	border: 5px solid grey;
	margin: 0px
}*/
body{
    background-image:url("Images/nature sea.jpg");
    background-size:cover;

}
            
input[type=text],
input[type=password] {
    color: #777;
    padding-left: 10px;
    margin: 10px;
    margin-top: 12px;
    background-color:transparent;
    border-top-style:none;
    border-left-style:none;
    border-right-style:none;;
    margin-left: 18px;
    width: 290px;
    height: 35px;
}
  
    button{
    float: right;
    margin-right: 20px;
    margin-top: 20px;
    width: 100px;
    height: 50px;
    font-size: 20px;
    font-weight: bold;
    color: #000;
    background-color:#4CAF50; /*#aef9gh; /*IE fallback*/
    background-image: -webkit-gradient(linear, left top, left bottom, from(#acd6ef), to(#6ec2e8));
    background-image: -moz-linear-gradient(top left 90deg, #acd6ef 0%, #6ec2e8 100%);
    background-image: linear-gradient(top left 90deg, #acd6ef 0%, #6ec2e8 100%);
    border-radius: 30px;
    border: 1px solid #66add6;
    box-shadow: 0 1px 2px rgba(0, 0, 0, .3), inset 0 1px 0 rgba(255, 255, 255, .5);
    cursor: pointer;
    
}

h1,p{color:white;}
div.ex{
    position: fixed;
    float:center;
    font-size: 30px;
    padding:5px;
    width: 760px;
    height: 520px;
    top: 20%;
    left: 50%;
    color:white;
    margin-top: -60px;
    margin-left: -320px;
    background: rgba(36, 70, 105, 0.74);
    opacity:0.9;
    border-radius: 3px;
     border: 1px solid rgba(36, 70, 109, 0.78);
    box-shadow: 0 1px 2px rgba(0, 0, 0, .1);
          }
    input {
    font-family: "Helvetica Neue", Helvetica, sans-serif;
    font-size: 20px;
    outline: none;
}
            
    input[type=submit]{
    float: right;
    margin-right: 20px;
    margin-top: 20px;
    width: 100px;
    height: 50px;
    font-size: 20px;
    font-weight: bold;
    color: #fff;
    background-color:#4CAF50; /*#aef9gh; /*IE fallback*/
    background-image: -webkit-gradient(linear, left top, left bottom, from(#acd6ef), to(#6ec2e8));
    background-image: -moz-linear-gradient(top left 90deg, #acd6ef 0%, #6ec2e8 100%);
    background-image: linear-gradient(top left 90deg, #acd6ef 0%, #6ec2e8 100%);
    border-radius: 30px;
    border: 1px solid #66add6;
    box-shadow: 0 1px 2px rgba(0, 0, 0, .3), inset 0 1px 0 rgba(255, 255, 255, .5);
    cursor: pointer;
}
</style>
<body>
	<h1 align="center">Conference Registration Form</h1>
        <p align="center">We thank you for participating in our conference.Please fill in the Conference Registration form below</p>	<div class="ex">
		<form action="http://localhost:29610/Conference_Management_System_1/RegisterController" method="post">
			<table style="width: 80% ">
				<tr>
					<td>Username</td><br>
					<td><input type="text" name="first" placeholder="Full name"/></td>
                                        			
                                </tr>
				<tr>
					<td>Password</td><br>
					<td><input type="password" name="pass" placeholder="password" /></td>
				</tr>
                                <tr>
					<td>Gender</td>
                                                <td><input type="radio" name="gender1" value="Male" ></td>
                                                <td><input type="radio" name="gender2" value="Female" > </td>       
                                       
				</tr>
                                <tr>
					<td>Email</td>
					<td><input type="text" name="email" placeholder="eg: abc@gmail.com" /></td>
				</tr>
				<tr>
					<td>Address</td><br>
					<td><input type="text" name="address" placeholder="Address" /></td>
				</tr>
                                <tr>
					<td>State</td><br>
					<td><input type="text" name="state" placeholder="State" /></td>
				</tr>
                                <tr>
					<td>Country</td>
                                                <td><select name="country" placeholder="Select" >
                                                        <option value="India"></option>
                                                        <option value="America"></option>
                                                        <option value="Australia"></option>
                                                        <option value="Japan"></option>
                                                        <option value="China"></option>
                                            </select></td>
				</tr>
                                <tr>
					<td>Conference name</td>
                                                <td><select name="confname" placeholder="Conference name" >
                                                        <option value="ICELW"></option>
                                                        <option value="ICDTE"></option>
                                                        <option value="ICFL 2018"></option>
                                            </select></td>
				</tr>

				<tr>
					<td>Title</td>
                                                <td><select name="topic" placeholder="Title" >
                                                        <option value="Education"></option>
                                                        <option value="Business"></option>
                                            </select></td>
				</tr>
                                <tr>
					<td>Abstract</td><br>
					<td><input type="textarea" rows="30" cols="20" name="abstract" placeholder="Address" /></td>
				</tr>
			</table>
			<input type="submit" value="Register" />
		</form>
		<br>

	</div>
</body>
</html>