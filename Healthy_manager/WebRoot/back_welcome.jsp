<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<STYLE>
h1 {
	margin: 0;
	padding: 40px 0 0 40px;
	color: #999898;
	font: bold 36px/ 1.2em Arial, Helvetica, sans-serif;
	text-transform: uppercase;
	letter-spacing: -2px;
	color: #999898;
	text-decoration: none;
}
h1 span {
	color: #ea5d00;
	font-size: 50px;
}
</STYLE>
<c:if test="${!empty errorMessage}">
<script type="text/javascript">
  alert('${errorMessage}');
  </script>
</c:if>
  <body>
  <h2>欢迎来到:</h2>
	<br/>
		<h1>
			&nbsp;&nbsp;<span>BJTU</span>&nbsp;健康平台后台管理
		</h1>
	</body>
</html>
