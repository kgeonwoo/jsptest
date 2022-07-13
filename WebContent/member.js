function check(){
	if(document.mb.name.value == ""){
		alert("이름을 입력해주세요!");
		document.mb.name.focus();
		return false;
	}else if(document.mb.mem_num_f.value == ""){
		alert("주민번호를 입력해주세요!");
		document.mb.mem_num_f.focus();
		return false;
	}else if(document.mb.mem_num_b.value == ""){
		alert("주민번호뒷자리를 입력해주세요!");
		document.mb.mem_num_b.focus();
		return false;
	}else if(isNaN(document.mb.mem_num_f.value)){
		alert("주민번호는 숫자만 입력해주세요!");
		document.mb.mem_num_f.focus();
		return false;
	}else if(isNaN(document.mb.mem_num_b.value)){
		alert("주민번호는 숫자만 입력해주세요!");
		document.mb.mem_num_b.focus();
		return false;
	}else if (document.mb.pw.value == ""){
		alert("비밀번호를 입력해주세요!");
		document.mb.pw.focus();
		return false;
	}else if (isNaN(document.mb.p_n.value)){
		alert("핸드폰 번호는 숫자만 입력해주세요!");
		document.mb.p_n.focus();
		return false;
	}else {
		return true;
	}
}

function pw_check() {
	if(document.mb.pw.value == ""){
		alert("비밀번호를 입력해주세요!");
		document.mb.pw.focus();
		return false;
	}else if(document.mb.pw.value == document.mb.pw_re.value){
		alert("비밀번호 동일합니다! 계속 진행해주세요!");
		return false;
	}else{
		alert("비밀번호가 다릅니다 다시 기입해주세요.");
		document.mb.pw.focus();
		return false;
	}
}