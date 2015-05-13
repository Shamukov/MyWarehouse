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
	<p align="center">preservation update</p>
	<form action="controller" method="post">
		<input type="hidden" id="command" name="command" value="updatePreservation">
		<input type="hidden" name="id" value="${preservation.id}">
		<p>
			количество товара<input name="volume" value="${preservation.volume}">
		</p>
		секторы :<select name="sector">
			<c:forEach var="line" items="${listSector}">
				<option value="${line.id}"
					label="хранилиещ ${line.storage.name} сектор: ${line.id}"></option>
			</c:forEach>
		</select><br><br>
		<input type="submit" name="отправить">  
	</form>
</body>
</html>