<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <script src="https://code.jquery.com/jquery-latest.js"></script>
<jsp:include page="../template/admin_header.jsp"></jsp:include>
<div class="nh text centerdiv">
      <div class="nh text centerdiv">
               <div class="nh text centerdiv">
                    <h1>공지사항</h1>
                    <form action="" method="post">
                    <table border="1" align="center">
                        <thead>
                        </thead>
                        <tbody>
                            <tr>
                                <td>제목</td>
                                <td><input type="text" placeholder="제목" readonly></td>
                            </tr>
                            <tr>
                                <td>게시일</td>
                                <td><input type="text" placeholder="게시일" readonly></td>
                            </tr>
                            <tr>
                                <td>종료일</td>
                                <td><input type="text" placeholder="종료일" readonly></td>
                            </tr>
                            <tr>
                                <td>이미지</td>
                                <td><img src="http://placehold.it/600x400"></td>
                            </tr>
                            <tr>
                                <td>내용</td>
                                <td><textarea placeholder="내용입력" readonly></textarea></td>
                            </tr>   
                        </tbody>
                        <tfoot>
                            <tr>
                            <td>
                                <input type="submit" value="수정">    
                            </td>
                            <td>
                                <input type="button" value="삭제">    
                            </td>
                            </tr>
                            
                        </tfoot>

                    </table>

                    </form>
                </div>
<jsp:include page="../template/admin_footer.jsp"></jsp:include>