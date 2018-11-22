<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <script src="https://code.jquery.com/jquery-latest.js"></script>
<jsp:include page="../template/admin_header.jsp"></jsp:include>
<div class="nh text centerdiv">
 <div class="centerdiv">

                <div class="nh text centerdiv">
                    <h1>이벤트관리</h1>
                    <table border="1" align="center">
                        <thead>
                            <input type="button" value="선택삭제">
                                                        <tr>
                                <th>
                                    <input type="checkbox">
                                </th>
                               <th>번호</th>
                               <th>게시물</th>
                                <th>게시일</th>
                               <th>종료일</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>
                                    <input type="checkbox">
                                </td>
                                <td>번호 입력</td>
                                <td>게시물</td>
                                <td>게세일</td>
                                <td>종료일</td>
                                <td></td>
                            </tr>
                        </tbody>
                        
                    </table>
                    
                </div>

<jsp:include page="../template/admin_footer.jsp"></jsp:include>