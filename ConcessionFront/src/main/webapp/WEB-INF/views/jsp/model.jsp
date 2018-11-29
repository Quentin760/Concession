<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<div class="container">
<div class="row">
		<div class="col-4">
		<div class="nav">
		<form class="navbar-form navbar-left ">
		    	<div class="form-group inner-addon left-addon">
    				<i class="glyphicon glyphicon-search"></i>
		        	<input id="search" type="text" class="form-control" placeholder="Search...">
		    	</div>
		    </form>
		    </div>
		</div>

	<c:forEach items="${models}" var="voiture">
		<div class="col-8">
		<div class="card">
		  <img class="card-img-top" src=".../100px180/" alt="Card image cap">
		  <div class="card-body">
		    <h4 class="card-title"></h4>
		    <p class="card-text"></p>
		    
		    <h5>Prix : </h5>
		    <a href="#" class="btn btn-primary">Choix des options</a>
		  </div>
		</div>
		</div>
		</c:forEach>
</div>
</div>