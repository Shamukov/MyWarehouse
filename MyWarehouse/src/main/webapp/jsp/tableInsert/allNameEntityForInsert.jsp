<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Прием товара</title>
    <link href="dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="сss/carousel.css" rel="stylesheet">
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
                <li><a href="/MyWarehouse/">Выйти</a></li>
               
              </ul>
            </div>
          </div>
        </nav>

      </div>
    </div>

    <div class="container marketing" >

      <!-- Three columns of text below the carousel -->
      <div class="row">
        <div class="col-lg-4">
          <img class="img-circle" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image" width="140" height="140">
          <h2>Тип товара</h2>
          <p>Укажите тип принятого товара</p>
          <form action="controller" method="post" >
          <input type="hidden" name="command" value="showTypeGoods">
          <input type="hidden" name="nameEntity" value="TypeGoods" >
          <p><input class="btn btn-default" type="submit" value="Начать &raquo"></p>
          </form>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image" width="140" height="140">
          <h2>Товар</h2>
          <p>Укажите название и тип товара</p>
          <form action="controller" method="post" >
          <input type="hidden" name="command" value="showGoods" >
          <input type="hidden" value="Goods" value="Goods">
          <p><input class="btn btn-default" type="submit" value="Начать &raquo"></p>
          </form>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image" width="140" height="140">
          <h2>Поставщик</h2>
          <p>Добавьте поставщика если его нет в списках</p>
          <form action="controller" method="post" >
          <input type="hidden" name="command" value="showProvider" >
          <input type="hidden" name="nameEntity" value="Provider" >
          <p><input class="btn btn-default" type="submit" value="Начать &raquo"></p>
          </form>
        </div><!-- /.col-lg-4 -->
		<div class="col-lg-4">
          <img class="img-circle" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image" width="140" height="140">
          <h2>Добавление товара в партию</h2>
          <p>Укажите кол-во принятых товаров</p>
          <form action="controller" method="post" >
          <input type="hidden" name="command" value="showElementParty" >
          <input type="hidden" name="nameEntity" value="ElementParty" >
          <p><input class="btn btn-default" type="submit" value="Начать &raquo"></p>
          </form>
        </div><!-- /.col-lg-4 -->
		<div class="col-lg-4">
          <img class="img-circle" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image" width="140" height="140">
          <h2>Добавление на склад</h2>
          <p>выберите зону хранения</p>
          <form action="controller" method="post" >
          <input type="hidden" name="command" value="showPreservation" >
          <input type="hidden" name="nameEntity" value="Preservation" >
          <p><input class="btn btn-default" type="submit" value="Начать &raquo"></p>
          </form>
          </div><!-- /.col-lg-4 -->
		<div class="col-lg-4">
          <img class="img-circle" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image" width="140" height="140">
          <h2>Дата поставки</h2>
          <p>выберите дату поставки</p>
          <form action="controller" method="post" >
          <input type="hidden" name="command" value="showPartyGoods" >
          <input type="hidden" name="nameEntity" value="PartyGoods" >
          <p><input class="btn btn-default" type="submit" value="Начать &raquo"></p>
          </form>
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->
</div>
	

      <hr class="featurette-divider">

      <!-- /END THE FEATURETTES -->


      <!-- FOOTER -->
      <footer>
        <p>&copy; 2015 Logistic, Inc. &middot;</p>
      </footer>

    </div><!-- /.container -->

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
      </body>
</html>



<!-- <body>
	<form action="controller" method="post">
		<input type="hidden" id="command" name="command" value="showPreservation">
		<select name="nameEntity">
			
			<option value="Preservation" label="сохранения на складе"></option>			
			<option value="TypeGoods" label="тип товара"></option>

			<option value="ElementParty" label="элементы партий"></option>

			<option value="Goods" label="товары"></option>

			<option value="Provider" label="поставщики"></option>
			
			<option value="PartyGoods" label="партии поставки"></option>
		</select> <input type="submit" value="отправить">
	</form>
	<script>
		var d = document, myForm = d.forms[0], output = d
				.getElementById('nameEntity');
		myForm.nameEntity.addEventListener('change', function() {

			var start = d.getElementById("command");

			start.value = "show" + this.value;
			console.log(start);
		}, false);
	</script>
</body> -->


