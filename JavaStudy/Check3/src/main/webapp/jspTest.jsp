<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet"  href="css/stylecss.css"/>
<title>Insert title here</title>
</head>
<body>

<!-- name、idの入力エリアを作成しなさい -->

<%@ include file="header.jsp"%>
<div class="warpper">
 <div>
                <label>社員番号　: </label>
                <input id="empId" type="text" name="empId" maxlength="5" value=""><br>
            </div>
            <div>
                <label>パスワード: </label>
                <input id="password" type="password" name="password" value=""><br>
            </div>
</div>
<div class="footer"><%@ include file="footer.jsp"%></div>

</body>
</html>