<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 
	작업 : 김현진
	내용 : 회원사 - 정보확인 페이지
 -->

<script type="text/javascript">
	function readURL(input) {
		if (input.files && input.files[0]) { 
			var reader = new FileReader(); 
			reader.onload = function (e) {
				$('#img').attr('src', e.target.result);
			} 
			reader.readAsDataURL(input.files[0]); 
		} 
	} 
</script>

<div>
	<form action="upload_mainImg" method="post" enctype="multipart/form-data">
		<div align="center" style="height:500px; width: 400px; float: left;">

			
			<img src="http://placehold.it/1000x300"><br>
			<input type="file" name="main_image" multiple>

			<img id="img" src="#"><br>
			<input type="file" name="main_image">
      
			<input type="submit" value="이미지 등록">
    	</div>
	</form>
	<div align="center" style="height:500px; width: 400px; float: right;">
	
	</div>
</div>