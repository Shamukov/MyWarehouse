<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Template</title>

    <!-- Bootstrap core CSS -->
    <link href="dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap theme -->
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
			<li class="active"><a href="/MyWarehouse/">Выйти</a></li>        
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container theme-showcase" role="main">

      <!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron">
        <h1>Добавление даты заказа</h1>
        <p>Вы перешли в раздел добавления даты заказа для клиента. Пожалуйста заполните дату формата! Например:12, 2, 2015</p>
      </div>
	

      <body>
<p align="center">создает заказ для клиента <br>
		например дата формата:12, 2, 2015<br>
		и выбираем заказчика</p>
	<form action="controller" method="post">

		<input type="hidden" name="command" value="orderGoodsPersist">

		<p>
			дата заказа<input type="text" class="form-control" name="orderDate" size="20">
		</p>
		список клиентов :<select name="client">
			<c:forEach var="line" items="${listClient}">
				<option value="${line.id}"
					label=" ${line.name} "></option>
			</c:forEach>
		</select><br>
		<br> <input type="submit" class="btn btn-lg btn-primary btn-block" value="отправить">
	</form>
	${ resultOperation}
</body>
    </div> <!-- /container -->



    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>

  </body>
</html>
