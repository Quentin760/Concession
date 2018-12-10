<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<div class="container">
	<div class="row text-center">


		<div class="recherche col-sm-4 " style="marging-top: 10px">
			<h3>Voitures d'occasion, un large choix de voiture</h3>
			<p>Recherche par nom de voiture, couleur, moteur, année</p>
			<form role="form" class="navbar-form navbar-left ">
				<div class="form-group has-feedback">
					<label class="control-label">Recherche :</label> <input type="text"
						class="form-control" placeholder="Recherche..."
						onkeyup="rechercheInput(this)" /> <i
						class="form-control-feedback glyphicon glyphicon-search"></i>
				</div>
			</form>

		</div>



		<c:forEach items="${aValider}" var="vehicules">
			<div class="element col-sm-4" id="${vehicules.id}"
				data-recherche="${vehicules.nom} ${vehicules.couleur} ${vehicules.moteur} ${vehicules.année}"
				data-id="${vehicules.id}" style="padding-top: 10px">
				<div class="thumbnail">
					<button type="submit"
						onclick="window.location.href='${vehicules.image}'">Photo
						Voiture</button>
					<%--       <img src="${vehicules.image}" alt="Voiture" style="with:100%"> --%>
					<p class="nom">
						<strong>${vehicules.nom}</strong>
					</p>
					<p>${vehicules.année} | ${vehicules.moteur} | ${vehicules.couleur}</p>
			
					<h4 class="prix">${vehicules.prixTotal} €</h4>
				
				
				<c:if test="${connecteduser.role == 'Concessionnaire'}">
					<button class="btn btn-success" data-id="${vehicules.id}" onclick="clickBoutonValider(this)">Valider mise en vente</button>
					<button class="btn btn-danger" data-id="${vehicules.id}" onclick="clickBoutonSupprimer(this)">Refuser mise en vente</button>
				</c:if>
				</div>
			</div>
		</c:forEach>

	</div>
</div>