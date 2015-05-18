<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

    <title>Меню</title>
    <!-- Bootstrap core CSS -->
    <link href="dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="css/jumbotron.css" rel="stylesheet">

  </head>
<body>

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
        
      </div>
    </nav>

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <form action="controller" method="get">
    <input type="hidden" id="command" name="command" value="showReports">
    <div class="jumbotron">
      <div class="container">
        <h1>Уважаемый, пользователь!</h1>
        <p>Ознакомьтесь с отчетностью отгруженных товаров, а также информацией о наших клиентах</p>
        <p><a class="btn btn-primary btn-lg" href="controller?command=showReports" role="button">Посмотреть &raquo;</a></p>
      </div>
    </div>
    </form>

    <div class="container">
      <!-- Example row of columns -->
      <div class="row">
        <div class="col-md-4">
          <h2>Приемка товара</h2>
          <p>Началом складской обработки является приемка товаров от поставщиков.</p>
          <p><a class="btn btn-default" href="controller?command=ShowPersistEntity" role="button">Начать &raquo;</a></p>
        </div>
        <div class="col-md-4">
          <h2>Учет товара</h2>
          <p>Введение учета товара на складе </a></p>
		  <p><a class="btn btn-default" href="controller?command=SHOWALLENTITY" role="button">Начать &raquo;</a></p>
       </div>
        <div class="col-md-4">
          <h2>Отправка товара</h2>
          <p>Отправка товара нашим проверенным клиентам</p>
          <p><a class="btn btn-default" href="controller?command=ShowDispatch" role="button">Начать &raquo;</a></p>
        </div> 
      </div>

      <hr>

      <footer>
        <p>&copy; Logistic 2014 by Shamukov</p>
      </footer>
    </div> <!-- /container -->

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="../../dist/js/bootstrap.min.js"></script>
  </body>
</html>



