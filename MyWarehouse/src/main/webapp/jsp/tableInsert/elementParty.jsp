<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>T</title>

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
        <h1>Добавление товара в партию</h1>
        <p>Вы перешли в раздел добавления товара. Пожалуйста заполните ниже необходимые поля</p>
      </div>
<body>
	<p align="center">Добавление товара в партию</p>
	<form action="controller" method="post">
	
		<input type="hidden" name="command" value="ElementPartyPersist">
		<p>
			количество<input type="text" class="form-control" name="number" size="20">
		</p>
		партия товаров :<select  name="partyGoods">
						<c:forEach var="line" items="${listPartyGoods}">
							<option value="${line.id}"label="поставщик: ${line.provider.name}  
							дата:${line.getDateString() }"></option>
						</c:forEach>
					</select><br><br>
		товары :<select  name="goods">
						<c:forEach var="line" items="${listGoods}">
							<option value="${line.id}"label="тип товар:${line.typeGoods.name }
							 товар:${line.definition }"></option>
						</c:forEach>
					</select><br><br>
		<input type="submit" class="btn btn-lg btn-primary btn-block" value="отправить">
	</form>
	${ resultOperation}
</body>
    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
    <script src="../../assets/js/docs.min.js"></script>

  </body>
</html>
