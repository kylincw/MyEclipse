<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<c:set var="url">${pageContext.request.contextPath}</c:set>
  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"5635",secure:"5644"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-14" data-genuitec-path="/Healthy_manager/WebRoot/error.jsp">
  <script type="text/javascript" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-14" data-genuitec-path="/Healthy_manager/WebRoot/error.jsp">
  alert('${errorMessage}');
  window.location.href = "${url}/index.jsp";
  </script>
 
  </body>
</html>
