<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 
	작업 : 김현진
	내용 : 회원사 - 정보확인 페이지
 -->

<div>
	<form action="upload_mainImg" method="post" enctype="multipart/form-data">
		<div align="center" style="height:500px; width: 400px; float: left;">
			<img src="http://placehold.it/500x300"><br>
			<input type="file" name="main_image">
			<input type="submit" value="이미지 등록">
    	</div>
	</form>
	<div align="center" style="height:500px; width: 400px; float: right;">
		<a>숙소명</a><br><br>
		<a>좋아요</a><a>싫어요</a><a>후기</a><br><br>
		<hr>
		<a>객실등록 최저가</a><br><br>
		<a>거래건수</a>
		<a>총 매출액</a>
		
	</div>
</div>