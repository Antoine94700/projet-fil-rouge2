<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Boutique en ligne</title>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://kit.fontawesome.com/a6c393237d.js"></script>
</head>
<body>

	<!-- Page Content -->
	<div class="container">
		<div class="row">
			<div class="col-lg-3 text-center">
				<h3>Article :</h3>
				<p>
					<c:out value="${Produit.nom }" />
				</p>
			</div>
			<div class="col-lg-4">
				<img src=" ${Produit.imageURL }" alt="" />

			</div>
			<div class="col-lg-2">
				<h3>Prix :</h3>
				<p>
					<c:out value="${Produit.prixUnitaire } euros "></c:out>
				</p>
			</div>

			<div class="col-lg-3">
				<h3>Description :</h3>
				<p>

					<c:out value="${Produit.description }"></c:out>
				</p>
			</div>
		</div>
		
		<div class="col-lg-3">
				<h3>Quantité :</h3>
				<p>

					<c:out value="${Produit.quantiteEnStock }"></c:out>
				</p>
			</div>
		</div>


</body>
</html>