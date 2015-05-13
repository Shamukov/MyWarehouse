<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/style.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show Client</title>

</head>
<body>
	<h5 align="center" style="text-align: center; size: 20">Show
		warehouse</h5>
	<form action="controller" method="post">
		<input type="hidden" id="command" name="command"
			value="errorjavascritp">
		<table id="table">
			<tr>
				<th>номер</th>
				<th>количество</th>
				<th>поставщик</th>
				<th>товар</th>
				<th>тип товара</th>
				<th>хранилище</th>
				<th>сектор</th>
				<th>удаление</th>
				<th>обновить</th>
			</tr>
			<c:forEach items="${listEntity}" var="element">

				<tr>
					<td>${i=i+1}</td>
					<td>${element.volume}</td>
					<td>${element.elementParty_PartyGoods_Provider.name}</td>
					<td>${element.elementParty_Goods.definition}</td>
					<td>${element.elementParty_Goods_TypeGoods.name}</td>
					<td>${element.sector_Storage.name}</td>
					<td>${element.sector.id}</td>
					<td><button name="delete" value="${element.id}">delete</button></td>
					<td><button name="update" value="${element.id}">update</button></td>
				</tr>
			</c:forEach>
		</table>
	</form>
	<p>сортировка</p>
	
	<form action="controller">
	<input type="hidden" id="command" name="command" value="search">
	<br>count
	<input type="text" name="count">
	<br> name
	<input type="text" name="name">
	<br>
	<input type="submit" id="sort" name="sort">
	
	</form>
	<script>
	
			var k = document.getElementsByTagName("button");
			for (var i = 0; i < k.length; i++)
				k[i].onclick = function() {
					var command = document.getElementById('command');
					if (this.name == 'delete') {
						console.log(command.value);
						command.value = "deleteEntity";
					} else if (this.name == 'update') {

						console.log(command.value);
						command.value = "showUpdatePreservation";
					}
				
		}
	
	</script>
</body>
</html>