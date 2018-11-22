<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<jsp:include page="../view/template/customer_header.jsp"></jsp:include>

<html>
<head>
    <title></title>
</head>
<form action="member_register" method="post">
<body>
    <table>
        <thead>
            <tr>
                <th>
                    <h1>회원사 등록</h1>
                </th>
        </thead>
        <tbody>
            <tr>
            <tr>
                <td>사업자번호</td>
                <td><input type="number" name="mb_businessno" placeholder="사업자번호"></td>
            </tr>
            <tr>
                <td>업체명</td>
                <td><input type="text" name="mb_name" placeholder="업체명"></td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td><input type="password" name="mb_pw" placeholder="비밀번호"></td>
            </tr>
            <tr>
                <td>대표자명</td>
                <td><input type="text" name="mb_ceo" placeholder="대표자명"></td>
            </tr>
            <tr>
                <td>우편번호</td>
                <td><input type="text" name="mb_post" placeholder="주소"></td>
            </tr>
            
            <tr>
                <td>기본주소</td>
                <td><input type="text" name="mb_addr1" placeholder="주소"></td>
            </tr>
            <tr>
                <td>상세주소</td>
                <td><input type="text" name="mb_addr2" placeholder="주소"></td>
            </tr>
            <tr>
                <td>전화번호</td>
                <td><input type="text" name="mb_phone" placeholder="전화번호"></td>
            </tr>
            <tr>
                <td>핸드폰번호</td>
                <td><input type="text" name="mb_hp" placeholder="전화번호"></td>
            </tr>

            <tr>
                <td>구분</td>
                <td>
                    <select name="mb_type">
                        <option>모텔</option>
                        <option>호텔</option>
                        <option>리조트</option>
                        <option>펜션/풀빌라</option>
                        <option>게스트하우스</option>

                    </select>
                </td>
            </tr>
        </tbody>
        <tfoot>
        <tr>
            <td><input type="submit" value="등록"></td>
        </tr>
        </tfoot>
    </table>
        </form>
</body>

</html>

<jsp:include page="../view/template/customer_footer.jsp"></jsp:include>