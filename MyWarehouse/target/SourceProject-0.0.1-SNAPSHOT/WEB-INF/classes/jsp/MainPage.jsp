<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h5>система учета товара</h5>

<form action="controller">
<input type="hidden" name="command" value="SHOWALLENTITY">
<input type="submit" value="учет товара">
</form>
<br>
<form action="controller">
<input type="hidden" name="command" value="ShowPersistEntity">
<input type="submit" value="приём товара">
</form>
<br>
<form action="controller">
<input type="hidden" name="command" value="ShowDispatch">
<input type="submit" value="отправка товара">
</form> 
</body>
</html>