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
	<p align="center">Добавление товара в партию</p>
	<form action="controller" method="post">
	
		<input type="hidden" name="command" value="ElementPartyPersist">
		<p>
			количество<input type="text" name="number" size="20">
		</p>
		партия товаров :<select  name="partyGoods">
						<c:forEach var="line" items="${listPartyGoods}">
							<option value="${line.id}"label="поставщик: ${line.provider.name}  
							дата:${line.getDateString() }"></option>
						</c:forEach>
					</select><br><br>
		товары :<select  name="goods">
						<c:forEach var="line" items="${listGoods}">
							<option value="${line.id}"label="тип товар:${line.typeGoods.name }
							 товар:${line.definition }"></option>
						</c:forEach>
					</select><br><br>
		<input type="submit" value="отправить">
	</form>
	${ resultOperation}
</body>
</html>