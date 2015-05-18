<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/style.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Show Client</title>

    <link href="dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="dist/css/bootstrap-theme.min.css" rel="stylesheet">

    <link href="css/theme.css" rel="stylesheet">

  </head>

  <body role="document">

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
			<li class="active"><a href="index.html">Выйти</a></li>         
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container theme-showcase" role="main">

      <div class="jumbotron">
        <h1>Отчетность</h1>
        <p>Список заказов</p>
      </div>


      <div class="row">
        <div class="col-md-6">
          <table class="table" style="margin: 0 50%">
            <thead>
              <tr>
                <th>Номер</th>
				<th>Количество</th>
				<th>Клиент</th>
				<th>Поставщик</th>
				<th>Товары</th>
				<th>Тип товара</th>
				<th>Сектор</th>
				<th>Хранилище</th>
              </tr>
            </thead>
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
        </div>


    </div> <!-- /container -->

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>

  </body>
</html>
		
		
		


