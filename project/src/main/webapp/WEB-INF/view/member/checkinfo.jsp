<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 
	작업 : 김현진
	내용 : 회원사 - 정보확인 페이지
 -->

    <script type="text/javascript" src="http://code.jquery.com/jquery-2.1.0.min.js"></script>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    <jsp:include page="../template/member_header.jsp"></jsp:include>
    
    <script type="text/javascript">
    	//이미지 미리보기
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
		<div align="center" style="height:500px; width:40%; float: left;">
<!-- 			<img src="/member/main_image?image_writer=${session.getAttribute('mbId')}" id="img"><br> -->
			<img src="/member/checkinfo/main_image?image_writer=1234567890" id="img"><br><!-- 테스트 코드 -->
			<input type="file" id="imgInput" name="main_image" required>
			<input type="submit" value="수정">
    	</div>
	</form>
	
		<div align="center" style="height:500px; width: 59%; float: right;">
			<c:set var="info" value="${info}"></c:set>
			<!-- 회원사 정보 불러올 자리 -->
			숙소명<input type="text" value="${info.mb_name}" readonly><br><br>
			사업자번호<input type="text" value="${info.mb_businessno}" readonly><br><br>
			대표자<input type="text" value="${info.mb_ceo}" readonly><br><br>
			기본주소<input type="text" value="${info.mb_addr1}" readonly><br><br>
			상세주소<input type="text" value="${info.mb_addr2}" readonly><br><br>
			대표번호<input type="text" name="change_phone" value="${info.mb_phone}" required><br><br>
			핸드폰(대표자)<input type="text" name="change_hp" value="${info.mb_hp}" required><br><br>
			가입일<input type="text" value="${info.mb_reg.substring(0, 10)}" readonly><br><br>
			<a href="/member/changephone">전화번호 변경</a>
		</div>
	
	
	<div>
		<a href="home_main">홈</a>
		<a href="">등록객실 보기</a>
		<a href="/member/changepw">비밀번호 변경</a>
	</div>

<jsp:include page="../template/member_footer.jsp"></jsp:include>