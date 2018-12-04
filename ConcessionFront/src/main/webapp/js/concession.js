/**

 * 
 */


$(document).ready(function() {

/* Login AJAX **************************************************************************/
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
					
						$("#connection .alert").removeClass("alert-success").addClass("alert-danger").html("<strong>Erreur: Login/Password incorrect </strong>").show();
					},
				"success": function(data, status, xhr) {
					
						$("#connection .alert").removeClass("alert-danger").addClass("alert-success").html("<strong>Connexion reussi</strong>").show();
						window.setTimeout(function() {
							location.href = "/ConcessionFront/vehicules";
						}, 1000);
						}
			});
	});

/* Signup AJAX **************************************************************************/
$("#signup-button").click(function() {
	
	$.ajax({
			"url": "login/add",
			"data": {
				"login": $("#enregistrement input[name=login]").val(), 
				"password": $("#enregistrement input[name=password]").val(),
				"role": $("#enregistrement select[name=role]").val(),
				"url": location.href
				},
			"method": "POST",
			"error": function(xhr, status, error) {
			
					$("#enregistrement .alert").removeClass("alert-success").addClass("alert-danger").html("<strong>Erreur: Login/Password incorrect</strong>").show();
				},
			"success": function(data, status, xhr) {
				
					$("#enregistrement .alert").removeClass("alert-danger").addClass("alert-success").html("<strong>Enregistrement réussis !</strong>").show();
					window.setTimeout(function() {
						location.href = "/ConcessionFront/vehicules";
					}, 1000);
					}
		});
});


/* Vérification login AJAX **************************************************************************/

$("#orangeForm-name").keyup(function(event) {
	
	$.ajax({
			"url": "login/checkLogin",
			"data": {
				"login": $("#enregistrement input[name=login]").val(), 
				},
			"method": "GET",
			"error": function(xhr, status, error) {
				
					$("#enregistrement .alert").removeClass("alert-success").addClass("alert-danger").html("<strong>Erreur: Nom utilisateur déjà utilisé</strong>").show();
					$("#signup-button").prop('disabled', true);
			},
			"success": function(data, status, xhr) {
			
					$("#enregistrement .alert").hide();
					$("#signup-button").prop('disabled', false);
					
					}
		});
});

});