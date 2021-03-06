package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Manager_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Manager</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-2 bg-dark text-light justify-content-center m-auto d-flex border border-top-bottom-left-0\">Admintrator</div>\n");
      out.write("            <div class=\"col-sm-2 bg-dark text-light justify-content-center m-auto d-flex border border-top-bottom-left-0\"><a href=\"trangchu\">V??o trang Web</a></div>\n");
      out.write("            <div class=\"col-sm-2 bg-dark text-light justify-content-center m-auto d-flex border border-top-bottom-left-0\">Li??n h???</div>\n");
      out.write("            <div class=\"col-sm-2 bg-dark text-light justify-content-center m-auto d-flex\">????n h??ng</div>\n");
      out.write("            <div class=\"col-sm bg-dark text-light justify-content-center m-auto d-flex\">Xin ch??o Admin</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-2 border\">Trang ch??? Admin</div>\n");
      out.write("            <div class=\"col-sm-10 border\"><a href=\"#\">Trang ch???</a></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-2 border\">\n");
      out.write("                <ul class=\"list-group\">\n");
      out.write("                    <li class=\"list-group-item border-0\">\n");
      out.write("                        <a href=\"#\">Qu???n l?? s???n ph???m</a>\n");
      out.write("                        <ul class=\"list-group-item list-unstyled border-0\">\n");
      out.write("                            <li><a href=\"#\">Chinh sua san pham</a></li>\n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"list-group-item border-0\">\n");
      out.write("                        <a href=\"#\">Qu???n l?? th??ng tin</a>\n");
      out.write("                        <ul class=\"list-group-item list-unstyled border-0\">\n");
      out.write("                            <li><a href=\"#\">Danh s??ch ????n h??ng</a></li>\n");
      out.write("                            <li><a href=\"#\">Kh??ch h??ng li??n h???</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    <li class=\"list-group-item border-0\">\n");
      out.write("                        <a href=\"#\">C???u h??nh User</a>\n");
      out.write("                        <ul class=\"list-group-item list-unstyled border-0\">\n");
      out.write("                            <li><a href=\"#\">Qu???n l?? User</a></li>\n");
      out.write("                            <li><a href=\"#\">Th??ng tin User</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-10 border\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
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
