<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>




<div class="container-fluid">
<div class="row text-center">
			<div class="col-sm-4 ">
				<form class="navbar-form navbar-left ">
				    	<div class="form-group inner-addon left-addon" >
		    				<i class="glyphicon glyphicon-search"></i>
				        	<input id="search" type="text" class="form-control" placeholder="Search..." >
				    	</div>
				 </form>
			</div>

<c:forEach items="${vehicules}" var="voiture">
  <div class="col-sm-4" style="padding-top:10px">
    <div class="thumbnail">
    <button type="submit" onclick = "window.location.href='${voiture.image}'">image</button>
      <img src="${voiture.image}" alt="Voiture" style="with:100%">
      <p><strong>${voiture.nom}</strong></p>
      <p>${voiture.année} | ${voiture.moteur} | ${voiture.couleur}</p>
      
      <h4 id="prixVehicule">${voiture.prixTotal} €</h4>
      <button class="btn btn-primary">Acheter</button>
    </div>
  </div>
  </c:forEach>

</div>
</div>