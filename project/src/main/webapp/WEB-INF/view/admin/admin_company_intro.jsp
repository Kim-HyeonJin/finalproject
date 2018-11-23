<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<jsp:include page="../template/admin_header.jsp"></jsp:include>

<form action="admin_company_intro" method="post">
	<div align="center">
		<h1>회사소개 등록</h1><br><br>
		<h4>제 목</h4>
		<input type="text" name="intro_title" placeholder="제목을 입력하세요" required><br><br>
		<h4>내 용</h4>
        <input type="text" name="intro_content" required><br><br>
		<input type="submit" value="저장"><br><br>
	</div>
</form>

<jsp:include page="../template/admin_footer.jsp"></jsp:include>