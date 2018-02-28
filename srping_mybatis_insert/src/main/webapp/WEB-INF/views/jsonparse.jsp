<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
function jsonLoad(){
	var xhr = new XMLRequest();
	xhr.onload = function() {
	    if(xhr.status===200){
	    	alert("하이하이하이루");
	        responseObject = JSON.parse(xhr.responseText); //json가져와 js객체로 변경
	
	        var newContent = '';
	        for(var i=0; i<responseObject.events.length; i++) {
	            newContent += '<div class="event">';
	            newContent += '<img src"' + responseObject.events[i].location + '"';
	        }
	        document.getElementById('content').innerHTML = newContent;
	    }else{
	    	alert("에러다");
	    }
	};
	xhr.open('GET', 'data/data.json', true); //요청 준비
	xhr.send(null); //요청 전송
}
</script>
</head>
<body>
<script>alert("하이3");
jsonLoad();
</script>
gkdl
</body>
</html>