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
		<input type="hidden" name="command" value="PreservationPersist"> добавить новый
		товары на складе<br><br>
		количество:<input type="text" name="volume"><br><br>

	
		элемент поставки :<select  name="elementParty">
						<c:forEach var="line" items="${listElementParty}">
							<option value="${line.id}"label=" количество товар: ${line.number} поставщик: ${line.partyGoods_Provider.name } 
							тип товар: ${line.goods_TypeGoods.name } товар: ${line.goods.definition }"></option>
						</c:forEach>
					</select><br><br>
		секторы :<select  name="sector">
						<c:forEach var="line" items="${listSector}">
							<option value="${line.id}"label="хранилище: ${line.storage.name} сектор: ${line.id}"></option>
						</c:forEach>
					</select><br>
		<input type="submit" name="добавить">
	</form>
	${resultOperation }

</body>
</html>