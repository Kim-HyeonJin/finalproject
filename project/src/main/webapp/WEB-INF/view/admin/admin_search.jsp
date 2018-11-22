<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <script src="https://code.jquery.com/jquery-latest.js"></script>
<jsp:include page="../template/admin_header.jsp"></jsp:include>
<div class="nh text centerdiv">
      <div class="nh text centerdiv">
               <div class="nh text centerdiv">
<!--                   확인하기위해서 나중에 지우기-->
                    <h1>회원 검색</h1>
                    <div>
                        <form action="">
                        <select>
                            <option selected>구분</option>
                            <option>이메일</option>
                            <option>전화번호</option>
                            <option>가입일</option>
                        </select>
                        <input type="search" placeholder="검색어">
                        <input type="submit" value="검색">
                        </form>
                        
                    </div>
                    
                    <table border="1" align="center">
                        <thead>
                            <tr>
                                <th>이메일</th>
                                <th>닉네임</th>
                                <th>전화번호</th>
                                <th>등급</th>
                                <th>포인트</th>
                                <th>가입일</th>
                                <th>최종로그인</th>
                                <th>수정</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>이메일</td>
                                <td>닉네임</td>
                                <td>전화번호</td>
                                <td>등급</td>
                                <td>포인트</td>
                                <td>가입일</td>
                                <td>최종로그인</td>
                                <td><button>수정</button></td>
                            </tr>
                             <tr>
                                <td>이메일</td>
                                <td>닉네임</td>
                                <td>전화번호</td>
                                <td>등급</td>
                                <td>포인트</td>
                                <td>가입일</td>
                                <td>최종로그인</td>
                                <td><button>수정</button></td>
                            </tr>
                            <tr>
                                <td>이메일</td>
                                <td>닉네임</td>
                                <td>전화번호</td>
                                <td>등급</td>
                                <td>포인트</td>
                                <td>가입일</td>
                                <td>최종로그인</td>
                                <td><button>수정</button></td>
                            </tr>
                        
                        </tbody>
                    </table>
                </div>
<jsp:include page="../template/admin_footer.jsp"></jsp:include>