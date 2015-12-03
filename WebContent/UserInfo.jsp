<%@page import="com.google.gson.Gson"%>
<%@page import="com.favorite.model.User"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%
	User user  = (User)request.getAttribute("user");
	Gson gson = new Gson();
	 String reuslt = gson.toJson(user);
	 out.println(reuslt);
 %>
