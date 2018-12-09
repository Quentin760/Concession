<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



	<h1>Formulaire de vente de votre voiture</h1>
	<div class="container-fluid">
	<form:form method="POST" action="nouvelleVoiture" modelAttribute="model">
	
                                
          <div class="form-group">
                 <label name="nom">Nom</label>
                 <input class="form-control" type="text" name="nom"/>
          </div>
          <div class="form-group">
                 <label name="couleur">Couleur</label>
                  <input class="form-control" type="text" name="couleur"/>
          </div>
           <select class="form-control" name="moteur">
          <c:forEach items="${Couleur}" var="moteur">
                         <option>$couleur}</option>
            </c:forEach>
       </select>
           <div class="form-group">
                 <label name="prixTotal">Prix</label>
                 <input class="form-control" type="number" min="0" name="prixTotal"/>
          </div>
          
          <label name="moteur">Choix du moteur</label>
          <select class="form-control" name="moteur">
          	<c:forEach items="${TypeMoteur}" var="moteur">
                         <option>${moteur}</option>
            </c:forEach>
         </select>
	
  		
  		 <input type="submit" value="Valider" name="submit" class="btn btn-success">

	</form:form>
	
	
</div>	