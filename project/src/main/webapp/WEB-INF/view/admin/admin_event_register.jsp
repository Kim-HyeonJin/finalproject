<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <script src="https://code.jquery.com/jquery-latest.js"></script>
<jsp:include page="../template/admin_header.jsp"></jsp:include>
<div class="nh text centerdiv">
 <div class="centerdiv">

                         <div class="nh text centerdiv">
                    <h1>이벤트등록</h1>
                    <form action="" method="post">
                    <table border="1" align="center">
                        <thead>
                        </thead>
                        <tbody>
                            <tr>
                                <td>제목</td>
                                <td><input type="text" placeholder="내용입력"></td>
                            </tr>
                            <tr>
                                <td>종료일</td>
                                <td><input type="month"></td>
                            </tr>
                            <tr>
                                <td>이미지</td>
                                <td><input type="file"></td>
                            </tr>
                            <tr>
                                <td>내용</td>
                                <td><textarea placeholder="내용입력"></textarea></td>
                            </tr>   
                        </tbody>
                        <tfoot>
                            <tr>
                            <td colspan="2">
                                <input type="submit" value="등록">    
                            </td>
                            </tr>
                            
                        </tfoot>

                    </table>

                    </form>
                </div>

<jsp:include page="../template/admin_footer.jsp"></jsp:include>