<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Member Join Page</h1>
	<form action="./memberJoin.do" method="post">
		ID  <input type="text" name="id"><br>
		PASSWORD  <input type="password" name="pw"><br>
		NAME  <input type="text" name="name"><br>
		PHONE  <input type="tel" name="phone"><br>
		EMAIL  <input type="text" name="email"><br>
		<div>
			<button>Join</button>
		</div>
	
	</form>

</body>
</html>