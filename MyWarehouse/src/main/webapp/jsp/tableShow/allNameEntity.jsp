<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="controller" method="post">
		<input type="hidden" id="command" name="command" value="ShowTable"> <select
			name="nameEntity">


			<option value="Goods" label="товары"></option>

			<option value="Preservation" label="склад"></option>

			<option value="Client" label="клиенты"></option>

			<option value="OrderGoods" label="заказы"></option>




		</select> <input type="submit" value="отправить">
	</form>
	<script>
		var d = document, myForm = d.forms[0], output = d
				.getElementById('nameEntity');
		myForm.nameEntity.addEventListener('change', function() {
			if(this.value!="Goods"&&this.value!="Preservation"){
			var start = d.getElementById("command");

			start.value = "show" + this.value;
			console.log(start);
			}
		}, false);
	</script>
</body>
</html>