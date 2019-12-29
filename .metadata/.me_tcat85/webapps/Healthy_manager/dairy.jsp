<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/header.jsp"%>
<%@ include file="./tool/kindeditor/editor.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>教师健康日志</title>
		<script type="text/javascript" src="${url}/js/calendar.js"></script>
		<c:if test="${empty sessionScope.teacher}">
		<script>
		alert("请先登录！");
		window.location.href = "${url}/index.jsp";
		</script>
		</c:if>
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"5635",secure:"5644"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
	<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-13" data-genuitec-path="/Healthy_manager/WebRoot/dairy.jsp">
		<div id="main" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-13" data-genuitec-path="/Healthy_manager/WebRoot/dairy.jsp">
			<div id="header">
				<div id="top">
					<div style="padding-top: 143px">
						<div id="menu11" class="menu11">
							<ul>

								<li>
									<a href="${url}/notice/show!show">主页</a>
								</li>
								<li>
									<a href="${url}/exam/find!find">教师体检管理</a>
								</li>
								<li>
									<a href="${url}/sick.jsp">疾病精确评估</a>
								</li>
								<li >
									<a href="${url}/food.jsp">教师饮食管理</a>
								</li>
								<li id="selected">
									教师健康日志
								</li>

							</ul>
						</div>
					</div>
				</div>
				<br />
				<div id="locate">
					&nbsp;&nbsp;当前位置>>首页>>教师健康日志
				</div>
			</div>
			<div id="content">
				<div id="shang" style="padding-top: 70px">
			
					<form id="eform"  action="${url}/dairy/add!add" method="post">
						<script>
						var c = new Calendar("c");
						document.write(c);
						</script>
						<font style="font-size: 24px;font-weight: bold;">我的健康日志</font><br/><br/>
						<div>
						记录时间:
						<input type="text" id="date" name="dairy.datetime"  onfocus="c.show(this);" value="${dairy.datetime}" readonly="readonly" size="12"/>
						<a href="${url}/dairy/find!find?day=" onclick="this.href+=date.value">查询</a>
						<br/><br/>
						<textarea id="text" name="dairy.text" style="width: 95%; height: 200px; visibility: hidden;">${dairy.text}</textarea>
						<br><br/>
						睡眠：<input type="text" name="dairy.sleephour" value="${dairy.sleephour}" size="4">小时&nbsp;&nbsp;&nbsp;&nbsp;
						心情：<input type="text" name="dairy.mood" value="${dairy.mood}" size="4">&nbsp;&nbsp;&nbsp;&nbsp;
						抽烟：<input type="text" name="dairy.cigarette" value="${dairy.cigarette}" size="4">根&nbsp;&nbsp;&nbsp;&nbsp;
						体重：<input type="text" name="dairy.weight" value="${dairy.weight}" size="4">kg&nbsp;&nbsp;&nbsp;&nbsp;
						压力：<input type="text" name="dairy.pressure" value="${dairy.pressure}" size="4">&nbsp;&nbsp;&nbsp;&nbsp;
						血压：
						高<input type="text" name="dairy.bpHigh" value="${dairy.bpHigh}" size="4">
						低<input type="text" name="dairy.bpLow" value="${dairy.bpLow}" size="4">&nbsp;&nbsp;&nbsp;&nbsp;
						血糖:<input type="text" name="dairy.bs" value="${dairy.bs}" size="4"><br><br><br>
						</div>
						<font style="font-size: 18px;color: #345234;float: left;">选择你一天所吃的食物:</font>
						<br><br>
						<table>
						<c:forEach items="${foodList}" var="f" varStatus="n">
						<c:if test="${n.count%11==0}">
						<tr>
						</c:if>
							<td>
							<input type="checkbox" name="foodSelect" value="${f.id}" >${f.name}
							</td>
						<c:if test="${n.count%11==10}">
						<tr>
						</c:if>
						</c:forEach>
						</table>
						<input type="submit" value="记录"/> 	
						</form>
				</div>

				<div id="xia">
	
				


				</div>
			</div>

			<div id="footer">
				<div id="copyright">
					<div id="copy">
						<p>
							<font size=3px; color=#666666;> CopyRight&copy; 湖南理工学院</font>
						</p>

					</div>
				</div>
				<div id="bgbottom"></div>
			</div>

		</div>

	</body>
</html>
