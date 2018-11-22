<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>

<head>
    <title></title>
    <style>
/*       페이지 전체 크기*/
        main{
             height: 1280px;
        }
/*        확인용 밑줄*/
        div{
            border: 1px solid black;
        }
/*        헤더부분 사이즈 및 색*/
        .hh{
            height: 50px;
            background-color: skyblue;  
        }
/*        이미지들어가는부분임*/
        .nh{
            height: 900px;
            margin-top: 30px;
            margin-left: 10px;
        }
        
/*       상단 메뉴바 위치 정렬*/
        .menu >.right{
            margin-left: auto;
        }
        .menu >.right ~.right{
            margin-left: 0.5em;
        }
        .menu-fixed{
            left: 0;
            right: 0;
            top: 0;
            padding: 10px;
            display: flex;
        }
        .menu>*{
            font-size: 1em;
            color: black;
            text-decoration: none;
        }

/*        가운데정렬하는거*/
        .centerdiv{
            text-align: center;
    
        }
/*        검색창 크기*/
        .searchbar{
            width:200px;
            height:50px;
        }
/*        버튼크기*/
        .btsize{
            width:80px;
            height: 50px;
        }
/*       하단 풋터*/
        .footdiv{
            display: block;

        }
/*        높이사이마다 여백*/
        .row{
            margin-top: 10px;
        }
/*        공간 높이잡음*/
        .rowheight{
            height: 200px;
        }
/*        라디오박스 라벨과연결*/
        #tab1:checked ~ #content1,
        #tab2:checked ~ #content2,
        #tab3:checked ~ #content3,
        #tab4:checked ~ #content4,
        #tab5:checked ~ #content5,
        #tab6:checked ~ #content6,
        #tab7:checked ~ #content7,
        #tab8:checked ~ #content8,        
        #tab9:checked ~ #content9,
        #tab10:checked ~ #content10,
        #tab11:checked ~ #content11,
        #tab12:checked ~ #content12,        
        #tab13:checked ~ #content13,
        #tab14:checked ~ #content14,
        #tab15:checked ~ #content15,      
        #tab16:checked ~ #content16
        
        {display: block;}
        /*라디오버튼 숨김*/
        .bthide{
            display: none;
        }
/*        지역별 선택시 도시명나오는곳 */
        section {
        display: none;
        padding: 20px 0 0;
        border-top: 1px solid #ddd;
        }   
	    </style>
    <script src="https://code.jquery.com/jquery-latest.js"></script>
    <script>

        var showFlag=true;
	        $(document).ready(function(){
	            //지역버튼검색 토글
	            $(".localbutton").on("click",function(){
	                $(".localmenu").toggle();   
	            });
                //종류버튼 검색 토글
                $(".hotel").on("click",function(){
	                $(".kindtab").toggle();   
	            });
                
	        });
 
    </script>
</head>

<body>
    <main>
        <header>
            <article class="">
                <div class="hh menu menu-fixed">
                   	<a href="../home_main"><img src="http://placehold.it/50x50" class="left"></a>
                    <a href="" class="tableft">회원관리</a>
                    <a href="member" class="tableft">회원사관리</a>
                    <a href="/admin/admin_notice" class="tableft">게시물관리</a>
                    <a href="/admin/admin_staticchart" class="tableft">통계</a>
                    <a href="/admin/admin_account" class="tableft">계정생성</a>
                    <a href="" class="right tableft">로그아웃</a>
                </div>
                <div>
                        
                        <a href="/admin/admin_search" class="tableft">회원검색</a>
                   
                        
                        <a href="" class="tableft">회원사검색</a>
                        <a href="/admin/admin_request" class="tableft">요청내역</a>
                    
                        <a href="" class="tableft">회사소개</a>
                        <a href="/admin/admin_event" class="tableft">이벤트정보</a>
                        <a href="" class="tableft">공지사항</a>
                    
                    
                        <a href="/admin/admin_staticchart" class="tableft">매출통계</a>
                        <a href="" class="tableft">이용자통계</a>
                    
                </div>
                
                <hr>