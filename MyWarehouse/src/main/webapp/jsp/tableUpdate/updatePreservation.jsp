<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Аутентификация</title>
	<!-- Bootstrap core CSS -->
    <link href="dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="css/cover.css" rel="stylesheet">
</head>
  <body>

    <div class="site-wrapper">

      <div class="site-wrapper-inner">

        <div class="cover-container">

          <div class="masthead clearfix">
            <div class="inner">
              <h3 class="masthead-brand">Информационная система движения запасов на складе</h3>
              
            </div>
          </div>

          <div class="inner cover">
            <h1 class="cover-heading">Обновление запаса</h1>
           	<body>
	<form action="controller" method="post">
		<input type="hidden" id="command" name="command" value="updatePreservation">
		<input type="hidden" name="id" value="${preservation.id}">
		<p>
			количество товара<input class="form-control" name="volume" value="${preservation.volume}">
		</p>
		секторы :<select name="sector">
			<c:forEach var="line" items="${listSector}">
				<option value="${line.id}"
					label="хранилиещ ${line.storage.name} сектор: ${line.id}"></option>
			</c:forEach>
		</select><br><br>
		<input type="submit" class="btn btn-lg btn-primary btn-block" name="отправить">  
	</form>
</body>
          <div class="mastfoot">
            <div class="inner">
              <p>Все права защищены <a href="http://logistic.com">Logistic</a>, by <a href="https://mail.ru">@Shamukov</a>.</p>
            </div>
          </div>

        </div>

      </div>

    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
  </body>
</html>