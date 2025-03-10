package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page</title>\n");
      out.write("   \n");
      out.write("      <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("   \n");
      out.write("        <style>\n");
      out.write("/*            #profile-button{\n");
      out.write("                margin-top: 10px;\n");
      out.write("                margin-right: 5px;\n");
      out.write("                padding:0px;\n");
      out.write("            }*/\n");
      out.write(".fixed-top{\n");
      out.write("    height: 60px;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<!--        <nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Welcome</a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("      \n");
      out.write("      <li> <form method=\"GET\" action=\"ProfileChecker\">\n");
      out.write("              <button id=\"profile-button\">\n");
      out.write("              Proflie\n");
      out.write("          </button>\n");
      out.write("      </form></li>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    \n");
      out.write("    </ul>\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      <li><a href=\"logout.jsp\"><span class=\"glyphicon glyphicon-user\"></span>Login</a></li>\n");
      out.write("      <li><a href=\"login.html\"><span class=\"glyphicon glyphicon-log-in\"></span> Sign-out </a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav-->\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg fixed-top \" style=\"background-color: #e3f2fd;\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Home</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <form method=\"GET\" action=\"ProfileChecker\">\n");
      out.write("              <button id=\"profile-button\" class=\"btn\">\n");
      out.write("              Proflie\n");
      out.write("          </button>\n");
      out.write("      </form>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link \"  href=\"about.html\">About</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            \n");
      out.write("          <a class=\"nav-link\" href=\"logout.jsp\">Log-out</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("      <form class=\"d-flex\" role=\"search\">\n");
      out.write("        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("        <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        ");
 
        String username =(String)session.getAttribute("username");
        if(username==null || username.trim().equals("")){
            response.sendRedirect("login.html");
        }
        
      out.write("\n");
      out.write("         <h2></h2>\n");
      out.write("        <h1>Hello ");
      out.print( username);
      out.write("</h1>\n");
      out.write("        <div class=\"row row-cols-lg-3 row-cols-md-2 row-cols-sm-1 mt-3\">\n");
      out.write("   ");
 for(int i=0;i<15;i++){ 
      out.write(" \n");
      out.write("      <a href=\"\" class=\"listing-link\"> \n");
      out.write("   <div class=\"card col\" >\n");
      out.write("      <img src=\"https://media.istockphoto.com/id/1403500817/photo/the-craggies-in-the-blue-ridge-mountains.jpg?s=612x612&w=0&k=20&c=N-pGA8OClRVDzRfj_9AqANnOaDS3devZWwrQNwZuDSk=\" class=\"card-img-top\" alt=\"image\" style=\"height: 20rem;\">\n");
      out.write("      <div class=\"card-img-overlay\"></div>\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <p class=\"card-text\">\n");
      out.write("        <b> </b>title<br/>\n");
      out.write("         \n");
      out.write("        </p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("   </a> \n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("   </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
