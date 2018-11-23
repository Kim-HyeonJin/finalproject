<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <jsp:include page="../view/template/customer_header.jsp"></jsp:include>
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
	<div style="height:800px; width: 58%; float: left; overflow-y: scroll;">
		<c:forEach var="msearch" items="${list}">
		<div style="height:180px;">
			<div style= "width: 40%; float:left;">
				<img src="http://placehold.it/210x140">
			</div>
			<div style="width: 50%; float: right;">
				<div>
					업체명 : ${msearch.name}
				</div>
				<div>
					후기 개수 : 00
				</div>
				<div>
					대실 :${msearch.}
					<span>금액 : ${msearch.timeprice}</span>
				</div>
				<div>
					숙박 :${msearch.entrytime}
					<span>예약가 : ${msearch.dateprice}</span>
				</div>
				<div>
					설명 : ${msearch.info}
				</div>
			</div>
		</div>
		</c:forEach>
		<div>
		<h1>내용</h1>
		</div>
		<div>
		<h1>내용</h1>
		</div>
		<div>
		<h1>내용</h1>
		</div>
		<div>
		<h1>내용</h1>
		</div>
		<div>
		<h1>내용</h1>
		</div>
		<div>
		<h1>내용</h1>
		</div>
		<div>
		<h1>내용</h1>
		</div>
		<div>
		<h1>내용</h1>
		</div>
		<div>
		<h1>내용</h1>
		</div>
		<div>
		<h1>내용</h1>
		</div>
		
	</div>

	<div id="map" style="height: 800px; width: 40%; float: right;"></div>
	</div>
<jsp:include page="../view/template/customer_footer.jsp"></jsp:include>