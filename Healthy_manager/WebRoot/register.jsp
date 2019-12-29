<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/header.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>新用户注册</title>
		<c:if test="${!empty sessionScope.teacher}">
			<script>
alert("您已登录，无需注册。");
window.location.href = "${url}/index.jsp";
</script>
		</c:if>
<script src="${url}/js/base.js" type="text/javascript"></script>
<script src="${url}/js/common.js" type="text/javascript"></script>
	</head>
	<body>
		<div id="main">
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
								<li>
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
					&nbsp;&nbsp;当前位置>>首页>>用户注册
				</div>
			</div>

			<div align="center" id="content">
				<br />
				<br />
				<div id="center">

					<div id="ltd">
						<h2>
							<FONT color=#333>新用户注册</FONT>
						</h2>
						<TABLE cellSpacing=0 cellPadding=0 border=0>
							<TR>
								<TD width="100%">
									<FORM onSubmit="return validateRegisterForm();" action="${url}/teacher/add!add" method="post">
										<TABLE width="100%">
											<thead>
												<TR>
													<TH colSpan=3>
														<font face="Arial, Helvetica, sans-serif"><b>
																请填写个人资料：（注意带有<FONT color=#ff0000>*</FONT>的项目必须填写）</b>
														</font>
													</TH>
												</TR>
											</thead>
											<TBODY>
												<TR>
													<TH width="25%">
														<DIV align="right">
															<FONT color=#ff0000>*</FONT>登录账户：
														</DIV>
													</TH>
													<TD width="30%">
														<INPUT maxLength=14 name="teacher.name" id="nickName" style="width: 200px">
													</TD>
													<TH width="45%">
														<FONT color=#999999>昵称可使用长度为0-16的任何字符</FONT>
													</TH>
												</TR>
												<TR>
													<TH>
														<DIV align="right">
															<FONT color=#ff0000>*</FONT> 登录密码：
														</DIV>
													</TH>
													<TD>
														<INPUT type=password maxLength=14 style="width: 200px"
															name="teacher.password" id="passwd">
													</TD>
													<TH>
														<FONT color=#999999>密码可使用长度为6-14的任何字符，并区分英文字母大小写</FONT>
													</TH>
												</TR>
												<TR>
													<TH>
														<DIV align=right>
															<FONT color=#ff0000>*</FONT>密码确认：
														</DIV>
													</TH>
													<TD>
														<INPUT type=password maxLength=14 style="width: 200px"
															name="" id="passwdre"/>
													</TD>
													<TH>
														<FONT color=#999999>请再输入一次密码</FONT>
													</TH>
												</TR>
												<TR>
													<TH width="25%">
														<DIV align="right">
															<FONT color=#ff0000>*</FONT>真实姓名：
														</DIV>
													</TH>
													<TD width="30%">
														<INPUT maxLength=14 name="teacher.realname" id="realName" style="width: 200px">
													</TD>
													<TH width="45%">
														<FONT color=#999999>真实姓名为2-4个汉字</FONT>
													</TH>
												</TR>
												<TR>
													<TH>
														<DIV align=right>
															<FONT color=#ff0000>*</FONT>电子邮箱：
														</DIV>
													</TH>
													<TD>
														<INPUT maxLength=30 style="width: 200px" name="teacher.email" id="email" />
													</TD>
													<TH>
														<FONT color=#999999>请输入您常用的其它电子邮箱</FONT>
													</TH>
												</TR>
												<TR>
													<TH>
														<DIV align=right>
															<FONT color=#ff0000>*</FONT> 找回密码问题：
														</DIV>
													</TH>
													<TD>
														<INPUT style="width: 200px" name="teacher.question" id="passwdQuestion"/>
													</TD>
													<TH>
														<FONT color=#999999>例如：我的专业是？</FONT>
													</TH>
												</TR>
												<TR>
													<TH>
														<DIV align=right>
															<FONT color=#ff0000>*</FONT> 密保问题答案：
														</DIV>
													</TH>
													<TD>
														<INPUT style="width: 200px" name="teacher.answer" id="passwdAnswer"/>
													</TD>
													<TH>
														<FONT color=#999999>
													</TH>
												</TR>
												<TR>
													<TH>
														<DIV align=right>
															<FONT color=#ff0000>*</FONT> 性别：
														</DIV>
													</TH>
													<TD>
														<INPUT type=radio CHECKED value="男" name="teacher.sex" />
														男
														<INPUT type=radio value="女" name="teacher.sex" />
														女
													</TD>
													<TH>
														&nbsp;
													</TH>
												</TR>
												<TR>
													<TH>
														<DIV align=right>
															<FONT color=#ff0000>*</FONT>年龄：
														</DIV>
													</TH>
													<TD>
														<INPUT style="width: 200px" name="teacher.age" />
													</TD>
													<TH>
														<FONT color=#999999>请输入年龄（必须为数字）</FONT>
													</TH>
												</TR>
												<TR>
													<TH>
														<DIV align=right>
															<FONT color=#ff0000>*</FONT>联系电话：
														</DIV>
													</TH>
													<TD>
														<INPUT style="width: 200px" name="teacher.phone" />
													</TD>
													<TH>
														<FONT color=#999999>请输入真实的电话，以便我们与您联系</FONT>
													</TH>
												</TR>
												<tfoot>
													<TR>
														<TD colSpan=3>
															<DIV align=center>
																<INPUT style="CURSOR: hand" type=submit value=提交 />
																&nbsp;&nbsp;
																<INPUT style="CURSOR: hand" type=reset value=重置 />
															</DIV>
														</TD>
													</TR>
												</tfoot>
										</TABLE>
									</FORM>
								</TD>
							</TR>
						</TABLE>
					</div>
				</div>

				<div class="clear"></div>

			</div>

			<div id="footer">
				<div id="copyright">
					<div id="copy">
						<p>
							<font size=3px; color=#666666;> CopyRight&copy; 北京交通大学</font>
						</p>

					</div>
				</div>
				<div id="bgbottom"></div>
			</div>

		</div>
		</div>
	</body>
</html>
