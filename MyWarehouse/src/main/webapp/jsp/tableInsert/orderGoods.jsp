<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>order goods</title>
</head>
<body>
<p align="center">создает заказ для клиента <br>
		например дата формата:12, 2, 2015<br>
		и выбираем заказчика</p>
	<form action="controller" method="post">

		<input type="hidden" name="command" value="orderGoodsPersist">

		<p>
			дата заказа<input type="text" name="orderDate" size="20">
		</p>
		список клиентов :<select name="client">
			<c:forEach var="line" items="${listClient}">
				<option value="${line.id}"
					label=" ${line.name} "></option>
			</c:forEach>
		</select><br>
		<br> <input type="submit" value="отправить">
	</form>
	${ resultOperation}
</body>
</html>