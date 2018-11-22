<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<jsp:include page="../view/template/customer_header.jsp"></jsp:include>

 			   <div class="centerdiv">
                    <form action=""></form>
                    <div class="fh">
                        <!--텍스트로 할지 셀렉으로 할지 결정해야함
                            버튼은 클릭할떄 값이 안바낄듯?
                        -->
                        
                        <select class="hotel btsize">
                            <option>호텔</option>
                            <option>모텔</option>
                            <option>리조트</option>
                        </select>
                        <button class="hotel btsize">구분</button>
                        <button class="localbutton btsize">지역</button>
                        <input type="text" placeholder="검색어" class="searchbar">
                        <input type="submit" value="검색" class="btsize">
                        
                        <div class="localmenu">
                            <!--디폴트 메뉴-->
                            <input id="tab1" type="radio" name="tabs" class="bthide"checked>
                            <label for="tab1">서울</label>

                            <input id="tab2" type="radio" name="tabs" class="bthide">
                            <label for="tab2">경기</label>

                            <input id="tab3" type="radio" name="tabs" class="bthide">
                            <label for="tab3">인천</label>

                            <input id="tab4" type="radio" name="tabs" class="bthide">
                            <label for="tab4">강원</label>

                            <input id="tab5" type="radio" name="tabs" class="bthide">
                            <label for="tab5">제주</label>

                            <input id="tab6" type="radio" name="tabs" class="bthide">
                            <label for="tab6">대전</label>

                            <input id="tab7" type="radio" name="tabs" class="bthide">
                            <label for="tab7">충북</label>

                            <input id="tab8" type="radio" name="tabs" class="bthide">
                            <label for="tab8">충남/세종</label>

                            <input id="tab9" type="radio" name="tabs" class="bthide">
                            <label for="tab9">부산</label>

                            <input id="tab10" type="radio" name="tabs" class="bthide">
                            <label for="tab10">울산</label>

                            <input id="tab11" type="radio" name="tabs" class="bthide">
                            <label for="tab11">경남</label>

                            <input id="tab12" type="radio" name="tabs" class="bthide">
                            <label for="tab12">대구</label>

                            <input id="tab13" type="radio" name="tabs" class="bthide">
                            <label for="tab13">경북</label>

                            <input id="tab14" type="radio" name="tabs" class="bthide">
                            <label for="tab14">광주</label>

                            <input id="tab15" type="radio" name="tabs" class="bthide">
                            <label for="tab15">전남</label>

                            <input id="tab16" type="radio" name="tabs" class="bthide">
                            <label for="tab16">전주/제주</label>

                            <section id="content1">
                                <p>tab menu1의 내용</p>
                            </section>

                            <section id="content2">
                                <p>tab menu2의 내용</p>
                            </section>

                            <section id="content3">
                                <p>tab menu3의 내용</p>
                            </section>

                            <section id="content4">
                                <p>tab menu4의 내용</p>
                            </section>

                            <section id="content5">
                                <p>tab menu5의 내용</p>
                            </section>

                            <section id="content6">
                                <p>tab menu6의 내용</p>
                            </section>

                            <section id="content7">
                                <p>tab menu7의 내용</p>
                            </section>

                            <section id="content8">
                                <p>tab menu8의 내용</p>
                            </section>

                            <section id="content9">
                                <p>tab menu9의 내용</p>
                            </section>

                            <section id="content10">
                                <p>tab menu10의 내용</p>
                            </section>

                            <section id="content11">
                                <p>tab menu11의 내용</p>
                            </section>

                            <section id="content12">
                                <p>tab menu12의 내용</p>
                            </section>

                            <section id="content13">
                                <p>tab menu13의 내용</p>
                            </section>

                            <section id="content14">
                                <p>tab menu14의 내용</p>
                            </section>
                            <section id="content15">
                                <p>tab menu15의 내용</p>
                            </section>
                            <section id="content16">
                                <p>tab menu16의 내용</p>
                            </section>
                        </div>
                        <div class="kindtab">
                            <p>호텔</p>
                            <p>펜션</p>
                            <p>리조트</p>
                        </div>


                    </div>
                    <div class="centerdiv row">
                        <h2>dd</h2>
                    </div>

                    <div class="centerdiv row">
                        <img src="http://placehold.it/600x400">
                    </div>

                    <div class="centerdiv row rowheight">
                        <h1>공간</h1>
                    </div>
                </div>
<jsp:include page="../view/template/customer_footer.jsp"></jsp:include>
