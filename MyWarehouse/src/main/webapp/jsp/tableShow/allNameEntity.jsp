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
	<input type="hidden" name="command" value="ShowTable">
		 <select name="nameEntity">
<%-- 				<c:forEach var="line" items="${allNameEntity}"> --%>
<%-- 					<option value="${line}" label="${line}"></option> --%>
<%-- 				</c:forEach> --%>
		<option value="Client" label="клиент"></option> 
		<option value="Preservation" label="сохранения на складе"></option> 
		<option value="Goods" label="товары"></option> 
		<option value="ElementOrderGoods" label="заказы"></option> 




			</select>
		<input type="submit" value="отправить">
	</form>
</body>
</html>