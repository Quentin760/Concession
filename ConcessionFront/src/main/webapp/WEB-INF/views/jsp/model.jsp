<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<div class="container">
<div class="row text-center">
			<div class="recherche col-sm-4 " style="marging-top: 10px">
			<h3>Voitures neuves, un large choix de voiture</h3>
			<p>Recherche par nom de voiture, marque</p>
			<form role="form" class="navbar-form navbar-left ">
				<div class="form-group has-feedback">
					<label class="control-label">Recherche :</label> <input type="text"
						class="form-control" placeholder="Recherche..."
						onkeyup="rechercheInput(this)" /> <i
						class="form-control-feedback glyphicon glyphicon-search"></i>
				</div>
			</form>

		</div>

<c:forEach items="${models}" var="model">
  <div class="element col-sm-4" id="${model.id}" data-recherche="${model.nom} " data-id="${model.id}"style="padding-top:10px">
    <div class="thumbnail">
      <img src="" alt="Voiture">
      <p><strong>${model.nom}</strong></p>
 
      
      <h4 id="prixVehicule">${model.prixDeBase} €</h4>
      
      <c:if test="${empty connecteduser}">
					<p>Connectez-vous pour pouvoir acheter ce véhicule</p>
		</c:if>
     	<c:if test="${connecteduser.role == 'Client'}">
			<button class="btn btn-primary">Acheter</button>
		</c:if>
		<c:if test="${connecteduser.role == 'Concessionnaire'}">
			<button class="btn btn-danger" data-id="${vehicules.id}" onclick="clickBoutonSupprimerModel(this)">Refuser mise en vente</button>
		</c:if>
    </div>
  </div>
  </c:forEach>

</div>
</div>