<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Electro-Lib.ua</title>
		<link href="/web/pages/style/electrolib main style.css" rel="stylesheet" type="text/css" />
	</head>
	<body>
		<% request.setCharacterEncoding("UTF-8"); %>
		<jsp:include page="../standart/jspf/header.jspf" />
		
		<c:forEach var="book" items="${bookList}">
				<a href="">
						<div class="content">
							<h1>${book.id} ${book.name}</h1>
							
							<img class="imgSource" src="/web/BookImageService?index=${book.id}">
							<p class="description">${book.shortDescription}</p>
						</div>
				</a>
			</c:forEach>
		
		<jsp:include page="../standart/jspf/footer.jspf" />