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

		<input type="hidden" name="command" value="GoodsPersist">

		<p>
			имя<input type="text" name="definition" size="20">
		</p>
		тип товаров :<select name="typeGoods">
			<c:forEach var="line" items="${listTypeGoods}">
				<option value="${line.id}"	label=" ${line.name} "></option>
			</c:forEach>
		</select><br>
		<br> <input type="submit" value="отправить">
	</form>
	${ resultOperation}
</body>
</html>