/**
 * ajax.js : Asynchronous JavaScript And Xml 
 */
console.log("1");

function ajaxFnc() {

	let xhtp = new XMLHttpRequest();
	xhtp.open("get", "EmpListServlet");
	xhtp.send();
	xhtp.onreadystatechange = function() {
		if(xhtp.onreadystate == 4 && xhtp.status == 200) {
			let data = JSON.parse(xhtp.responseText);
			console.log(data);
		}
	}
	
}
ajaxFunc();