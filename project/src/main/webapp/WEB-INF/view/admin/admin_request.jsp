<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <script src="https://code.jquery.com/jquery-latest.js"></script>
<jsp:include page="../template/admin_header.jsp"></jsp:include>
<div class="nh text centerdiv">
      <div class="nh text centerdiv">
 <div class="centerdiv">
                    <h1>관리자 계정 등록</h1>
                </div>
                <form action="" method="post">
                <table align="center">
                    <thead>
                    </thead>
                    <tbody>
                        <tr>
                            <td>아이디</td>
                            <td><input type="text" placeholder="업체명"></td>
                        </tr>
                        <tr>
                            <td>비밀번호</td>
                            <td><input type="password" placeholder="비밀번호"></td>
                        </tr>
                        <tr>
                            <td>비밀번호 확인</td>
                            <td><input type="password" placeholder="비밀번호 확인"></td>
                        </tr>

                    </tbody>
                    <tfoot>
                        <tr>
                            <td colspan="2"><input type="submit" class="btsubmit" value="등록"></td>
                        </tr>
                    </tfoot>
                </table>
                </form>
<jsp:include page="../template/admin_footer.jsp"></jsp:include>