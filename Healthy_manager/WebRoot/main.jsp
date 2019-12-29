<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>健康网</title>
		<script src="${url}/js/main.js" type="text/javascript">
</script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#login").click(function() {
			$("#loginform").attr("action","${url}/teacher/login!login").submit();
		});
		
	});
</script>
	</head>
	<body>
		<div id="btm">
			<div id="main">

				<div id="header">
					<div id="top"></div>
					<div>
						<h1></h1>
					</div>

					<div id="mainnav">

						<span>
							<form method="post" id="loginform">
								<table width="100%">
									<tr>
									<c:choose>
									<c:when test="${empty sessionScope.teacher}">
									<td align="right">
											<font size=2px; color=#A4A4A4>用户名</font>
											<input type="text" name="teacher.name" style="width: 80px" />
										</td>
										<td>
											<font size=2px; color=#A4A4A4>密码</font>
											<input type="password" name="teacher.password" style="width: 80px" />
										</td>
										<td><a style="cursor: pointer;">
												<img src="${url}/images/login.gif" border="0"
													id="login" /> </a>
										</td>
										<td>
											<a href="${url}/register.jsp" >
												<img src="${url}/images/reg_v2.gif" border="0"
													id="register" /> </a>
										</td>

										<td>
											<a href="${url}/register.jsp"><font size=2px; color=#990000>如何注册</font>
											</a> ｜
											<a href="${url}/back_login.jsp"> <font size=2px;
												color=#990000>后台管理</font> </a>
										</td>
									</c:when>
									<c:otherwise>
										<td align="right">
											<font size=2px; color=#A4A4A4>您好，</font>
										</td>
										<td>
										<font size=2px; color=#A4A4A4>
										 ${sessionScope.teacher.realname}&nbsp; 欢迎您。
										 </font>
										</td>
										<td>
											<a href="${url}/teacher/logout!logout" >
												<img src="${url}/images/logout.jpg" border="0"
													id="logout" /> </a>
										</td>
									</c:otherwise>
									</c:choose>
									</tr>
								</table>
							</form>
						</span>
					</div>
				</div>


				<div id="content">


					<div id="left">

						<div id="tabs0">
							<ul class="menu0" id="menu0">
								<li onmouseover="setTab(0)" class="lisovers">
									${noticeList[0].title}
								</li>
								<li onmouseover="setTab(1)">
									${noticeList[1].title}
								</li>
								<li onmouseover="setTab(2)">
									${noticeList[2].title}
								</li>
								<li onmouseover="setTab(3)">
									${noticeList[3].title}
								</li>
							</ul>
							<div class="main0" id="main0">
								<div class="block">
									<img src="${url}/${noticeList[0].imagepath}" />

									<p>
										<font size=2px; color=#2E2E2E>
											${noticeList[0].content}
										</font>
									</p>

								</div>
								<div>
									<img src="${url}/${noticeList[1].imagepath}" />

									<p>
										<font size=2px; color=#2E2E2E>
										${noticeList[1].content}
										</font>
									</p>

								</div>
								<div>
									<img src="${url}/${noticeList[2].imagepath}" />

									<p>
										<font size=2px; color=#2E2E2E>
										${noticeList[2].content}
										</font>
									</p>
								</div>
								<div>
									<img src="${url}/${noticeList[3].imagepath}" />

									<p>
										<font size=2px; color=#2E2E2E>
										${noticeList[3].content}
										</font>
									</p>
								</div>
							</div>
							<div class="clear"></div>
						</div>

						<div id="hots">
							<h2>
								<font size=5px; color=#2E2E2E>欢迎使用</font>
							</h2>
							<ul>
								<li>
									<div>
										<img src="${url}/images/a.png" />
										<a href="${url}/exam/find!find"><font size=3px; color=#01A9DB>教师体检管理</font>
										</a>
										<p>
											<font size=2px; color=#2E2E2E>用户可查询每次体检的结果。显示体检部分项目随时间变化的曲线。</font>
										</p>
									</div>
								</li>
								<li>
									<div>
										<img src="${url}/images/b.gif" />
										<a href="${url}/sick.jsp"><font size=3px;color=#548C00>疾病精确评估</font> </a>
										<p>
											<font size=2px; color=#2E2E2E>预测慢性病的风险等级，根据症状判断可能疾病，制订防范方案。</font>
										</p>
									</div>
								</li>
								<li>
									<div>
										<img src="${url}/images/c.gif" />
										<a href="${url}/food.jsp"><font size=3px;color=#FF8000>教师饮食管理</font> </a>
										<p>
											<font size=2px; color=#2E2E2E>用户输入每天的饮食，系统计算卡路里，提出修改饮食习惯的建议。</font>
										</p>
									</div>
								</li>
								<li>
									<div>
										<img src="${url}/images/d.gif" />
										<a href="${url}/dairy/find!find?day=${date}"><font size=3px; color=#B40486>教师健康日志</font>
										</a>
										<p>
											<font size=2px; color=#2E2E2E>记录食物、运动、血压、血糖、饮酒、体重、睡眠。</font>
										</p>
									</div>
								</li>
							</ul>
						</div>

					</div>

					<div id="right">
						<table width="325">
							<tr>
								<td align="left">
									<font size=4px; color=#A4A4A4> </font>
								</td>
							</tr>

						</table>
						<div id="demo">
							<div id="indemo">
								<div id="demo1">
									<a href="#"><img src="${url}/images/1.gif" border="0" width="310"
											height="210" /> </a>
									<a href="#"><img src="${url}/images/2.gif" border="0" width="310"
											height="210" /> </a>
									<a href="#"><img src="${url}/images/3.gif" border="0" width="310"
											height="210" /> </a>
									<a href="#"><img src="${url}/images/4.gif" border="0" width="310"
											height="210" /> </a>
									<a href="#"><img src="${url}/images/1.gif" border="0" width="310"
											height="210" /> </a>
									<a href="#"><img src="${url}/images/2.gif" border="0" width="310"
											height="210" /> </a>
									<a href="#"><img src="${url}/images/3.gif" border="0" width="310"
											height="210" /> </a>
									<a href="#"><img src="${url}/images/4.gif" border="0" width="310"
											height="210" /> </a>
								</div>
								<div id="demo2"></div>
							</div>
						</div>
						<br/>
						<h2>
							<font size=5px; color=#2E2E2E> 相关链接</font>
						</h2>
						<ul>
							<li>
								<a href="http://www.njtu.edu.cn/"><font size=2px; color==#A4A4A4>北京交通大学主页</font> </a>
							</li>
							<li>
								<a href="http://xyybg.cic.tsinghua.edu.cn"><font size=2px; color==#A4A4A4>清华大学校医院</font> </a>
							</li>
							<li>
								<a href="#"><font size=2px; color==#A4A4A4>北京大学校医院</font> </a>
							</li>
							<li>
								<a href="http://www.trhos.com/"><font size=2px; color==#A4A4A4>北京同仁医院</font> </a>
							</li>
							<li>
								<a href="http://www.pumch.cn/"><font size=2px; color==#A4A4A4>北京协和医院</font> </a>
							</li>


						</ul>
					</div>
					<div class="clear"></div>

				</div>

				<div id="copyright">
					<p>
						<font size=3px; color=#666666;> CopyRight&copy; 北京交通大学</font>
					</p>


				</div>

			</div>

		</div>
		</div>
	</body>
</html>