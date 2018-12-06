<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8" isELIgnored="false"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Concession</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><button class="btn navbar-btn" onclick="window.location.href='/ConcessionFront/vehicules'"><span class="glyphicon glyphicon-car"></span> Voitures d'occasion</button></li>
      <li><button class="btn navbar-btn" onclick="window.location.href='/ConcessionFront/models'"><span class="glyphicon glyphicon-car"></span> Voitures Neuves</button></li>
      
    </ul>
    <ul class="nav navbar-nav navbar-right">
    
    	<c:if test="${empty connecteduser}">

      <li><button class="btn navbar-btn" data-toggle="modal" data-target="#enregistrement"><span class="glyphicon glyphicon-user"></span> Créer son compte</button></li>

      <li><button class="btn navbar-btn" data-toggle="modal" data-target="#connection"><span class="glyphicon glyphicon-log-in"></span> Se connecter</button></li>
      	</c:if>	
      	<c:if test="${not empty connecteduser}">
      		<c:if test="${connecteduser.role == 'Client'}">
		      	<li><button class="btn navbar-btn" onclick="window.location.href='/ConcessionFront/venteVehicules'"><span class="glyphicon glyphicon-plus"></span> Vendez votre voiture</button></li>
		      	<li><button class="btn navbar-btn" onclick="window.location.href='/ConcessionFront/logout'"><span class="glyphicon glyphicon-log-out"></span> Se déconnecter</button></li>
			</c:if>
			<c:if test="${connecteduse.role == 'Concessionnaire' }">
				<li><button class="btn navbar-btn" onclick="window.location.href='/ConcessionFront/venteVehicules'"><span class="glyphicon glyphicon-plus"></span> Liste des Voitures d'occasion en attente</button></li>
			</c:if>
		</c:if>
    </ul>
  </div>
</nav>


<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

<div class="carousel-inner" role="listbox" style="height: 400">
      <div class="item active">
        <img src="images/voitureOcas.jpg" alt="Voiture" width="1200" height="250">
        <div class="carousel-caption">
          <h3>Voitures d'occasion</h3>
          <p>Large choix de voitures d'occasion</p>
        </div>      
      </div>

      <div class="item">
        <img src="images/Voiture2.jpg" alt="Voiture" width="1200" height="500">
        <div class="carousel-caption">
          <h3>Voitures neuves</h3>
          <p>Achat de voitures neuves multi-options</p>
        </div>      
      </div>
    
      <div class="item">
        <img src="images/Concession.jpg" alt="Voiture" width="1200" height="500">
        <div class="carousel-caption">
          <h3>Venez nous rencontrer</h3>
          <p>DMR Formation</p>
        </div>      
      </div>
    </div>
     <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
    




<!-- Modal Pour la connection -------------------------------------------------------------------------->


<div id="connection" class="modal fade" role="dialog" >
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
			<div class="modal-header">
				<h4><span class="glyphicon glyphicon-lock"></span> Connection</h4>
			</div>
			<div class="modal-body">

				<form:form  method="post" action="" modelAttribute="user">
      <div class="modal-body mx-3">
      <div class="alert alert-danger" style="display:none;">
        </div>
        <div class="md-form mb-5">
          <i class="fa fa-user prefix grey-text"></i>
          <form:label  path="login">Votre Nom</form:label>
          <form:input type="text"  class="form-control validate" path="login"/>
          <form:errors path="login"/>
          
        </div>
       

        <div class="md-form mb-4">
          <i class="fa fa-lock prefix grey-text"></i>
          <form:label data-error="wrong" data-success="right" for="orangeForm-pass" path="password">Votre mot de passe</form:label>
          <form:input type="password" id="orangForm-pass" class="form-control validate" path="password"/>
          <form:errors path="password"/>
        </div>
        
        

      </div>
     
      </form:form>
       <div class="modal-footer d-flex justify-content-center">
        <button class="btn btn-deep-orange" id="login-button">Se connecter</button>
      </div>
				</div>
			</div>
			</div>
	</div>
	
	


<!-- Modal Pour la création de compte -------------------------------------------------------------------------->


<div class="modal fade" id="enregistrement" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
  aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header text-center">
        <h4 class="modal-title w-100 font-weight-bold"> <span class="glyphicon glyphicon-lock"></span> Créer votre compte</h4>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <form:form  method="post" action="" modelAttribute="newUser">
      <div class="modal-body mx-3">
      
      <div class="alert alert-danger" style="display:none;">
        </div>
        <div class="md-form mb-5">
          <i class="fa fa-user prefix grey-text"></i>
          <form:label data-error="wrong" data-success="right" for="orangeForm-name" path="login">Votre Nom</form:label>
          <form:input type="text" id="orangeForm-name" class="form-control validate" path="login"/>
          <form:errors path="login"/>
          
        
        </div>
       

        <div class="md-form mb-4">
          <i class="fa fa-lock prefix grey-text"></i>
          <form:label data-error="wrong" data-success="right" for="orangeForm-pass" path="password">Votre mot de passe</form:label>
          <form:input type="password" id="orangeForm-pass" class="form-control validate" path="password"/>
          <form:errors path="password"/>

        </div>
         <div class="md-form mb-4">
          <i class="fa fa-lock prefix grey-text"></i>
          <form:label data-error="wrong" data-success="right" for="orangeForm-pass" path="password">Votre role</form:label><br>
			<form:select path="role">
				<form:option value="Client">Client</form:option>
			</form:select>
        </div>

      </div>
      
      </form:form>
      <div class="modal-footer d-flex justify-content-center">
        <button class="btn btn-deep-orange" id="signup-button">Enregistrer</button>
      </div>
    </div>
  </div>
</div>

</body>


</html>