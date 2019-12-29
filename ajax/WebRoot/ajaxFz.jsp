<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<!-- 声明js代码域 -->
<script type="text/javascript">
/* 
	method:
		请求方式：值为get或者post
	url：请求地址
	data：没有值传入null
		有请求数据则传入字符串数据，格式为"a=1&b=2";
	deal200:
		接受一个带有形参的js函数对象，形参接收的实参是ajax引擎对象。
	deal404：接受一个js函数对象
	deal500：接受一个js函数对象



 */
	function getData(method,url,data,async){		
		//创建ajax引擎对象
		var ajax = getAjax();
			//复写onreadystatement函数
			ajax.onreadystatechange=function(){
			//判断Ajax状态码
			if(ajax.readyState==4){
				//判断响应状态码
				if(ajax.status==200){
					//获取响应内容
					var result = ajax.responseText;
					//获取元素对象
					var showdiv=document.getElementById("showdiv");
					showdiv.innerHTML=result;
				}else if(ajax.status==404){
					//获取元素对象
					var showdiv=document.getElementById("showdiv");
					showdiv.innerHTML="请求资源不存在!";
				}else if(ajax.status==500){
					//获取元素对象
					var showdiv=document.getElementById("showdiv");
					showdiv.innerHTML="服务器繁忙!";
			}
		}else{
					//获取元素对象
					var showdiv=document.getElementById("showdiv");
					showdiv.innerHTML="<img src='img/2.gif' width='200px' height='100px'/>";
				} 
	}
		//发送请求
		if("get"==method){
			ajax.open("get",url+data==null?"":"?"+data,async);
			ajax.send(null);
		}else if("post"==method){
			ajax.open("post",url,async);
			ajax.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
			ajax.send(data);
		}
		
		
/* -------------------------------------------------------------------------------------------------------------- */

function getAjax(){
			var ajax;
			if(window.XMLHttpRequest){//火狐
				ajax=new XMLHttpRequest();
			}else if(window.ActiveXObject){//ie
				ajax=new ActiveXObject("Msxml2.XMLHTTP");
			}
		return ajax;
	}
}
</script>
<style type="text/css">
	#showdiv{
		border:solid 1px;
		width:200px;
		height:100px; 
	}
</style>
</head>
<body>
	<h3>欢迎登录403峡谷</h3>
	<hr>
	<input type="button" value="测试 " onclick="getData()"/>
	<div id="showdiv"></div>
</body>
</html>