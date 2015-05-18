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
</body>
</html>