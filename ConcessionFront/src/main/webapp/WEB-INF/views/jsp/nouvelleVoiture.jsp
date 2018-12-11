<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<h1 style="text-align: center">Formulaire de mise en ligne d'une nouvelle voiture</h1>
<div class="container" style="width: 50%">
	<form:form method="POST" action="nouvelleVoiture"
		modelAttribute="model">


		<div class="form-group">
			<label name="nom">Nom</label> <input class="form-control" type="text"
				name="nom" />
		</div>
		<div class="form-group">
			<label name="nomMarque">Marque</label> <select class="form-control"
				name="nomMarque">
				<c:forEach items="${Marque}" var="marque">
					<option>${marque}</option>
				</c:forEach>
			</select>
		</div>
		

		<div class="form-group">
			<label name="prixDeBase">Prix</label> <input class="form-control"
				type="text" name="prixDeBase" />
		</div>



		<input type="submit" value="Valider" name="submit"
			class="btn btn-success">

	</form:form>


</div>
