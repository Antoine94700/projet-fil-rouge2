<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>Gestion produits</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">e-commerce</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link"
					href="index.jsp">Accueil <span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item"><a class="nav-link" href="ajoutUtilisateur">Connexion</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="panier">Panier</a>
				</li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<div class="row">
			<div class="col-lg-3 text-center">
				<h3>Article :</h3>
				<p>
					<c:out value="${produit.nom }" />
				</p>
			</div>
			<div class="col-lg-4">
				<img src=" ${produit.imageUrl }" alt="" />

			</div>
			<div class="col-lg-2">
				<h3>Prix :</h3>
				<p>
					<c:out value="${produit.prixUnitaire } € "></c:out>
				</p>
			</div>

			<div class="col-lg-3">
				<h3>Description :</h3>
				<p>

					<c:out value="${produit.description }"></c:out>
				</p>
			</div>
		</div>

		<div class="col-lg-3">
			<h3>Quantité :</h3>
			<p>

				<c:out value="${produit.quantiteEnStock }"></c:out>
			</p>
		</div>
	</div>

	<a href="ajoutProduit">Ajout Produit</a>
</body>
</html>