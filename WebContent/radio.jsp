<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
body {
	text-align: center;
}
input {
	margin: 10px;
}
</style>
<body>
	<form method="get" action="RadioServlet">
		<label for="gender"><p>성별</p></label>
		<input type="radio" id="gender" name="gender" value="남자" checked>남자
		<input type="radio" id="gender" name="gender" value="여자">여자<br><br>
		<label for="chk_mail"><p>메일 정보 수신 여부</p></label>
		<input type="radio" id="chk_mail" name="chk_mail" value="yes" checked>Yes
		<input type="radio" id="chk_mail" name="chk_mail" value="no">No<br><br>
		<label for="item"><p>좋아하시는 의류를 선택해주세요!(중복가능)</p></label>		
		<input type="checkbox" name="item" value="신발">신발
		<input type="checkbox" name="item" value="가방">가방
		<input type="checkbox" name="item" value="벨트">벨트
		<input type="checkbox" name="item" value="모자">모자
		<br><br>
		<label for="job"><p>직업</p></label>
		<select name="job" size="1">
			<option value="">선택하세요!</option>
			<option value="언론">언론</option>
			<option value="공무원">공무원</option>
			<option value="군인">군인</option>
			<option value="교육">교육</option>
		</select>
		<br><br>
		<label for="interest"><p>관심분야</p></label>
		<select name="interest"  size="5" multiple="multiple">
			<option value="에스프레소">에스프레소</option>
			<option value="로스팅">로스팅</option>
			<option value="생두">생두</option>
			<option value="원두">원두</option>
			<option value="핸드드립">핸드드립</option>
		</select>
		<br><br>
		<label for="content"><p>간단한 가입 인사를 적어주셈</p></label>
		<textarea id="content" name="content" rows="3" cols="35"></textarea><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>