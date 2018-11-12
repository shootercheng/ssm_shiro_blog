
function getContextPath(){
	var pathname = document.location.pathname;
	var last = pathname.lastIndexOf("/");
	if(last != -1){
		return pathname.substring(0, last);
	}
}

