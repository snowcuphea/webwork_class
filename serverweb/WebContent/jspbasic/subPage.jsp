<%@page import="dept.DeptDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		//������ ������ ������ ��������
		DeptDTO dept = (DeptDTO)request.getAttribute("mydata");
		//ĳ�����������. setAttribute�� object �� (������ü)
	%>
	<h1>��û���������� ����� ������</h1>
	<hr/>
	<h2>���������� : <%= dept.getDeptName() %> </h2>
	<hr/>
	

</body>
</html>