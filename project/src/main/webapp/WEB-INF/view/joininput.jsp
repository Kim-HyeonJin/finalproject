<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
	<title>회원 가입 : 정보입력</title>
</head>
<body>
	<div align="center">
		<h3>회원 가입</h3>
		<input type="text" id="userId" placeholder="이메일을 입력하세요">(아이디 : 이메일 인증 필수)<br><br>
		<input type="text" id="userNick" placeholder="사용할 닉네임을 입력하세요">(닉네임 : 2~10글자 이내)<br><br>
		<input type="text" id="userPw" placeholder="사용할 비밀번호를 입력하세요">(비밀번호 : 영문,숫자,특수문자 8자 이상)<br><br>
		<input type="text" id="confirmPw" placeholder="입력한 비밀번호를 재입력하세요">(비밀번호 확인)<br><br>
		<input type="text" id="userHp" placeholder="사용중인 전화번호를 입력하세요">(휴대폰 번호 : 선택사항)<br><br>		
		<input type="submit" value="회원가입"><br>
	</div>	
</body>
</html>