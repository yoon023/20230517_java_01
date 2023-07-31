<%@ page import="kh.test.jdbckh.board.model.dto.BoardDto"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
<style>
.wrap-flex{
	display: flex;
}
.wrap-grid{
	display:grid;
	grid-template-columns: auto auto auto auto;
}
</style>
</head>
<body>
<div>
<a href ="<%=request.getContextPath()%>/login">로그인</a>
</div>
	<h2>게시글</h2>
	<div><a href="<%=request.getContextPath()%>/board/insert">새글등록</a></div>
	<div class="wrap-grid">
		<div>번호</div>
		<div>제목</div>
		<div>작성자</div>
		<div>작성일</div>
<%
List<BoardDto> boardList = (List<BoardDto>)request.getAttribute("boardList");
if(boardList != null && boardList.size()>0){
	for(int i=0; i<boardList.size(); i++){
		BoardDto vo = boardList.get(i);
%>
		<div><%=vo.getBno() %></div>
		<div><%=vo.getBtitle() %></div>
		<div><%=vo.getMid() %></div>
		<div><%=vo.getBwriteDate() %></div>
<%
	}
}
%>
	</div>
</body>
</html>