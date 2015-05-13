<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/style.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show all orders</title>

</head>
<body>
	<h5 align="center" style="text-align: center;size: 20">Show all orders</h5>
	
	<table >
		<tr>
			<th>номре</th>
			<th>количество</th>
			<th>клиент</th>
			<th>поставщик</th>
			<th>товары</th>
			<th>тип товара</th>
			<th>сектор</th>
			<th>хранилище</th>
			
		</tr>
		
		<c:forEach items="${listEntity}" var="element" >
			
			<tr>
			
				<td>${i=i+1}</td>
				<td>${element.number}</td>
				<td>${element.orderGoods_Client.name}</td>
				<td>${element.preservation_ElementParty_PartyGoods_Provider.name}</td>
				<td>${element.preservation_ElementParty_Goods.definition}</td>
				<td>${element.preservation_ElementParty_Goods_TypeGoods.name}</td>
				<td>${element.preservation_Sector.id}</td>
				<td>${element.preservation_Sector_Storage.name}</td>
				
				
			</tr>
			
		</c:forEach>
		
	</table>
</body>
</html>