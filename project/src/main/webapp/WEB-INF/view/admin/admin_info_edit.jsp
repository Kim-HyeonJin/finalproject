<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <script src="https://code.jquery.com/jquery-latest.js"></script>
<jsp:include page="../template/admin_header.jsp"></jsp:include>
<div class="nh text centerdiv">
      <div class="nh text centerdiv">
                    <h1>회원 정보 수정</h1>
                    <form action="minfoedit" method="post">
                    <table border="1" align="center">
                        <thead>
                        </thead>
                        <tbody>
                            <tr>
                                <td>사업자명 : </td>
                                <td>0000-0000-00</td>
                            </tr>
                            <tr>
                                <td>숙소명 : </td>
                                <td>
                                    <input type="text" placeholder="내용을 입력해주세요.">
                                </td>
                            </tr>
                            <tr>
                                <td>대표자 : </td>
                                <td>
                                    <input type="text" placeholder="내용을 입력해주세요.">
                                </td>
                            </tr>
                            <tr>
                                <td>주소 : </td>
                                <td>
                                    <input type="text" placeholder="내용을 입력해주세요.">
                                </td>
                            </tr>
                            <tr>
                                <td>전화번호 : </td>
                                <td>
                                    <input type="text" placeholder="내용을 입력해주세요.">
                                </td>
                            </tr>
                            <tr>
                                <td>업종구분 : </td>
                                <td>
                                    <select>
                                        <option>모텔</option>
                                        <option>호텔</option>
                                        <option>펜션</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td>등급 : </td>
                                <td>
                                    <select>
                                        <option>일반</option>
                                        <option>??</option>
                                        <option>vip</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td>가입일 : </td>
                                <td>0000.00.00</td>
                            </tr>
                            <tr>
                                <td>최종로그인 : </td>
                                <td>0000.00.00</td>
                            </tr>
                        </tbody>
                    </table>
                    <input type="submit" value="수정완료" >
                        <a href=""><button>강제탈퇴</button></a>
                    </form>
                </div>
<jsp:include page="../template/admin_footer.jsp"></jsp:include>