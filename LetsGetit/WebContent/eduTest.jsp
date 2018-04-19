<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>eduTest.jsp</title>
</head>
<body>
	<h3>List</h3>
	<%
		List<Integer> list = (List<Integer>)request.getAttribute("eduTestServlet");	
		
		for(int i=0; i<list.size(); i++) 
		{			
			out.println(list.get(i));
			//out.println(i);
		}
	%>		
	
	 <h3>Map</h3>
	 <%
		HashMap<String,Integer> hash = (HashMap<String,Integer>)request.getAttribute("eduHash");
				
		//map에 저장된 값을 불러오기
		out.println("1~55의 합: " + hash.get("합"));
		out.println("1~20의 곱: " + hash.get("곱"));
		out.println("1~100중에 홀수 개수: " + hash.get("홀"));
	 %>
	</body>
</html>