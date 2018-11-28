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

<div class="header">
		<h1>Concession</h1>
</div>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Concession</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Voitures d'occasion</a></li>
      <li><a href="model">Voiture Neuve</a></li>
      
    </ul>
    <ul class="nav navbar-nav navbar-right">
    	<c:if test="${not empty user}">

      <li><button class="btn navbar-btn" data-toggle="modal" data-target="#enregistrement"><span class="glyphicon glyphicon-user"></span> Créer son compte</button></li>

      <li><button class="btn navbar-btn" data-toggle="modal" data-target="#connection"><span class="glyphicon glyphicon-log-in"></span> Se connecter</button></li>
      	</c:if>	
      	<c:if test="${empty user}">
      <li><button class="btn navbar-btn" ><span class="glyphicon glyphicon-log-out"></span> Se déconnecter</button></li>
		</c:if>
    </ul>
  </div>
</nav>
<h1>${user}</h1>

<!-- Modal Pour la connection -------------------------------------------------------------------------->


<div id="connection" class="modal fade" role="dialog" >
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
			<div class="modal-header">
				<h4><span class="glyphicon glyphicon-lock"></span> Connection</h4>
			</div>
			<div class="modal-body">

				<form:form  method="post" action="login" modelAttribute="user">
      <div class="modal-body mx-3">
      
        <div class="md-form mb-5">
          <i class="fa fa-user prefix grey-text"></i>
          <form:label  path="login">Votre Nom</form:label>
          <form:input type="text"  class="form-control validate" path="login"/>
          <form:errors path="login"/>
          
        </div>
       

        <div class="md-form mb-4">
          <i class="fa fa-lock prefix grey-text"></i>
          <form:label data-error="wrong" data-success="right" for="orangeForm-pass" path="password">Votre mot de passe</form:label>
          <form:input type="password" id="orangeForm-pass" class="form-control validate" path="password"/>
          <form:errors path="password"/>
        </div>
        <div class="alert alert-danger" style="display:none;">
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
      <form:form  method="post" action="login/add" modelAttribute="newUser">
      <div class="modal-body mx-3">
      
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
      <div class="modal-footer d-flex justify-content-center">
        <button class="btn btn-deep-orange">Enregistrer</button>
      </div>
      </form:form>
    </div>
  </div>
</div>

</body>


</html>