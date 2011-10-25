package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private no.ntnu.tdt4237.User loggedInUser;

  public no.ntnu.tdt4237.User getLoggedInUser() {
    return this.loggedInUser;
  }

  public void setLoggedInUser(no.ntnu.tdt4237.User loggedInUser) {
    this.loggedInUser = loggedInUser;
    jspContext.setAttribute("loggedInUser", loggedInUser);
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) config.getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(JspContext.class,jspContext);
    if( getLoggedInUser() != null ) 
      _jspx_page_context.setAttribute("loggedInUser", getLoggedInUser());

    try {
      out.write('\n');
      out.write('\n');

boolean loggedIn = loggedInUser != null;

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"menu\">\n");

if (loggedIn)
{
	
      out.write("\n");
      out.write("\t<span><a href=\"/profile/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loggedInUser.userName}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\">Profile</a></span>\n");
      out.write("\t<span><a href=\"/blog/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loggedInUser.userName}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\">Your blog</a></span>\n");
      out.write("\t<span><a href=\"/newpost.jsp\">New Blog Post</a></span>\n");
      out.write("\t<span><a href=\"/users\">Users</a></span>\n");
      out.write("\t<span><a href=\"/logout.jsp\">Log out</a></span>\n");
      out.write("\t");

}
else
{
	
      out.write("\n");
      out.write("\t<span><a href=\"/login.jsp\">Log in</a></span>\n");
      out.write("\t");

}

      out.write("\n");
      out.write("<span></span>\n");
      out.write("</div>\n");
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      jspContext.getELContext().putContext(JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }
}
