<%@page import="ua.killok.dao.util.DAOSessionFactory"%>
<%@page import="ua.killok.dao.model.entities.Article"%>
<%@page import="ua.killok.dao.model.interfaces.LibEntity"%>
<%@page import="java.util.List"%>
<%@page import="ua.killok.dao.dao.implementation.MultiDaoImpl"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Electro-Lib.ua</title>
		<link href="/web/pages/style/electrolib main style.css" rel="stylesheet" type="text/css" />
	</head>
	<body>
		<% request.setCharacterEncoding("UTF-8"); %>
		<jsp:include page="../standart/jspf/header.jspf" />
		<h1>${param.login}${param.pass}</h1> <!-- Just to test -->
		
			<%
				MultiDaoImpl mdi = new MultiDaoImpl(new DAOSessionFactory().getSession());
				List<? extends LibEntity> articles = mdi.listObj(Article.class);
				session.setAttribute("currentlist", articles);
				session.setAttribute("type", "img");
			%>
			
			<c:forEach var="a" items="${currentlist}">
				<a href="https://readrate.com/rus/ratings/books-everyone-should-read">
						<div class="content">
							<h1>${a.title}</h1>
							<img class="imgSource" src="/web/AticleImageService?index=${a.id}">
							<p class="description">${a.text}</p>
						</div>
				</a>
			</c:forEach>
		
		<jsp:include page="../standart/jspf/footer.jspf" />