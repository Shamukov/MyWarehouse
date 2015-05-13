<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="controller" method="post">
	
		<input type="hidden" name="command" value="ProviderPersist">
		<p>
			имя<input type="text" name="name" size="20">
		</p>
		<p>
			описание<input type="text" name="definition" size="20">
		</p>
		<p>
			счет<input type="text" name="score" size="20">
		</p>
		<p>
			адрес<input type="text" name="address" size="20">
		</p>
		
		<input type="submit" value="отправить">
	</form>
	${ resultOperation}
</body>
</html>