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
	<c:import url="../layout/nav.jsp" />
<!-- 	<h1>Notice List Page</h1> -->
<!-- 	<img alt="" src="../resources/images/park2.jpg"> -->
<!-- 	<a href="./noticeSelect?n=33">Select One Page</a> -->
<!-- 	<a href="./noticeWrite">Notice Write</a></body> -->
	<div class="container">
  		<div class="jumbotron">
    		<h1>Notice List Page</h1>
		</div>
	</div>
	<div class="container">
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>NUM</th><th>TITLE</th><th>WRITER</th><th>DATE</th><th>HIT</th>
	      </tr>
	    </thead>
	    <tbody>
	    	<c:forEach items="${list}" var="dto" varStatus="st">
		      <tr>
		        <td>${pageScope.dto.num}</td>
		        <td><a href="./noticeSelect?num=${pageScope.dto.num}">${pageScope.dto.title}</a></td>
		        <td>${pageScope.dto.writer}</td>
		        <td>${pageScope.dto.reg_date}</td>
		        <td>${pageScope.dto.hit}</td>
		      </tr>
	    	</c:forEach>
	    </tbody>
	  </table>
	 </div>	
</body>
</html>