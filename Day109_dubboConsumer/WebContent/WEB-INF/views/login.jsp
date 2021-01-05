<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>  
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<table align="center" width=90%>
		
		<tr>
			<td>
				<form action="<%=basePath%>login.do" method="post">
					<table align="center">
						<tr>
							<td height=200></td>
						</tr>
						<tr>
							<td>用户名：</td>
							<td><input type="text" name="username"></td>
						</tr>
						<tr>
							<td>密码：</td>
							<td><input type="password" name="password"></td>
						</tr>
					
						<tr>
							<td colspan="2" align="center"><input type="submit" value="提交" />
							    &nbsp;&nbsp;<a href="<%=basePath%>jsp/regist.jsp">注册</a></td>
						</tr>
						<tr>
							<td colspan="2"><span style="color: red; font-size: 8px">${msg}</span></td>
						</tr>
					</table>
				</form>
			</td>
		</tr>
	</table>
</body>
</html>