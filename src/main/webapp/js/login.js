/**
 * 
 */
 
 function doLogin () {
  	const username = $('#username').val(); // document.getElementById('username').value;
  	const password = $('#password').val();
  	
  	const credentials = {'username': username, 'password': password};
  	
  	$.ajax({
 		url: '/login/submit',
 		method: 'post',
 		async: false,
 		contentType: 'application/json',
 		dataType: 'json',
 		data: JSON.stringify(credentials), 	
  	
  		success: function() {
  		},
  		
  		error: function() {
  		}
  	});
  }
 