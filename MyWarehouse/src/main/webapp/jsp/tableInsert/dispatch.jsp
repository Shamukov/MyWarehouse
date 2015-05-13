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
	<form action="controller">
		<input type="hidden" name="command" value="Dispatch"> новый заказ<br>
		<br> количество:<input type="text" name="number"><br>
		<br> покупатель и номер заказа:<br>
		<select name="orderGoods">
			<c:forEach var="line" items="${listOrderGoods}">
				<option value="${line.id}"
					label="имя: ${line.client.name} дата: ${line.getDateString() }"></option>
			</c:forEach>
		</select><br> <br> товар :<br>
		<select name="preservation">
			<c:forEach var="line" items="${listPreservation}">
				<option value="${line.id}"
					label="хранилище: ${line.sector_Storage.name} сектор: ${line.sector.id}
							 тип: ${line.elementParty_Goods_TypeGoods.name } товар: ${line.elementParty_Goods.definition } 
							 количество:${line.volume} "></option>
			</c:forEach>
		</select><br> <input type="submit" name="добавить">
	</form>
	${resultOperation }

</body>
</html>