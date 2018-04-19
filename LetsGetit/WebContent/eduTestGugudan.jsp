<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>eduTestGugudan.jsp</title>
</head>
<body>
	<form method="post" action="/LetsGetIt/EduTestGugudan">
		
		<!-- 3. 원하는 구구단 단수를 받을 입력 폼 3개와 버튼 -->
		첫번째 : <input type="text" name="dan1"><br><br>
		두번째 : <input type="text" name="dan2"><br><br>
		세번째 : <input type="text" name="dan3"><br><br>
		
		<input type="submit" value="전송">
	</form>
</body>
</html>