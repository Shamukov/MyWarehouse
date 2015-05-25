<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/style.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Theme Templ</title>

    <link href="dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="dist/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="ccs/theme.css" rel="stylesheet">

  </head>

  <body role="document">

    <!-- Fixed navbar -->
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Logistic</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="LoginController">Меню</a></li>
			<li class="active"><a href="/MyWarehouse/">Выйти</a></li>          
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container theme-showcase" role="main">

      <!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron">
        <h1>Склад</h1>
        <p>Список товаров на складе</p>
      </div>


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

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
  </body>
</html>
		
		
		