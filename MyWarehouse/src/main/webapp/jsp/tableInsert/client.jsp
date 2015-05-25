<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Bootstrap</title>

    <link href="dist/css/bootstrap.min.css" rel="stylesheet">

    <link href="dist/css/bootstrap-theme.min.css" rel="stylesheet">

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
        <h1>Клиент</h1>
        <p>Вы перешли в раздел добавления клиента. Пожалуйста заполните ниже необходимые поля</p>
      </div>


      <body>
	<form action="controller" method="post">
		<input type="hidden" name="command" value="PersistClient">
		<p>
			имя<input type="text" class="form-control" name="name" size="20">
		</p>
		<p>
			счет<input type="text" class="form-control" name="score" size="20">
		</p>
		<p>
			адрес<input type="text" class="form-control" name="address" size="20">
		</p>
		
		<input type="submit" class="btn btn-lg btn-primary btn-block" value="отправить">
	</form>
	${ resultOperation}
		</body>
    </div> <!-- /container -->


    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
    </body>
</html>
