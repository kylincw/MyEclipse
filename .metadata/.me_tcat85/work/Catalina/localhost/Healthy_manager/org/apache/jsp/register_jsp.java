/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2019-12-07 09:26:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1575710483704L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1575710483884L));
    _jspx_dependants.put("jar:file:/C:/Data/MyEclipse%202017%20CI/.metadata/.me_tcat85/webapps/Healthy_manager/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098682290000L));
    _jspx_dependants.put("jar:file:/C:/Data/MyEclipse%202017%20CI/.metadata/.me_tcat85/webapps/Healthy_manager/WEB-INF/lib/standard.jar!/META-INF/fmt.tld", Long.valueOf(1098682290000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvar_005fvalue_005ftype_005fpattern_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvar_005fvalue_005ftype_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvar_005fvalue_005ftype_005fpattern_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      java.util.Date now = null;
      now = (java.util.Date) _jspx_page_context.getAttribute("now", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (now == null){
        now = new java.util.Date();
        _jspx_page_context.setAttribute("now", now, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/style/main.css\"  data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc3-17\" data-genuitec-path=\"/Healthy_manager/WebRoot/header.jsp\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/style/style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/style/menu.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/jquery-1.10.2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/menu.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("\t\t<title>新用户注册</title>\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/base.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/common.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script>\"undefined\"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:\"5635\",secure:\"5644\"},c={nonSecure:\"http://\",secure:\"https://\"},r={nonSecure:\"127.0.0.1\",secure:\"gapdebug.local.genuitec.com\"},n=\"https:\"===window.location.protocol?\"secure\":\"nonSecure\";script=e.createElement(\"script\"),script.type=\"text/javascript\",script.async=!0,script.src=c[n]+r[n]+\":\"+t[n]+\"/codelive-assets/bundle.js\",e.getElementsByTagName(\"head\")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>\r\n");
      out.write("\t<body data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc3-20\" data-genuitec-path=\"/Healthy_manager/WebRoot/register.jsp\">\r\n");
      out.write("\t\t<div id=\"main\" data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc3-20\" data-genuitec-path=\"/Healthy_manager/WebRoot/register.jsp\">\r\n");
      out.write("\t\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t\t<div id=\"top\">\r\n");
      out.write("\t\t\t\t\t<div style=\"padding-top: 143px\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"menu11\" class=\"menu11\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/notice/show!show\">主页</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/exam/find!find\">教师体检管理</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/sick.jsp\">疾病精确评估</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/food.jsp\">教师饮食管理</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/dairy/find!find?day=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${date}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">教师健康日志</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t<div id=\"locate\">\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;当前位置>>首页>>用户注册\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div align=\"center\" id=\"content\">\r\n");
      out.write("\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t<div id=\"center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"ltd\">\r\n");
      out.write("\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t<FONT color=#333>新用户注册</FONT>\r\n");
      out.write("\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t<TABLE cellSpacing=0 cellPadding=0 border=0>\r\n");
      out.write("\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<FORM onSubmit=\"return validateRegisterForm();\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/teacher/add!add\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TABLE width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH colSpan=3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<font face=\"Arial, Helvetica, sans-serif\"><b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t请填写个人资料：（注意带有<FONT color=#ff0000>*</FONT>的项目必须填写）</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH width=\"25%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<DIV align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<FONT color=#ff0000>*</FONT>登录账户：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</DIV>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD width=\"30%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT maxLength=14 name=\"teacher.name\" id=\"nickName\" style=\"width: 200px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH width=\"45%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<FONT color=#999999>昵称可使用长度为0-16的任何字符</FONT>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<DIV align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<FONT color=#ff0000>*</FONT> 登录密码：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</DIV>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT type=password maxLength=14 style=\"width: 200px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"teacher.password\" id=\"passwd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<FONT color=#999999>密码可使用长度为6-14的任何字符，并区分英文字母大小写</FONT>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<DIV align=right>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<FONT color=#ff0000>*</FONT>密码确认：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</DIV>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT type=password maxLength=14 style=\"width: 200px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"\" id=\"passwdre\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<FONT color=#999999>请再输入一次密码</FONT>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH width=\"25%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<DIV align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<FONT color=#ff0000>*</FONT>真实姓名：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</DIV>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD width=\"30%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT maxLength=14 name=\"teacher.realname\" id=\"realName\" style=\"width: 200px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH width=\"45%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<FONT color=#999999>真实姓名为2-4个汉字</FONT>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<DIV align=right>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<FONT color=#ff0000>*</FONT>电子邮箱：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</DIV>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT maxLength=30 style=\"width: 200px\" name=\"teacher.email\" id=\"email\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<FONT color=#999999>请输入您常用的其它电子邮箱</FONT>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<DIV align=right>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<FONT color=#ff0000>*</FONT> 找回密码问题：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</DIV>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT style=\"width: 200px\" name=\"teacher.question\" id=\"passwdQuestion\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<FONT color=#999999>例如：我的专业是？</FONT>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<DIV align=right>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<FONT color=#ff0000>*</FONT> 密保问题答案：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</DIV>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT style=\"width: 200px\" name=\"teacher.answer\" id=\"passwdAnswer\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<FONT color=#999999>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<DIV align=right>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<FONT color=#ff0000>*</FONT> 性别：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</DIV>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT type=radio CHECKED value=\"男\" name=\"teacher.sex\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t男\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT type=radio value=\"女\" name=\"teacher.sex\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t女\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<DIV align=right>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<FONT color=#ff0000>*</FONT>年龄：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</DIV>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT style=\"width: 200px\" name=\"teacher.age\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<FONT color=#999999>请输入年龄（必须为数字）</FONT>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<DIV align=right>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<FONT color=#ff0000>*</FONT>联系电话：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</DIV>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT style=\"width: 200px\" name=\"teacher.phone\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<FONT color=#999999>请输入真实的电话，以便我们与您联系</FONT>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tfoot>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TD colSpan=3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<DIV align=center>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT style=\"CURSOR: hand\" type=submit value=提交 />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT style=\"CURSOR: hand\" type=reset value=重置 />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</DIV>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tfoot>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</FORM>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t\t<div id=\"copyright\">\r\n");
      out.write("\t\t\t\t\t<div id=\"copy\">\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<font size=3px; color=#666666;> CopyRight&copy; 湖南理工学院</font>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"bgbottom\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /header.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("url");
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_c_005fset_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_c_005fset_005f0.doInitBody();
        }
        do {
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          int evalDoAfterBody = _jspx_th_c_005fset_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvar_005fvalue_005ftype_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    try {
      _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatDate_005f0.setParent(null);
      // /header.jsp(5,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${now}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /header.jsp(5,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setType("date");
      // /header.jsp(5,0) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-M-d");
      // /header.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setVar("date");
      int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
      if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvar_005fvalue_005ftype_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /register.jsp(8,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty sessionScope.teacher}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<script>\r\n");
          out.write("alert(\"您已登录，无需注册。\");\r\n");
          out.write("window.location.href = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/index.jsp\";\r\n");
          out.write("</script>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    }
    return false;
  }
}
