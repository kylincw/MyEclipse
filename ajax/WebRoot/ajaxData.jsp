<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>My JSP 'ajaxData.jsp' starting page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <script type="text/javascript" src="js/ajaxUtil.js"></script>
	<script type="text/javascript">
		//获取数据
			function getData(){
			
				//获取请求信息
				var name = document.getElementById("uname").value;
				//创建ajax引擎对象
				var ajax;
				if(window.XMLHttpRequest){//火狐
					ajax=new XMLHttpRequest();
				}else if(window.ActiveXObject){//ie
					ajax=new ActiveXObject("Msxml2.XMLHTTP");
				}
				
						
		//覆写onreadystatechange函数
			ajax.onreadystatechange=function(){
				//判断ajax状态码
				if(ajax.readyState==4){
					//获取响应状态码
					if(ajax.status==200){
						//获取响应内容
						var result = ajax.responseText;
						eval("var u="+result);
						//处理响应内容
							//获取table表格对象
							var ta = document.getElementById("ta");
							ta.innerHTML = "";
							//插入新的行
							var tr =  ta.insertRow(0);
							var cell0 = tr.insertCell(0);
							cell0.innerHTML = "编号";
							var cell1 = tr.insertCell(1);
							cell1.innerHTML = "名称";
							var cell2 = tr.insertCell(2);
							cell2.innerHTML = "价格";
							var cell3 = tr.insertCell(3);
							cell3.innerHTML = "位置";
							var cell4 = tr.insertCell(4);
							cell4.innerHTML = "描述";
						
						
						
							//获取table表格对象
							var ta = document.getElementById("ta");
							//插入新的行
							var tr =  ta.insertRow(1);
							var cell0 = tr.insertCell(0);
							cell0.innerHTML = u.uid;
							var cell1 = tr.insertCell(1);
							cell1.innerHTML = u.uname;
							var cell2 = tr.insertCell(2);
							cell2.innerHTML = u.price;
							var cell3 = tr.insertCell(3);
							cell3.innerHTML = u.loc;
							var cell4 = tr.insertCell(4);
							cell4.innerHTML = u.desc;
					}
	
				}			
			}
		//发送请求
		ajax.open("get", "user?name="+name);
		ajax.send(null);
		}
		//使用封装的ajax
		function getData2(){
 		var name=document.getElementById("uname").value;
 		var data="name="+name;
 		myAjax("get","user",data,function(a){
	 		//获取响应数据
				var result=a.responseText;
			//处理响应数据
					alert(result);
					eval("var u="+result);
					
						//处理响应内容
							//获取table表格对象
							var ta = document.getElementById("ta");
							ta.innerHTML = "";
							//插入新的行
							var tr =  ta.insertRow(0);
							var cell0 = tr.insertCell(0);
							cell0.innerHTML = "编号";
							var cell1 = tr.insertCell(1);
							cell1.innerHTML = "名称";
							var cell2 = tr.insertCell(2);
							cell2.innerHTML = "价格";
							var cell3 = tr.insertCell(3);
							cell3.innerHTML = "位置";
							var cell4 = tr.insertCell(4);
							cell4.innerHTML = "描述";
						
						
						
							//获取table表格对象
							var ta = document.getElementById("ta");
							//插入新的行
							var tr =  ta.insertRow(1);
							var cell0 = tr.insertCell(0);
							cell0.innerHTML = u.uid;
							var cell1 = tr.insertCell(1);
							cell1.innerHTML = u.uname;
							var cell2 = tr.insertCell(2);
							cell2.innerHTML = u.price;
							var cell3 = tr.insertCell(3);
							cell3.innerHTML = u.loc;
							var cell4 = tr.insertCell(4);
							cell4.innerHTML = u.desc;
 		});
 	}
 	
	</script>
  </head>
  
  <body>
   	<h3>欢迎访问英雄商店</h3>
   	<hr>
   	英雄名称:<input type="text" name="uname" value="" id="uname">
   	<input type="button" name="uname" value="搜索" onclick="getData2()" >
   	<table border="1px" id="ta">
   	
   	</table>
  </body>
</html>
