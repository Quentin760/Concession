<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>




<div class="container">
<div class="row text-center">
			<div class="col-sm-4 ">
				<form class="navbar-form navbar-left ">
				    	<div class="form-group inner-addon left-addon">
		    				<i class="glyphicon glyphicon-search"></i>
				        	<input id="search" type="text" class="form-control" placeholder="Search...">
				    	</div>
				 </form>
			</div>

<c:forEach items="${vehicules}" var="voiture">
  <div class="col-sm-4">
    <div class="thumbnail">
      <img src="paris.jpg" alt="Paris">
      <p><strong>${voiture.nom}</strong></p>
      <p>Année : ${voiture.année}  Moteur : ${voiture.moteur}   Couleur : ${voiture.couleur}</p>
      <button class="btn btn-primary">Acheter</button>
    </div>
  </div>
  </c:forEach>

</div>
</div>