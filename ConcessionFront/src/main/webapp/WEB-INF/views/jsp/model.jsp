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

<c:forEach items="${models}" var="model">
  <div class="element col-sm-4" id="${model.id}" data-recherche="${model.nom} " data-id="${model.id}"style="padding-top:10px">
    <div class="thumbnail">
      <img src="" alt="Voiture">
      <p><strong>${model.nom}</strong></p>
 
      
      <h4 id="prixVehicule">${model.prixDeBase} €</h4>
      <button class="btn btn-primary">Acheter</button>
    </div>
  </div>
  </c:forEach>

</div>
</div>