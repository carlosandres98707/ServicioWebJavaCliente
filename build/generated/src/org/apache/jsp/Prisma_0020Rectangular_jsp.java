package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Prisma_0020Rectangular_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Prisma Rectangular</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("               body{\n");
      out.write("                background-image: url(imagenes/fondo.jpg);\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                color: white;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                font-size: 50px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            label{\n");
      out.write("                \n");
      out.write("                font-family: arial black;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 25px;\n");
      out.write("            }\n");
      out.write("            .b{\n");
      out.write("                height: 25px;\n");
      out.write("                width: 200px;\n");
      out.write("                font-size: 24px;\n");
      out.write("                    \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .button3{\n");
      out.write("                border-radius: 12px;\n");
      out.write("                width: 200px;\n");
      out.write("                height: 50px;\n");
      out.write("                background-color: white; \n");
      out.write("                color: black; \n");
      out.write("                border: 2px solid #21FBF3;\n");
      out.write("                font-size: 25px;\n");
      out.write("            }\n");
      out.write("            .button3:hover{\n");
      out.write("                background-color: #21FBCF;\n");
      out.write("                color: white;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <center>\n");
      out.write("        <h1>Hallar Cateto A</h1>\n");
      out.write("        <div>\n");
      out.write("           <form action=\"calcatetoa\" method=\"post\">\n");
      out.write("               <label>Largo:</label>\n");
      out.write("               <input type=\"text\" name=\"largo\" class=\"b\" placeholder=\"cm2\" required=\"true\"><br><br>\n");
      out.write("               <label>Ancho:</label>\n");
      out.write("               <input type=\"text\" name=\"ancho\" class=\"b\" placeholder=\"cm2\" required=\"true\"><br><br>\n");
      out.write("               <label>Alto:</label>\n");
      out.write("               <input type=\"text\" name=\"alto\" class=\"b\" placeholder=\"cm2\" required=\"true\"><br><br>\n");
      out.write("               <input type=\"submit\" name=\"envio\" value=\"Calcular\" class=\"button3\">\n");
      out.write("            \n");
      out.write("        </form> \n");
      out.write("        </div>\n");
      out.write("    </center>\n");
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
