package org.apache.jsp.site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Welcome</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<table border=\"1\" width = \"1650\" height = \"1000\" cellpadding = \"15\" cellspacing = \"10\" bgcolor=\"#bedbeb\">\n");
      out.write("\n");
      out.write("<tr bgcolor=\"#FFFFFF\">\n");
      out.write("<td height = \"20%\">put header here</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr bgcolor=\"#FFFFFF\">\n");
      out.write("<td><form method =\"post\" action=\"login.jsp\" name=\"loginForm\"> Sign in:\n");
      out.write("<br>\n");
      out.write("<input type=\"text\" value = \"username\" name=\"username\"></input> \n");
      out.write("<br>\n");
      out.write("<input type=\"password\" value = \"password\" name=\"password\"></input>\n");
      out.write("<br>\n");
      out.write("<input type = \"submit\" value = \"Log in\" name = \"submit\"></input>\n");
      out.write("</form>\n");
      out.write("<br>\n");
      out.write("\n");


/*get the current URL so I can make a link to the sign up page without worrying about which computer I'm running this from */

String url = request.getRequestURL().toString();
url = url.replace("home.jsp","sign_up.html");

      out.write("\n");
      out.write("\n");
      out.write("<font size = \"2\"><i>Not a member? <a href = \"");
      out.print(url);
      out.write("\">Sign up.</i></font></a>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
