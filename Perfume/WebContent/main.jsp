<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import ="java.util.List" %>
 <%@ page import ="java.util.ArrayList" %>
 <%@ page import ="com.dto.ProductDTO" %>
 <%@ page import ="com.dto.BrandDTO" %>
 <%@ page import ="com.dto.PdetailsDTO" %>
 <%@ page import ="com.dto.NoteDTO" %>
 <%@ page import ="com.dto.ProductResultDTO" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/main.css">
</head>
<body>
<h1>Main화면입니다.</h1>
<%
ArrayList<ProductResultDTO> list =(ArrayList<ProductResultDTO>)request.getAttribute("list");
List<PdetailsDTO> PdDTO = (List<PdetailsDTO>) request.getAttribute("Pdetails");

for(int i =0; i<list.size(); i++){ 
ProductResultDTO rsDTO = list.get(i);
String pname = rsDTO.getPname();
String brand_kr = rsDTO.getBname_kr();
String brand_eng = rsDTO.getBname_eng();
String baseNote = rsDTO.getBaseNote();
String middleNote = rsDTO.getMiddleNote();
String topNote = rsDTO.getTopNote();
String singleNote = rsDTO.getSingleNote();
int pnum = rsDTO.getPnum();
%>
<div class="productBox">
	<img alt="<%=pname %>" src="img/<%=pnum %>.jpg" class="productImg">
	브랜드 : <%=brand_kr %><br>
	제품명: <%=pname %>	<br>
	<%if(singleNote == null){ %>
	탑노트 : <%=topNote %><br>
	미들노트: <%=middleNote %><br>
	베이스노트: <%=baseNote %><br>
	<%}else{ %>
	노트 : <%=singleNote %><br>
	<%} %>
	<% for(int i2 =0; i2<PdDTO.size(); i2++){
		
		if(PdDTO.get(i2).getPnum() == pnum){
	%>
<%=PdDTO.get(i2).getType()%> <%=PdDTO.get(i2).getMl() %>ml : <%=PdDTO.get(i2).getPrice() %>원 <br> 

	<% } %>
	<%} %>
</div>
<%}%><!-- for_end -->
</body>
</html>