<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 
	작업 : 김현진
	내용 : 회원사 - 정보확인 페이지
 -->

    <script type="text/javascript" src="http://code.jquery.com/jquery-2.1.0.min.js"></script>
    
    <jsp:include page="../template/member_header.jsp"></jsp:include>
    
    <script type="text/javascript">
    	
        $(function() {
            $("#imgInput").on('change', function(){
                readURL(this);
            });
        });

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


	<form action="upload_mainImg" method="post" enctype="multipart/form-data">
		<div align="center" style="height:500px; width: 400px; float: left;">
			<h1>이미지 정보 : ${list}</h1>
<!-- 			<img src="/member/main_image?image_writer=${session.getattribute('mbId')}" id="img"><br> -->
			<img src="/member/checkinfo/main_image?image_writer=1234567890" id="img"><br><!-- 테스트 코드 -->
			<input type="file" id="imgInput" name="main_image">
			<input type="submit" value="이미지 수정">
    	</div>
	</form>
	
	<div align="center" style="height:500px; width: 400px; float: right;">
	
		<!-- 회원사 정보 불러올 자리 -->
		
	</div>


<jsp:include page="../template/member_footer.jsp"></jsp:include>