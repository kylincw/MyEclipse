<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/header.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>疾病精确评估</title>
		<c:if test="${empty sessionScope.teacher}">
		<script>
		alert("请先登录！");
		window.location.href = "${url}/index.jsp";
		</script>
		</c:if>
	<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"5635",secure:"5644"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
	<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-21" data-genuitec-path="/Healthy_manager/WebRoot/sick.jsp">
		<div id="main" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-21" data-genuitec-path="/Healthy_manager/WebRoot/sick.jsp">
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
								<li id="selected">
									疾病精确评估
								</li>
								<li >
									<a href="${url}/food.jsp">教师饮食管理</a>
								</li>
								<li>
									<a href="${url}/dairy/find!find?day=${date}">教师健康日志</a>
								</li>

							</ul>
						</div>
					</div>
				</div>
				<br />
				<div id="locate">
					&nbsp;&nbsp;当前位置>>首页>>疾病精确评估
				</div>
			</div>
			<div id="content">
				<div id="shang" style="padding-top: 70px;">
					<form action="${url}/sick/evaluate" method="post">
					<table width="100%;">
					<tr>
						<td colspan="2" style="text-align: left;">请填写以下信息：</td>
					</tr>
					<tr>
						<td style="text-align: right;">收缩压：</td>
						<td><input type="text" name="bpHigh" size="10" >mmHg</td>
					</tr>
					<tr>
						<td style="text-align: right;">舒张压：</td>
						<td><input type="text" name="bpLow"  size="10">mmHg</td>
					</tr>
					<tr>
						<td style="text-align: right;">心率：</td>
						<td><input type="text" name="bs"  size="10"></td>
					</tr>
					<tr>
						<td style="text-align: right;">高血压既往史：</td>
						<td><input type="radio" name="historyHypertension" value="true">有<input type="radio" name="historyHypertension" value="false" checked="checked">无</td>
					</tr>
					<tr>
						<td style="text-align: right;">高血压家族史:</td>
						<td><input type="radio" name="historyFamilyHypertension" value="true">有<input type="radio" name="historyFamilyHypertension" value="false" checked="checked">无</td>
					</tr>
					<tr>
						<td style="text-align: right;">吸烟史：</td>
						<td><input type="radio" name="historySmoking" value="true">有<input type="radio" name="historySmoking" value="false">无</td>
					</tr>
					<tr>
						<td style="text-align: right;">体育锻炼：</td>
						<td><input type="radio" name="exerciseGroup" value="0">从不<input type="radio" name="exerciseGroup" value="1" checked="checked">一周＜3次<input type="radio" name="exerciseGroup" value="2">一周≥3次</td>
					</tr>
					<tr>
						<td style="text-align: right;">年龄：</td>
						<td><input type="radio" name="ageGroup" value="0">0-20<input type="radio" name="ageGroup" value="1" checked="checked">21-40
						<input type="radio" name="ageGroup" value="2">41-60<input type="radio" name="ageGroup" value="3">60以上</td>
					</tr>
					<tr>
						<td colspan="2" style="text-align:center;"><input type="submit" value="预测评估"></td>
					</tr>
					</table>	
					</form>
				</div>
				
				<div id="xia">
				<c:if test="${!empty result}">
				您患有高血压的可能性 32%<br/>
				<c:if test="${result>90}">
				高血压预防建议：<br/>
				1、不吸烟、少饮酒；<br/>
				2、控制饮食、防止肥胖；<br/>
				3、低盐饮食、多食蔬菜；<br/>
				4、适度锻炼、睡眠充足；<br/>
				5、保持情绪稳定、乐观。<br/>
				</c:if>
				</c:if>
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
