<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<jsp:include page="../template/admin_header.jsp"></jsp:include>

<h1>회원사 회사소개 등록</h1>
<form action="member_intro" method="post">
	<table align="center">
		<thead>
		</thead>
		<tbody>
			<tr>
				<th>제 목</th>
				<td><input type="text" name="introTitle" placeholder="제목을 입력하세요"></td>
            </tr>
			<tr>
				<th>이미지</th>
				<td><input type="text" name="introImgName"></td>
				<td><input type="button" name="introImgButton"></td>
			</tr>
			<tr>
				<th>내 용</th>
                <td><input type="text" name="introText"></td>
            </tr>
			<tr>
				<td><input type="submit" value="저장"></td>
			</tr>   
		</tbody>
		<tfoot>
		</tfoot>
	</table>
</form>

<jsp:include page="../template/admin_footer.jsp"></jsp:include>