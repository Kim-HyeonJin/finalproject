<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <script src="https://code.jquery.com/jquery-latest.js"></script>
<jsp:include page="../template/admin_header.jsp"></jsp:include>
<div class="nh text centerdiv">
 <div class="centerdiv">
 					<h2>세션 : ${adminsession}</h2>
                    <h1>관리자 로그인</h1>
                </div>
                <form action="admin_login" method="post">
                <table align="center">
                    <thead>
                    </thead>
                    <tbody>
                        <tr>
                            <td>아이디</td>
                            <td><input type="text" name="admin_id" placeholder="아이디"></td>
                        </tr>
                        <tr>
                            <td>비밀번호</td>
                            <td><input type="password" name="admin_pw" placeholder="비밀번호"></td>
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
<jsp:include page="../template/admin_footer.jsp"></jsp:include>