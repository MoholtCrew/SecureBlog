package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import no.ntnu.tdt4237.*;
import no.ntnu.tdt4237.helperactions.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/tags/header.tag");
    _jspx_dependants.add("/WEB-INF/tags/message.tag");
  }

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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("\n");
      if (_jspx_meth_tags_005fheader_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");

boolean registerSuccess = false;
boolean register = request.getParameter("Password") !=null; 
if (register) {
	if ( Database.getUser(request.getParameter("UserName")) == null) {
		// The user doesn't exist
		registerSuccess = Database.saveUser(new User(request.getParameter("UserName"), 
								   request.getParameter("Password"), 
								   request.getParameter("Email"),
								   request.getParameter("FirstName"),
								   request.getParameter("LastName")));
	}
}

if (registerSuccess) {
	
      out.write('\n');
      out.write('	');
      out.write('	');
      if (_jspx_meth_tags_005fmessage_005f0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');

}
else
{
	
      out.write("\n");
      out.write("\t<div class=\"LoginBox\">\n");
      out.write("\t\t<form action=\"register.jsp\" method=\"post\">\n");
      out.write("\t\t\t<span>First Name:</span><input type=\"text\" name=\"FirstName\"></input><br/>\n");
      out.write("\t\t\t<span>Last Name:</span><input type=\"text\" name=\"LastName\"></input><br/>\n");
      out.write("\t\t\t<span>Email address:</span><input type=\"text\" name=\"Email\"></input><br/>\n");
      out.write("\t\t\t<span>User Name:</span><input type=\"text\" name=\"UserName\"></input><br/>\n");
      out.write("\t\t\t<span>Password:</span><input type=\"password\" name=\"Password\"></input><br/>\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Register\"></input>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t");

}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_tags_005fheader_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tags:header
    org.apache.jsp.tag.web.header_tag _jspx_th_tags_005fheader_005f0 = new org.apache.jsp.tag.web.header_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tags_005fheader_005f0);
    _jspx_th_tags_005fheader_005f0.setJspContext(_jspx_page_context);
    // /register.jsp(12,0) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tags_005fheader_005f0.setTitle(" - Register");
    _jspx_th_tags_005fheader_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tags_005fheader_005f0);
    return false;
  }

  private boolean _jspx_meth_tags_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tags:message
    org.apache.jsp.tag.web.message_tag _jspx_th_tags_005fmessage_005f0 = new org.apache.jsp.tag.web.message_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tags_005fmessage_005f0);
    _jspx_th_tags_005fmessage_005f0.setJspContext(_jspx_page_context);
    // /register.jsp(32,2) name = message type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tags_005fmessage_005f0.setMessage("Check your email!");
    _jspx_th_tags_005fmessage_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tags_005fmessage_005f0);
    return false;
  }
}
