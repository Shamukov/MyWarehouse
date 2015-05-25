<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>trap</title>

    <link href="dist/css/bootstrap.min.css" rel="stylesheet">

    <link href="css/carousel.css" rel="stylesheet">
  </head>
<!-- NAVBAR
================================================== -->
  <body>
    <div class="navbar-wrapper">
      <div class="container">

        <nav class="navbar navbar-inverse navbar-static-top">
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
            </div>
          </div>
        </nav>

      </div>
    </div>

    <div class="container marketing" style="margin-top: 10%">

 
      <div class="row">
        <div class="col-lg-4">
          <img class="img-circle" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image" width="140" height="140">
          <h2>Товары</h2>
          <p>Просмотр товара</p>
          <form action="controller" method="post" >
          <input type="hidden" name="command" value="showTable">
          <input type="hidden" name="nameEntity" value="Goods">
          <p><input class="btn btn-default" type="submit" value="Начать &raquo"></p>
          </form>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image" width="140" height="140">
          <h2>Склад</h2>
          <p>Просмотр секторов склада</p>
          <form action="controller" method="post" >
          <input type="hidden" name="command" value="showTable">
          <input type="hidden" name="nameEntity" value="Preservation">
          <p><input class="btn btn-default" type="submit" value="Начать &raquo"></p>
          </form>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image" width="140" height="140">
          <h2>Клиенты</h2>
          <p>Добавьте клиентов если его нет в списках</p>
          <form action="controller" method="post" >
          <input type="hidden" name="command" value="showClient">
          <input type="hidden" name="nameEntity" value="Client">
          <p><input class="btn btn-default" type="submit" value="Начать &raquo"></p>
          </form>
        </div><!-- /.col-lg-4 -->
		<div class="col-lg-4">
          <img class="img-circle" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image" width="140" height="140">
          <h2>Заказ</h2>
          <p>Добавление даты заказа</p>
          <form action="controller" method="post" >
          <input type="hidden" name="command" value="showOrderGoods">
          <input type="hidden" name="nameEntity" value="OrderGoods">
          <p><input class="btn btn-default" type="submit" value="Начать &raquo"></p>
          </form>
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->

	

      <hr class="featurette-divider">

      <footer>
        <p>&copy; 2015 Logistic, Inc. &middot;</p>
      </footer>

    </div><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="../../assets/js/vendor/holder.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
