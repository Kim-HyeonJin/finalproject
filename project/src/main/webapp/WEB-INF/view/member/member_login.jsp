<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <script src="https://code.jquery.com/jquery-latest.js"></script>
<jsp:include page="../template/member_header.jsp"></jsp:include>
<div class="nh text centerdiv">
<!-- 회원사 로그인 페이지
	작업자 강대훈
 -->
 <div class="centerdiv">
 					<h2>세션사업자번호 : ${mbId}</h2>
 					<h2>세션 업체명: ${mbName}</h2>
 					
                    <h1>회원사 로그인</h1>
                </div>
                <form action="member_login" method="post">
                <table align="center">
                    <thead>
                    </thead>
                    <tbody>
                        <tr>
                            <td>사업자번호</td>
                            <td><input type="text" name="mb_businessno" placeholder="사업자번호"></td>
                        </tr>
                        <tr>
                            <td>비밀번호</td>
                            <td><input type="password" name="mb_pw" placeholder="비밀번호"></td>
                        </tr>
                        <tr>
                        <td>
                        	<input type="checkbox" name="saveId">아이디 저장하기
                    </tbody>
                    <tfoot>
                        <tr>
                            <td colspan="2"><input type="submit" class="btsubmit" value="등록"></td>
                        </tr>
                        <tr>
                        	<td>
                        	<a href="../member_register"><label>회원사 등록요청</label></a>
                        	</td>
                        	</tr>
                    </tfoot>
                </table>
                </form>
<jsp:include page="../template/member_footer.jsp"></jsp:include>