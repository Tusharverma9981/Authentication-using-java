package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import db.Dbconnector;
import java.sql.Statement;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("  .user-profile {\n");
      out.write("    width: 300px;\n");
      out.write("    margin: 20px auto;\n");
      out.write("    padding: 20px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 12px;\n");
      out.write("    box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("    background-color: #f9f9f9;\n");
      out.write("  }\n");
      out.write("  .user-profile h2 {\n");
      out.write("    text-align: center;\n");
      out.write("    margin-bottom: 15px;\n");
      out.write("    color: #333;\n");
      out.write("  }\n");
      out.write("  .user-profile ul {\n");
      out.write("    list-style: none;\n");
      out.write("    padding: 0;\n");
      out.write("  }\n");
      out.write("  .user-profile li {\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("  }\n");
      out.write("  .user-profile strong {\n");
      out.write("    color: #555;\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
        String username =(String)session.getAttribute("username");
         Statement st = Dbconnector.getStatement();
         String query = "SELECT  * FROM swingdatabase WHERE username='"+username+"'";
        
          ResultSet rs=st.executeQuery(query);
          
          String id ="";
          String salary ="";
          String city ="";
          
          
           if(rs.next()){
               
                  id = rs.getString(1);
                  city = rs.getString(4);
                   salary = rs.getString(5);
                    
            }
           
//          
//               
        
      out.write("\n");
      out.write("   \n");
      out.write("       <div class=\"user-profile\">\n");
      out.write("  <h2>User Profile</h2>\n");
      out.write("  <ul>\n");
      out.write("        <li><strong>ID:</strong> <span id=\"user-id\" >");
      out.print(id );
      out.write("</span></li>\n");
      out.write("       <li><strong>Username</strong> <span id=\"username\">");
      out.print( username );
      out.write("</span></li>\n");
      out.write("  \n");
      out.write("        \n");
      out.write("      \n");
      out.write("    <li><strong>Salary:</strong> <span id=\"salary\">");
      out.print( salary );
      out.write("</span></li>\n");
      out.write("    <li><strong>City:</strong> <span id=\"city\">");
      out.print( city );
      out.write("</span></li>\n");
      out.write("  </ul>\n");
      out.write("  <form method=\"GET\" action=\"UpdateProfile\">\n");
      out.write("              <button id=\"profile-button\">\n");
      out.write("              Update Proflie\n");
      out.write("          </button>\n");
      out.write("      </form>\n");
      out.write("       <br>\n");
      out.write("  <form method=\"POST\" action=\"deleteProflie\" >\n");
      out.write("      <button id=\"profile-button\" onclick=\"alert='do you want to delete the user' \">\n");
      out.write("              Delete Proflie\n");
      out.write("          </button>\n");
      out.write("      </form>\n");
      out.write("       <br>\n");
      out.write("       <form method=\"get\" action=\"home.jsp\" >\n");
      out.write("      <button id=\"profile-button\" onclick=alertmessage>\n");
      out.write("              Home\n");
      out.write("          </button>\n");
      out.write("      </form>\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("  <script>\n");
      out.write("      alertmessage = ()=>{\n");
      out.write("          alert(\"are you sure you want to delete the user\");\n");
      out.write("      }\n");
      out.write("  </script>\n");
      out.write("  \n");
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
