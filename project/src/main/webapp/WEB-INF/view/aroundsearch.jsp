<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- jquery 생성코드 -->
    <script src="//code.jquery.com/jquery-latest.js"></script>
    <!-- 다음 지도 생성코드 -->
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=692275292fc9c9fa3723dbfd8818311e"></script>
	
	<script>
		$(document).ready(function(){
			var container = document.getElementById('map');
			var options = {
				center: new daum.maps.LatLng(33.450701, 126.570667),
				level: 3
			};

			var map = new daum.maps.Map(container, options);
		});

		var map = new daum.maps.Map(container, options);
	</script>
<div>
	<div style="background-color: lime; height:800px; width: 60%; float: left; overflow-y: scroll;">
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
		<h1>내용</h1>
	</div>
	<div id="map" style="height: 800px; width: 40%; float: right;"></div>

</div>