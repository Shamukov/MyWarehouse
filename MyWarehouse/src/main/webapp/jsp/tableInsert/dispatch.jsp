<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

	<link href="dist/css/bootstrap.min.css" rel="stylesheet">
	<link href="dist/css/bootstrap-theme.min.css" rel="stylesheet">

	<!-- Custom styles for this template -->
	<link href="css/theme.css" rel="stylesheet">

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
					<li class="active"><a href="index.html">Выйти</a>
					</li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>

	<div class="container theme-showcase" role="main">

		<!-- Main jumbotron for a primary marketing message or call to action -->
		<div class="jumbotron">
			<h1>Отправка товара</h1>
			<p>Вы перешли в раздел отправки товара. Пожалуйста заполните ниже необходимые поля</p>
		</div>


		<form action="controller">
		<input type="hidden" name="command" class="form-control" value="Dispatch"> Новый заказ<br>
		<br> Количество:<input type="text" class="form-control" name="number"><br>
		<br> Покупатель и номер заказа:<br>
		<select name="orderGoods" >
			<c:forEach var="line" items="${listOrderGoods}">
				<option value="${line.id}"
					label="имя: ${line.client.name} дата: ${line.getDateString() }"></option>
			</c:forEach>
		</select><br> <br> Товар :<br>
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

			<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
			<script src="dist/js/bootstrap.min.js"></script>
			</div>
</body>

</html>
