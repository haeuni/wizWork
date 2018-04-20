<%@page import="java.util.List"%>
<%@page import="LetsGetIt.EduTestProcess"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>eduTestGugudanProcess.jsp </title>
</head>
<body>
	<% 
		List<Integer> list = (List<Integer>)request.getAttribute("result");	
		
		//객체안에 리스트들을 그 크기만큼 반복문을 돌면서 값을 하나씩 출력
		for(int i=0; i<list.size(); i++) 
		{			
			out.println(list.get(i));
		}
	%>
	
	<!-- 결과 값을 출력 	
	request.getAttribute("")
	-->
</body>
</html>