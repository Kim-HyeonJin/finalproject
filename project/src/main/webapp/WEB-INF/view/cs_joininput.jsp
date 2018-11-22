<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 일반 사용자 회원가입 정보입력 -->
<!-- 작성자 : HWS -->
<html>
<head>
	<title>사용자 회원 가입 : 정보입력</title>
</head>
<body>
	<form action="cs_joininput" method="post">
		<div align="center">
			<h3>회원 가입</h3>
			<input type="text" name="cs_id" placeholder="이메일을 입력하세요">(아이디 : 이메일 인증 필수)<br><br>
			<input type="password" name="cs_pw" placeholder="사용할 비밀번호를 입력하세요">(비밀번호 : 영문,숫자,특수문자 8자 이상)<br><br>
			<input type="text" name="cs_nick" placeholder="사용할 닉네임을 입력하세요">(닉네임 : 2~10글자 이내)<br><br>
<!-- 		<input type="password" name="confirmPw" placeholder="입력한 비밀번호를 재입력하세요">(비밀번호 확인)<br><br> -->
			<input type="text" name="cs_tel" placeholder="사용중인 전화번호를 입력하세요">(휴대폰 번호 : 선택사항)<br><br>		
			<input type="submit" value="회원가입"><br>
		</div>	
	</form>
</body>
</html>