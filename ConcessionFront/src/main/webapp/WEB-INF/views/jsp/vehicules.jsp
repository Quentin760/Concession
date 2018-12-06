<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>




<div class="container-fluid">
<div class="row text-center">
				<div class="col-sm-4 ">
					<form class="navbar-form navbar-left ">
				    	<div class="form-group inner-addon left-addon" >
		    				<i class="glyphicon glyphicon-search"></i>
				        	<input id="search" type="text" class="form-control" placeholder="Search..." onkeyup="rechercheInput(this)">
				    	</div>
				 	</form>
				</div>

<c:forEach items="${vehicules}" var="vehicules">
  <div class="element col-sm-4" id="${vehicules.id}" data-recherche="${vehicules.nom} ${vehicules.couleur} ${vehicules.moteur} ${vehicules.année}" data-id="${vehicules.id}" style="padding-top:10px">
    <div class="thumbnail">
    <button type="submit" onclick = "window.location.href='${vehicules.image}'">Photo Voiture</button>
<%--       <img src="${vehicules.image}" alt="Voiture" style="with:100%"> --%>
      <p><strong>${vehicules.nom}</strong></p>
      <p>${vehicules.année} | ${vehicules.moteur} | ${vehicules.couleur}</p>
      
      <h4 id="prixVehicule">${vehicules.prixTotal} €</h4>
      <button class="btn btn-primary">Acheter</button>
    </div>
  </div>
  </c:forEach>

</div>
</div>