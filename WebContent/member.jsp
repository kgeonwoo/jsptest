<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="member.js" type="text/javascript"></script>
<style>
body{
	text-align: center;	
}
#text_page {
	display:inline-block;
	text-align:left;
}
body div form div {
	margin: 30px;
}

body div form #chk {
	text-align:center;
}
label {
	display:inline-block;
	float:left;
	width:160px;
	font-weight:bold;
}
</style>
<body>
	<div id="text_page">	
		<form method="get" action="MemberServlet" name="mb">
			<div>
				<label for="name">이름</label>
				<input type="text" id="name" name="name" placeholder="이름을 입력해주세요.">
			</div>
			<div>
				<label for="mem_num">주민등록번호</label>
				<input type="text" id="mem_num" name="mem_num_f" placeholder="주민번호 앞자리"> - 
				<input type="password" id="mem_num" name="mem_num_b" placeholder="주민번호 뒷자리">
			</div>
			<div>
				<label for="id">아이디</label>
				<input type="text" id="id" name="id" placeholder="아이디를 입력해주세요.">
			</div>
			<div>
				<label for="pw">비밀번호</label>
				<input type="password" id="pw" name="pw">
			</div>
			<div>
				<label for="pw_re">비밀번호 확인</label>
				<input type="password" id="pw_re" name="pw_re">
				<input type="submit" value="비밀번호 확인" onclick="return pw_check()">
			</div>
			<div>
				<label for="email">이메일</label>
				<input type="text" id="email" name="email_f" placeholder="이메일을 입력해주세요."> @ 
				<input type="text" id="email" name="email_b" placeholder="이메일을 입력해주세요.">
				<select name="email_c" size="1">
					<option value="gmail.com">gmail.com</option>
					<option value="naver.com">naver.com</option>
				</select>
			</div>
			<div>
				<label for="addr_num">우편번호</label>
				<input type="text" id="addr_num" name="addr_num" placeholder="우편번호를 입력해주세요.">
			</div>
			<div>
				<label for="addr">주소</label>
				<input type="text" id="addr" name="addr_f" placeholder="주소를 입력해주세요.">
				<input type="text" id="addr" name="addr_b" placeholder="상세주소를 입력해주세요.">
			</div>
			<div>
				<label for="p_n">핸드폰번호</label>
				<input type="text" id="p_n" name="p_n" placeholder="숫자만 입력해주세요.">
			</div>
			<div>
				<label for="job" id="job_label">직업</label>
				<select name="job" size="4">
					<option value="학생">학생</option>
					<option value="언론">언론</option>
					<option value="공무원">공무원</option>
					<option value="군인">군인</option>
					<option value="교육">교육</option>
				</select>
			</div>
			<div>
				<label for="chk_mail">메일 정보 수신 여부</label>
				<input type="radio" id="chk_mail" name="chk_mail" value="yes" checked>수신
				<input type="radio" id="chk_mail" name="chk_mail" value="no">수신거부
			</div>
			<div>
				<label for="interest">관심분야</label>		
				<input type="checkbox" name="interest" value="생두">생두
				<input type="checkbox" name="interest" value="원두">원두
				<input type="checkbox" name="interest" value="로스팅">로스팅
				<input type="checkbox" name="interest" value="핸드드립">핸드드립
				<input type="checkbox" name="interest" value="에스프레소">에스프레소
				<input type="checkbox" name="interest" value="창업">창업
			</div>
			<div id="chk">
				<p>
					<input type="submit" value="회원가입" onclick="return check()">	
					<input type="reset" value="취소">	
				</p>
			</div>
		</form>
	</div>
</body>
</html>