<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	List list = (List) request.getAttribute("list");
	Gson gson = new Gson();
	String result = gson.toJson(list);
	out.println(result);
%>