<%@ page import="java.sql.*" %> 
<% if(request.getParameter("submit") != null) { 
//get the user input from the login page 
String userName = (request.getParameter("username")).trim();
String passwd = (request.getParameter("password")).trim(); 

out.println("Your input User Name is "+userName+"");

out.println("Your input password is "+passwd+"");

//establish the connection to the underlying database
Connection conn = null;
String driverName = "oracle.jdbc.driver.OracleDriver";
String dbstring = "jdbc:oracle:thin:@gwynne.cs.ualberta.ca:1521:CRS";

try{ 
//load and register the driver 
Class drvClass = Class.forName(driverName);
DriverManager.registerDriver((Driver) drvClass.newInstance());
 } catch(Exception ex){ out.println("" + ex.getMessage() + "");
	 }

 try{ 
//establish the connection 
conn = DriverManager.getConnection(dbstring,"nlovas","D4v3spr1t3");
conn.setAutoCommit(false);
 } catch(Exception ex){ out.println("" + ex.getMessage() + "");
	 }

//select the user table from the underlying db and validate the user name and password

Statement stmt = null;
ResultSet rset = null;
String sql = "select PWD from login where id = '"+userName+"'";
out.println(sql);

try{ 
stmt = conn.createStatement();
rset = stmt.executeQuery(sql);
} catch(Exception ex){ out.println("" + ex.getMessage() + "");
	 }

String truepwd = "";
while(rset != null && rset.next()) truepwd = (rset.getString(1)).trim();

//display the result 
if(passwd.equals(truepwd)) out.println("Your Login is Successful!"); 
else out.println("Either your userName or Your password is invalid!");
try{ conn.close();
 } catch(Exception ex){ out.println("" + ex.getMessage() + "");
	 }
	 } else {
out.println("null!!");
out.println("UserName:");
out.println("Password:");
out.println("");
out.println(""); } %> 
