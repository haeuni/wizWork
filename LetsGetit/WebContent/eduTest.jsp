<%@page import="java.util.Set"%>
<%@page import="java.util.Iterator"%>
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
	<h1>List에 담긴 값을 하나씩 출력</h1>
	<% 
		//eduTestServlet으로부터 담긴 list의 를 넘겨받아 객체를 생성
		List<Integer> list = (List<Integer>)request.getAttribute("eduTestServlet");	
		
		//객체안에 리스트들을 그 크기만큼 반복문을 돌면서 값을 하나씩 출력
		for(int i=0; i<list.size(); i++) 
		{			
			out.println(list.get(i));
		}
	%>
	
	 <h1>Map에 담은 값을 출력</h1>
	 <% 
		  HashMap<String,Integer> hash = (HashMap<String,Integer>)request.getAttribute("eduHash");
	 	
		  Set key = hash.keySet();
		  
		  for (Iterator iterator = key.iterator(); iterator.hasNext();) {
		                   String keyName = (String) iterator.next();
		                   int valueName = (Integer) hash.get(keyName);
		   
		                   System.out.println(keyName +" = " +valueName);
		  	}
		
		// map에 저장된 값을 불러오기
		out.println("1~55의 합: " + hash.get("sum"));
		%><br>
		<%
		out.println("1~20의 곱: " + hash.get("gop"));
		%><br>
		<%
		out.println("1~100중에 홀수 개수: " + hash.get("holcnt"));
		%>
	</body>
</html>