<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<div class="container">
	<div class="row text-center row-eq-height" style="heigth: 300px">


		<div class="recherche col-sm-4 " style="padding: 10px">
			<h3>Voitures d'occasion, un large choix de voiture</h3>
			<p>Recherche par nom de voiture, couleur, moteur, année</p>
			<form role="form" class="navbar-form navbar-left ">
				<div class="form-group has-feedback">
					<label class="control-label">Recherche :</label>
					<input type="text" class="form-control" placeholder="Recherche..." onkeyup="rechercheInput(this)" style="display: inline-block;
					max-width: 100%"/> 
					<i class="form-control-feedback glyphicon glyphicon-search"></i>
				</div>
			</form>

		</div>



		<c:forEach items="${vehicules}" var="vehicules">
			<div class="element col-sm-4" id="${vehicules.id}"
				data-recherche="${vehicules.nom} ${vehicules.couleur} ${vehicules.moteur} ${vehicules.année} ${vehicules.nomMarque}"
				data-id="${vehicules.id}" style="padding-top: 10px">
				<div class="thumbnail">
<!-- 					<button type="submit" -->
<%-- 						onclick="window.location.href='${vehicules.image}'">Photo --%>
<!-- 						Voiture</button> -->
					      <img src="${vehicules.image}" class="img-thumbnail zoom" alt="Voiture" height="150" width="150">
					<p class="nom">${vehicules.nomMarque}
						<strong> ${vehicules.nom}</strong>
					</p>
					
					<p>${vehicules.année} | ${vehicules.moteur} | ${vehicules.couleur}</p>
					<h5>${vehicules.kilometre} Kilomètres</h5>
					<h4 class="prix">${vehicules.prixTotal} €</h4>
				<c:if test="${empty connecteduser}">
					<p>Connectez-vous pour pouvoir acheter ce véhicule</p>
				</c:if>
				<c:if test="${connecteduser.role == 'Client'}">
					<button class="btn btn-primary" data-toggle="modal" data-target="#Acheter">Acheter</button>
				</c:if>
				<c:if test="${connecteduser.role == 'Concessionnaire'}">
					<button class="btn btn-danger" data-id="${vehicules.id}" onclick="clickBoutonSupprimerVehicule(this)">Supprimer</button>
				</c:if>
				</div>
			</div>
		</c:forEach>

	</div>
</div>

