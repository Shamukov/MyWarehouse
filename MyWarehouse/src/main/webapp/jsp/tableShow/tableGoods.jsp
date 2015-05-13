<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/style.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>

</head>
<body>
	<h5 align="center" style="text-align: center;size: 20">все товары</h5>
	<table >
		<tr>
			<th>номре</th>
			<th>имя</th>
			<th>тип</th>
		</tr>
		<c:forEach items="${listEntity}" var="element" >

			<tr>
				<td>${i=i+1}</td>
				<td>${element.definition}</td>
				<td>${element.typeGoods.name}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>