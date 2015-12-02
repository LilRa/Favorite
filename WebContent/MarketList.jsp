
<%@page import="com.favorite.model.Img"%>

<%@page import="com.favorite.model.Place"%>
<%@page import="com.favorite.model.Business"%>
<%@page import="com.favorite.model.Area"%>
<%@page import="com.favorite.model.Market"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	List<Market> list  = (List)request.getAttribute("list");
%>
<body>
<table>
 <%for(int i=0; i < list.size(); i++){
 	 Area area = list.get(i).getArea();
 	 Business business = list.get(i).getBusiness();
 	 Place place = list.get(i).getPlace();
 	 List<Img> img = list.get(i).getImg();
 %> 
<tr>
<td><%= list.get(i).getMarket_title() %></td>
<td><%= list.get(i).getPhone() %></td>
<td><%= list.get(i).getGrade() %></td>
<td><%= list.get(i).getAgree() %></td>
<td><%= area.getArea_name()%></td>
<td><%= business.getBusiness_name() %></td>
<td><%= place.getPlace_x() %></td>
<td><%= place.getPlace_y() %></td>
<% for(int j=0; j < img.size();j++) {%>
<tr>
<td><%= img.get(j).getImg_name() %></td>
<td><%= img.get(j).getImg_extension() %></td>
</tr>
<%} %>
</tr>
<%} %>
</table>
</body>
</html>