<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String inputDan1 = request.getParameter("dan1");
		String inputDan2 = request.getParameter("dan2");
		String inputDan3 = request.getParameter("dan3");
		
		int dan1 = Integer.parseInt(inputDan1);
		int dan2 = Integer.parseInt(inputDan2);
		int dan3 = Integer.parseInt(inputDan3);
		
		if(dan1 >1 && dan1 <10){
			for(int i=1; i<=9; i++){
		%>
			<%=dan1 %> * <%=i %> = <%=dan1*i %><br>
		<%
			}			
		}
					
	    if(dan2 >1 && dan2 <10){
			for(int i=1; i<=9; i++){
		%>
			<%=dan2 %> * <%=i %> = <%=dan2*i %><br>
		<%
			}			
		}
		
		if(dan3 >1 && dan3 <10){
			for(int i=1; i<=9; i++){
		%>
			<%=dan3 %> * <%=i %> = <%=dan3*i %><br>
		<%
			}			
		}		
	%>
</body>
</html>