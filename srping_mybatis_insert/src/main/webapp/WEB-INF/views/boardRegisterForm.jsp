<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC
  "-//W3C//DTD HTML 4.01 Transitional//EN"
  "http://www.w3.org/TR/html4/loose.dtd" >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr"/>
<title>Home</title>

<link href="<c:url value="/resources/css/boardRegisterForm.css"/>" rel="stylesheet">

</head>
<body>
	<center>
		<h1>치우의 스프링 글쓰기</h1>
		<c:url var="insertUrl" value="/boardInsert.do" />
		<form:form commandName="boardVO" action="${insertUrl}" name="boardVO" method="post">
		<table border=0 cellspacing=0 cellpadding=0 width=800>
			<tbody>
				<tr>
				   <th class=header height=20 width=80>이름</th>
				   <td class=view valign=middle>
				   		<form:input path="name" style="height:20px;width:99.5%;border:0px"
				    	id="name" maxlength="10" autocomplete="off"/>
				   </td>
				</tr>
				<tr>
				   <th class=header valign=middle height=20>제목</th>
				   <td class=view valign=middle>
				   		<form:input path="title" id="title" style="height:20px;width:99.5%;border:0px"
				   		 maxlength="20" autocomplete="off"/>
				   </td>
				</tr>
				<tr>
				   <th class=header_bot valign=top >내용</th>
				   <td class=view_bot valign=middle>
				   		<form:textarea path="content" style="height:99%;width:99.2%;resize: none;border:0px"
				   		 id="content" autocomplete="off"/>
				   </td>
				</tr>
			</tbody>
		</table>		
		<table width=800>
			<tr>
				<td width=20%>[<a style='font-size:15px;' 
					href="<c:url value='/pagingTest.do?page=${page}' />">취소</a>]
				</td>
				<td width=80% align=right>
					[<input type="submit" style='border:0; color:blue;
					background-color:white; font-size:15px; cursor:pointer;
					width:30px; margin:0px; padding:0px'
					 value="완료" />]
				</td>
			</tr>
		</table>
		</form:form>
	</center>
</body>
</html>
