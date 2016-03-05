package org.apache.jsp.JSP_002dExamples;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import java.lang.*;

public final class test2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {



	String m_url = "jdbc:oracle:thin:@gwynne.cs.ualberta.ca:1521:CRS";
       String m_driverName = "oracle.jdbc.driver.OracleDriver";

       String m_userName = "nlovas";
       String m_password = "D4v3spr1t3";

       Connection m_con;
       String defineString;
	Statement stmt;
void main(){

       try{

              Class drvClass = Class.forName(m_driverName);
              DriverManager.registerDriver((Driver)
              drvClass.newInstance());

       } 
catch(Exception e){

              System.err.print("ClassNotFoundException: ");
              System.err.println(e.getMessage());

       }


try{

              m_con = DriverManager.getConnection(m_url, m_userName,
              m_password);


		String dropQ = "drop table cats;";
		String makeQ = "create table cats(" +
		"name char(20)," +
		"color char(15)," +
		"primary key name" +
		");";

		stmt.executeQuery(dropQ);
		stmt.executeQuery(makeQ);

              stmt.close();
              m_con.close();

       } catch(SQLException ex) {

              System.err.println("SQLException: " +
              ex.getMessage());

       }
}



  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<html> \n");
      out.write("<head></head> \n");
      out.write("<body>\n");
      out.write("\n");
      out.write("Let's do some table stuff\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
