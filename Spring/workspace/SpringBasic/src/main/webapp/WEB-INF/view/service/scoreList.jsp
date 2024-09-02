<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<c:forEach var="vo" items="${list }" varStatus="a"> <!-- a : idex 혹은 count로 활용한다 -->
				${a.index }
				<!-- ${a.count } -->
				${vo.name }
				${vo.kor }
				${vo.eng }
				${vo.math }
				<button type="button" onclick="location.href='deleteScore?sno=${vo.sno}';">삭제</button> <!-- sno라는 키로 값을 넘긴다 -->
				<br>
		</c:forEach>
		
		<a href="scoreRegist">추가등록하기</a>
</body>
</html>