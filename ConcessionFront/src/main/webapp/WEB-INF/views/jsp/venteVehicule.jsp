<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



	<h1>Formulaire de vente de votre voiture</h1>
	<div class="container-fluid">
	<form:form method="POST" action="venteVehicules" enctype="multipart/form-data" modelAttribute="vehicule">
	
                                
          <div class="form-group">
                 <form:label path="nom">Nom</form:label>
                 <form:input class="form-control" type="text" path="nom"/>
          </div>
          <div class="form-group">
                 <form:label path="couleur">Couleur</form:label>
                  <form:input class="form-control" type="text" path="couleur"/>
          </div>
          <div class="form-group">
                 <form:label path="année">Année</form:label>
                 <form:input class="form-control" type="text" path="année"/>
          </div>
           <div class="form-group">
                 <form:label path="prixTotal">Prix</form:label>
                 <form:input class="form-control" type="text" path="prixTotal"/>
          </div>
          
          <form:label path="moteur">Choix du moteur</form:label>
          <form:select class="form-control" path="moteur">
          	<c:forEach items="${TypeMoteur}" var="moteur">
                         <option>${moteur}</option>
            </c:forEach>
         </form:select>
		<div class="form-group">
    		<label for="exampleFormControlFile1">Photo à joindre</label>
    		<input type="file" class="form-control-file" name="file" id="exampleFormControlFile1">
    		<input type="text" name="name"><span>Nom du Fichier (.pdf)</span>
  		</div>
  		
  		 <input type="submit" value="Valider" name="submit" class="btn btn-success">
	</form:form>
	
	
</div>	