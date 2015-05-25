<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Склад</title>

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
        <h1>Добавление партии в зону хранения</h1>
        <p>Вы перешли в раздел добавления партии на склад. Пожалуйста заполните ниже необходимые поля</p>
      </div>


      <body>
	<form action="controller">
		<input type="hidden" name="command" value="PreservationPersist"> добавить новый
		товары на складе<br><br>
		количество:<input type="text" class="form-control" name="volume"><br><br>

	
		элемент поставки :<select  name="elementParty">
						<c:forEach var="line" items="${listElementParty}">
							<option value="${line.id}"label=" количество товар: ${line.number} поставщик: ${line.partyGoods_Provider.name } 
							тип товар: ${line.goods_TypeGoods.name } товар: ${line.goods.definition }"></option>
						</c:forEach>
					</select><br><br>
		секторы :<select  name="sector">
						<c:forEach var="line" items="${listSector}">
							<option value="${line.id}"label="хранилище: ${line.storage.name} сектор: ${line.id}"></option>
						</c:forEach>
					</select><br>
		<input type="submit"  class="btn btn-lg btn-primary btn-block" name="добавить">
	</form>
	${resultOperation }

</body>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
    <script src="../../assets/js/docs.min.js"></script>

  </body>
</html>
