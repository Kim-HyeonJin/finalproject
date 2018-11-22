<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 일반 사용자 회원가입시 이용약관 동의 페이지 -->
<!-- 작성자 : HWS -->
<script src="https://code.jquery.com/jquery-latest.js"></script>
<jsp:include page="../view/template/customer_header.jsp"></jsp:include>
<html>
<head>
</head>
<body>
	<form action="cs_jointos" method="get">
		<div align="center">
			<h3>사용자 이용 약관 동의</h3>
			<textarea rows="8" cols="120">이용약관1</textarea><br>
			<input type="checkbox" name="tos1" value="true" required>동의합니다(필수)<br><br>
			<textarea rows="8" cols="120">이용약관2</textarea><br>
			<input type="checkbox" name="tos2" value="true" required>동의합니다(필수)<br><br>
			<input type="submit" value="다음"><br>
		</div>
	</form>
</body>	
</html>
<jsp:include page="../view/template/customer_footer.jsp"></jsp:include>    
