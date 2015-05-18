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
              <h3 class="masthead-brand">Информационная система учета движения запасов на складе</h3>
              <nav>
              </nav>
            </div>
          </div>
 			<div class="inner cover">
            <h1 class="cover-heading">Если вы являетесь работником склада фирмы Logistic, введите свой логин и пароль</h1>
           <form action="LoginController" method="post">
 		<label for="inputEmail" name="command" class="sr-only" value="checkAuthentication">Введите логин</label>
        <input type="text" name="user" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Пароль</label>
        <input type="password" name="pwd" id="inputPassword" class="form-control" placeholder="Password" required>
<div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Запомнить
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Войти</button>
      </form>	
          </div>

          <div class="mastfoot">
            <div class="inner">
              <p>Все права защищены <a href="http://getbootstrap.com">Logistic</a>, by <a href="https://twitter.com/mdo">@Shamukov</a>.</p>
            </div>
          </div>

        </div>

      </div>

    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
  </body>
</html> 
 
 
 
 
 
 
