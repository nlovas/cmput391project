import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.sql.*;

public class test extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

String m_url = "jdbc:oracle:thin:@gwynne.cs.ualberta.ca:1521:CRS";
       String m_driverName = "oracle.jdbc.driver.OracleDriver";

       String m_userName = "nlovas";
       String m_password = "D4v3spr1t3";

       Connection m_con;
       String createString;
       createString = "create table TOFFEES " +

              "(T_NAME VARCHAR(32), " +
              "SUP_ID INTEGER, " +
              "PRICE FLOAT, " +
              "SALES INTEGER, " +
              "TOTAL INTEGER)";

       Statement stmt;
	String queryString = "select T_NAME, SUP_ID, PRICE, SALES, TOTAL  from  TOFFEES";

       try
       {

              Class drvClass = Class.forName(m_driverName);
              DriverManager.registerDriver((Driver)
              drvClass.newInstance());

       } catch(Exception e)
       {

              System.err.print("ClassNotFoundException: ");
              System.err.println(e.getMessage());

       }

       try
       {

              m_con = DriverManager.getConnection(m_url, m_userName,
              m_password);

              stmt = m_con.createStatement();
              stmt.executeUpdate(createString);
            

stmt = m_con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            	ResultSet rset = stmt.executeQuery(queryString);
		
		
	      rset.moveToInsertRow();
	      rset.updateString(1,"TRIADBURY");
	      rset.updateInt(2,2000);
	      rset.updateDouble(3,8.00);
	      rset.updateInt(4,9999);
	      rset.updateInt(5 ,6666);
	      rset.insertRow(); /**************** Necessary ************/

System.out.println("made it this far!");
ResultSet rset1 = stmt.executeQuery(queryString);

        /*     while(rset1.next())
 	      {
     		System.out.println(rset1.getString(1) + "   " +
          	rset1.getInt(2) + "   " +
          	rset1.getDouble(3) + "   " +
          	rset1.getInt(4) + "  " +
          	rset1.getInt(5));
 	      }*/

		rset1.next(); 

		String SQLStatement = request.getParameter("SQLStatement");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
			"Transitional//EN\">\n" +
			"<HTML>\n" +
			"<HEAD><TITLE>Asn2Sample</TITLE></HEAD>\n" +
			"<BODY>\n" +
			"<H1>" +
			rset1.getString(1) + "   " +
          	rset1.getInt(2) + "   " +
          	rset1.getDouble(3) + "   " +
          	rset1.getInt(4) + "  " +
          	rset1.getInt(5) + 
			"</H1>\n" +
			"</BODY></HTML>");

 stmt.close();
              m_con.close();

	 } catch(SQLException ex) {


 		//stmt.close();
              //m_con.close();
              System.err.println("SQLException: " +
              ex.getMessage());

       }



	}
}
