<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



	<h1 style="text-align: center">Formulaire de vente de votre voiture</h1>
	<div class="container" style="width: 50%">
	<form:form method="POST" action="venteVehicules" enctype="multipart/form-data" modelAttribute="vehicule">
	
		<label name="marque">Choix de la marque</label>
          <select class="form-control selectpicker" name="marque" data-live-search="true" data-title="Choisissez votre marque">
          	<c:forEach items="${Marque}" var="marque">
                         <option>${marque}</option>
            </c:forEach>
         </select>
                                
          <div class="form-group">
                 <label name="nom">Nom</label>
                 <input class="form-control" type="text" name="nom"/>
          </div>
         <label name="couleur">Choix de la couleur</label>
          <select class="form-control selectpicker" name="couleur" data-live-search="true" data-title="Choisissez votre couleur">
           <option value="" disabled selected>Choix Couleur</option>
          	<c:forEach items="${Couleur}" var="couleur">
                         <option>${couleur}</option>
            </c:forEach>
         </select>
          <div class="form-group">
                 <label name="année">Année</label>
                 <input class="form-control" type="number" min="1990" max="2019" name="annee"/>
          </div>
           <div class="form-group">
                 <label name="prixTotal">Prix</label>
                 <input class="form-control" type="number" min="0" name="prixTotal"/>
          </div>
          <div class="form-group">
                 <label name="kilometre">Kilomètre</label>
                 <input class="form-control" type="number" min="0" name="kilometre"/>
          </div>
          
          <label name="moteur">Choix du moteur</label>
          <select class="form-control" name="moteur" >
           <option value="" disabled selected>Choix Moteur</option>
          	<c:forEach items="${TypeMoteur}" var="moteur">
                         <option>${moteur}</option>
            </c:forEach>
         </select>
		<div class="form-group">
    		<label for="exampleFormControlFile1">Photo à joindre</label>
    		<input type="file" class="form-control-file" name="file" id="exampleFormControlFile1">
    		<input type="text" name="name"><span>Nom du Fichier</span>
  		</div>
  		
  		 <input type="submit" value="Valider" name="submit" class="btn btn-success">
	</form:form>
	
	
</div>	