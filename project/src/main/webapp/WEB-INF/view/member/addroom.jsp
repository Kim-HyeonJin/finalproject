<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 
	작업 : 김현진
	내용 : 객실등록 페이지
 -->

<script type="text/javascript" src="http://code.jquery.com/jquery-2.1.0.min.js"></script>
<jsp:include page="../template/member_header.jsp"></jsp:include>
    <script type="text/javascript">
    	
        $(function() {
            $(".imgInput").on('change', function(){
                readURL(this);
            });
        });

        function readURL(input) {
            if (input.files && input.files[0]) {
            var reader = new FileReader();

            reader.onload = function (e) {
            		console.log('실행');
            		console.log(e.target.result);
                    $('.img').attr('src', e.target.result);
                }

              reader.readAsDataURL(input.files[0]);
            }
        }
    </script>

<div>
	<div align="center">
		<form action="addimage" method="post" enctype="multipart/form-data">
			<div align="center">
				<img class="img" src="http://placehold.it/300x300">
				<input type="file" name="image1" class="inputImg">
				<img class="img" src="#">
				<input type="file" name="image2" class="inputImg">
				<img class="img" src="#">
				<input type="file" name="image3" class="inputImg">
				<img class="img" src="#">
				<input type="file" name="image4" class="inputImg"><br><br>
				<input type="submit" value="이미지 등록">
			</div>
		</form>
	</div>
    <div>
    	<form action="addroom" method="post">
	    	<div align="center">
		    		<input type="text" name="addroom_roomname" placeholder="객실이름을 입력해주세요"><br><br>
		    		<input type="text" name="addroom_roomcount" placeholder="동일한 객실의 숫자를 입력해주세요"><br><br>
		    		<input type="text" name="addroom_limitperson" placeholder="객실 수용인원을 입력해주세요"><br><br>
		    		
		    		<input type="text" name="addroom_settime" placeholder="대실 설정 시간을 입력해주세요"><br><br>
		    		<input type="text" name="addroom_timeprice" placeholder="대실 금액을 입력해주세요"><br><br>
		    		<input type="text" name="addroom_entrytime" placeholder="숙박 입실 시간을 입력하세요"><br><br>
		    		<input type="text" name="addroom_exittime" placeholder="숙박 퇴실 시간을 입력하세요"><br><br>
		    		<input type="text" name="addroom_dateprice" placeholder="숙박 금액을 입력하세요"><br><br>
		    		<input type="text" name="addroom_info" placeholder="객실정보를 입력하세요"><br><br>
		    		
		    		<input type="submit" value="객실등록">
	    	</div>
    	</form>
    </div>
</div>


<jsp:include page="../template/member_footer.jsp"></jsp:include>