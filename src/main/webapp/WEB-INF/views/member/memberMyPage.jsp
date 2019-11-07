<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<c:import url="../layout/nav.jsp"></c:import>
	<div class="container">
		<h2>My Page Form</h2>
		<form action="./memberUpdateForm.jsp" id="frm" onsubmit=true method="post">
		    <div class="form-group">
				<label for="id">ID:</label>
				<input type="text" class="form-control" id="id" placeholder="Enter ID" required="required" name="id" value="${ id }" readonly="readonly">
		    </div>
		    <div class="form-group">
				<label for="pw">PW:</label>
				<input type="password" class="form-control" id="pw" placeholder="Enter PW" required="required" name="pw" value="${ pw }" readonly="readonly">
		    </div>
		    <div class="form-group">
				<label for="name">NAME:</label>
				<input type="text" class="form-control" id="name" placeholder="Enter NAME" required="required" name="name" value="${ name }" readonly="readonly">
		    </div>
		    <div class="form-group">
				<label for="email">email:</label>
				<input type="email" class="form-control" id="email" placeholder="Enter E-MAIL" required="required" name="email" value="${ email }" readonly="readonly">
		    </div>
		    <div class="form-group">
				<label for="phone">PHONE:</label>
				<input type="tel" class="form-control" id="phone" placeholder="Enter PHONE NUMBER" required="required" name="phone" value="${ phone }" readonly="readonly">
		    </div>
		     <div class="form-group">
				<label for="phone">Grade:</label>
				<input type="tel" class="form-control" id="phone" placeholder="Enter PHONE NUMBER" required="required" name="phone" value="${ grade }" readonly="readonly">
		    </div>
			<button type="submit" class="btn btn-default">GO Update</button> 
			<a href="./memberDeleteResult.jsp?id=" class="btn btn-default">QUIT</a>
		</form>
	</div>
</body>
</html>