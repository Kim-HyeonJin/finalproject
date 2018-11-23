<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <script src="https://code.jquery.com/jquery-latest.js"></script>
<jsp:include page="../view/template/customer_header.jsp"></jsp:include>
<div class="nh text centerdiv">
<!-- 회원 로그인 페이지
	작업자 강대훈
 -->
 <div class="centerdiv">
 					<h2>회원아이디 : ${csId}</h2>
 					
                    <h1>회원 로그인</h1>
                </div>
                <form action="customer_login" method="post">
                <table align="center">
                    <thead>
                    </thead>
                    <tbody>
                        <tr>
                            <td>아이디</td>
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
                    </tfoot>
                </table>
                </form>
<jsp:include page="../view/template/customer_footer.jsp"></jsp:include>