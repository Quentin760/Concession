/**
 * 
 */
$(document).ready(function() {
	
$("#login-button").click(function() {
	
		$.ajax({
				"url": "login",
				"data": {
					"login": $("#connection input[name=login]").val(), 
					"password": $("#connection input[name=password]").val(),
					"url": location.href
					},
				"method": "POST",
				"error": function(xhr, status, error) {
					console.log("hello");
						$("#connection .alert").removeClass("alert-success").addClass("alert-danger").html("<strong>Erreur: Login/Password incorrect</strong>").show();
					},
				"success": function(data, status, xhr) {
						$("#connection .alert").removeClass("alert-danger").addClass("alert-success").html("<strong>Connexion !</strong>").show();
						window.setTimeout(function() {
							location.href = "/ConcessionFront/vehicules";
						}, 1000);
						}
			});
	});

});