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

/* Function pour la recherche ****************************************************************************/

function rechercheInput(ri) {
	var pattern = $(ri).val().toLowerCase();
	$(".element").show().filter(function() {
		$(this).toggle($(this).data("recherche").toLowerCase().indexOf(pattern) > -1);
	});
}

/* listener Sur boutton valider**********************************************************************/

function clickBoutonValider(bv) {
	var id = $(bv).data("id");
	$.ajax({
		
		"url": "vehiculesAValider/valider",
		"method": "GET",
		"data" : {
			"id": id,
		},
		"error" : function(xhr, status, error) {
		},
		"success": function(data, status, xhr) {
			$(".element[data-id="+id+"]").remove();
		}
	});
}

/* listener Sur boutton supprimer**********************************************************************/
function clickBoutonSupprimer(bs) {
	

	var id = $(bs).data("id");
	$.ajax({
		"url": "vehiculesAValider/supprimer", 
		"data": {
				"id": id,
			},
		"method": "GET",
		"error": function(xhr, status, error) {			
			},
		"success": function(data, status, xhr) {

				$(".element[data-id="+id+"]").remove();
			}
		});
}
