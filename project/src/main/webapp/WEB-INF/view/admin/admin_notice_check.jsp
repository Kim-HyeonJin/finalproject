<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <script src="https://code.jquery.com/jquery-latest.js"></script>
<jsp:include page="../template/admin_header.jsp"></jsp:include>
<div class="nh text centerdiv">
      <div class="nh text centerdiv">
                <div class="nh text centerdiv">
                    <h1>공지사항</h1>
                    <table border="1" align="center">
                        <thead>
                            <input type="button" value="선택삭제">
                                                        <tr>
                                <th>
                                    <input type="checkbox">
                                </th>
                               <th>제목</th>
                               <th>게시일</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>
                                    <input type="checkbox">
                                </td>
                                <td>제목</td>
                                <td>게시일</td>
                            </tr>
                        </tbody>
                        
                    </table>
                    
                </div>
<jsp:include page="../template/admin_footer.jsp"></jsp:include>