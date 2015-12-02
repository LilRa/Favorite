<%@page import="com.google.gson.Gson"%>
<%@page import="com.favorite.model.Img"%>
<%@page import="com.favorite.model.Place"%>
<%@page import="com.favorite.model.Business"%>
<%@page import="com.favorite.model.Area"%>
<%@page import="com.favorite.model.Market"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	List<Market> list  = (List)request.getAttribute("list");
	Gson gson = new Gson();
	 String reuslt = gson.toJson(list);
	 out.println(reuslt);
%>
