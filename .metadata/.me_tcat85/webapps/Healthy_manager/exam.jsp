<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/header.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>教师体检管理</title>
<style type="text/css">
#shang td{
color: #8B0000;
font-size: 12px;
text-align: center;
width: 5%;
background-color: #ccc
}

</style>
<c:if test="${empty sessionScope.teacher}">
	<script>
		alert("请先登录！");
		window.location.href = "${url}/index.jsp";
	</script>
</c:if>
<script type="text/javascript" src="${url}/js/highcharts.js">
	
</script>
<script type="text/javascript">
	$(function() {
		$.ajax({
			type : 'POST',
			dataType : 'JSON',
			url : '${url}/json/highcharts!show',
			success : function(result) {
				lineChart(result);
			}
		});
	});
	function lineChart(result) {
		$('#container').highcharts({
			title : {
				text : '血压曲线走势图',
				x : -20
			//center
			},
			xAxis : {
				categories : result[0]
			},
			yAxis : {
				title : {
					text : '毫米汞柱：mmHg'
				},
				plotLines : [ {
					value : 0,
					width : 1,
					color : '#808080'
				} ]
			},
			tooltip : {
				valueSuffix : 'mmHg'
			},
			legend : {
				layout : 'vertical',
				align : 'right',
				verticalAlign : 'middle',
				borderWidth : 0
			},
			series : result[1]
		});
	}
</script>
<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"5635",secure:"5644"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-15" data-genuitec-path="/Healthy_manager/WebRoot/exam.jsp">
	<div id="main" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-15" data-genuitec-path="/Healthy_manager/WebRoot/exam.jsp">
		<div id="header">
			<div id="top">
				<div style="padding-top: 143px">
					<div id="menu11" class="menu11">
						<ul>

							<li><a href="${url}/notice/show!show">主页</a></li>
							<li id="selected">教师体检管理</li>
							<li><a href="${url}/sick.jsp">疾病精确评估</a></li>
							<li><a href="${url}/food.jsp">教师饮食管理</a></li>
							<li><a href="${url}/dairy/find!find?day=${date}">教师健康日志</a>
							</li>

						</ul>
					</div>
				</div>
			</div>
			<br />
			<div id="locate">&nbsp;&nbsp;当前位置>>首页>>教师体检管理</div>
		</div>
		<div id="content">
			<div id="shang" style="padding-top: 70px">
				<h1>体检记录</h1>
				<table>
					<tr >
						<td width="25%" style="color: #000">体检时间</td>
						<td style="color: #000">舒张压</td>
						<td style="color: #000">收缩压</td>
						<td style="color: #000">体重指数</td>
						<td style="color: #000">腰臀比</td>
						<td style="color: #000">尿素</td>
						<td style="color: #000">尿酸</td>
						<td style="color: #000">肌酐</td>
						<td style="color: #000">甘油三酯</td>
						<td style="color: #000">胆固醇</td>
						<td style="color: #000">高密度脂蛋白胆固醇</td>
						<td style="color: #000">低密度脂蛋白胆固醇</td>
						<td style="color: #000">葡萄糖</td>
						<td style="color: #000">同型半膀胱氨酸</td>
						<td style="color: #000">微量白蛋白</td>
						<td style="color: #000">微量白蛋白/尿肌酐</td>
					</tr>
					<c:forEach items="${examList}" var="e">
						<tr>
							<td><fmt:formatDate value="${e.datetime}"
									pattern="yyyy/MM/dd" /></td>
							<td>${e.sbp}</td>
							<td>${e.dbp}</td>
							<td>${e.bmi}</td>
							<td>${e.whr}</td>
							<td>${e.bun}</td>
							<td>${e.ua}</td>
							<td>${e.crea}</td>
							<td>${e.tg}</td>
							<td>${e.chol}</td>
							<td>${e.hdl}</td>
							<td>${e.ldl}</td>
							<td>${e.glu}</td>
							<td>${e.hcy}</td>
							<td>${e.m_alb}</td>
							<td>${e.m_alb_crea}</td>
						</tr>
					</c:forEach>
				</table>
			</div>

			<div id="xia" style="padding-top: 50px">
				<div id="container" style="min-width: 700px; height: 300px ;"></div>
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
