<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>��۴��</title>
</head>
		<c:url var="insertUrl" value="/littlRepleInsert.do" />
			<form:form commandName="littleReView" action="${insertUrl}" name="littleReView" method="post">
				<table width=792 border=1 height=80>
					<tr>
						<td bgcolor=white valign=top width=10%>
							�ۼ���<br>
							<form:input path="name" type="text"/>
							<form:input path="num" type="hidden" value="${num}"/>		
						</td>
						<td bgcolor=white width=85%>
							<form:textarea path="content" style='width:99%;height:100%;resize:none' />
						</td>
						<td bgcolor=white width=5%>
							<input type=submit value="���">
						</td>						
					</tr>
				</table>
			</form:form>
<body style="background-color:#EFF7EB; padding:0px" >
		<c:forEach var="item" items="${list}">
			<table border=0 cellspacing=0 cellpadding=0 width=792>
				<tr>
					<td height=40 style='border-top:0.5px solid gray'>�ۼ��� : ${item.name}</td>
				<tr>
					<td>${item.content}</td>
				</tr>
				<tr>
					<td height=40>${item.writedate} ${item.writetime}</td>
				</tr>
			</table>
		</c:forEach>
</body>
</html>