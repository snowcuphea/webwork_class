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
<h1>����������</h1>
	<%
		//������ ������ ������ ������
		int result = (int)request.getAttribute("myresult");
	//getAttribute�� ������Ʈ ���·� ������ ������ ĳ������ �ʿ��ϴ�. 
	//���� (int)�� �ȵǸ� (Integer)��� ���ٰ� 
		
	%>
	<h1>����������</h1>
	<hr/>
	<h2><%= result %> �� �� ���Լ��� </h2>
	<hr/>
	

</body>
</html>