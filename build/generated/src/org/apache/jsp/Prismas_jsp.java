package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Prismas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Prismas</title>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            body{\n");
      out.write("                background-image: url(imagenes/fondo.jpg);\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                color: white;\n");
      out.write("                font-style: oblique;\n");
      out.write("                font-family: calibri;\n");
      out.write("                font-size: 50px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            p{\n");
      out.write("                color: white;\n");
      out.write("                font-size: 25px;\n");
      out.write("            }\n");
      out.write("            .button   {\n");
      out.write("                background-color: #4CAF50; /* Green */\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("                padding: 16px 32px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("                margin: 4px 2px;\n");
      out.write("                transition-duration: 0.4s;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button1 {\n");
      out.write("                background-color: white; \n");
      out.write("                color: black; \n");
      out.write("                border: 2px solid #4CAF50;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button1:hover {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button2 {\n");
      out.write("                background-color: white; \n");
      out.write("                color: black; \n");
      out.write("                border: 2px solid #008CBA;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button2:hover {\n");
      out.write("                background-color: #008CBA;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button3 {\n");
      out.write("                background-color: white; \n");
      out.write("                color: black; \n");
      out.write("                border: 2px solid #f44336;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button3:hover {\n");
      out.write("                background-color: #f44336;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            div{\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <center>\n");
      out.write("        <h1>Volumen de Prismas</h1>\n");
      out.write("        <p>Escoje una operacion:</p>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <a href=\"Hipotenusa.jsp\"><button type=\"button\" class=\"button button1\">Prisma rectangular</button> </a>\n");
      out.write("            <a href=\"CatetoA.jsp\"><button type=\"button\" class=\"button button3\">Cateto A</button> </a>\n");
      out.write("            <a href=\"CatetoB.jsp\"><button type=\"button\" class=\"button button2\">Cateto B</button> </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </center>\n");
      out.write("\n");
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
