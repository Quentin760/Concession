<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<div class="container">
	<div class="row">
		<div class="col-4 ">
			
				<form class="navbar-form navbar-left ">
				    	<div class="form-group inner-addon left-addon">
		    				<i class="glyphicon glyphicon-search"></i>
				        	<input id="search" type="text" class="form-control" placeholder="Search...">
				    	</div>
				 </form>
			
		</div>
		
		<c:forEach items="${vehicules}" var="voiture">
				<div class="col-8 card">
					
						  		<img class="card-img-top" src=".../100px180/" alt="Card image cap">
						  <div class="card-body">
							    <h4 class="card-title">${voiture.nom}</h4>
							    <p class="card-text">Année : ${voiture.année}  Moteur : ${voiture.moteur}   Couleur : ${voiture.couleur}</p>
							    
							    <h5>Prix : ${voiture.prixTotal} €</h5>
							    <a href="#" class="btn btn-primary">Acheter</a>
						  </div>
				</div>
		</c:forEach>
		
		</div>
</div>
