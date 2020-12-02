<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajout Utilisateur</title>
</head>
<body>
	<form action="ajoutUtilisateur" method="post">
		<div>
			<label for="nom">Nom : </label> 
			<input type="text" id="nom" name="nom" onkeyup="validerNom()"> 
			<span id="validationNom"></span>
		</div>
		<div>
			<label for="prenom">Prénom : </label> 
			<input type="text" id="prenom" name="prenom" onkeyup="validerPrenom()">
			<span id="validationPrenom"></span>
		</div>
				<div>
			<label for="identifiant">Identifiant : </label> 
			<input type="text" id="identifiant" name="identifiant" onkeyup="validerIdentifiant()"> 
			<span id="validationIdentifiant"></span>
		</div>
		<div>
			<label for="motDePasse">Mot de passe : </label> 
			<input type="text" id="motDePasse" name="motDePasse" onkeyup="validerMotDePasse()">
			<span id="validationMotDePasse"></span>
		</div>	
		<button type="submit">Ajouter</button>
	</form>
<script type="text/javascript">
<%@ include file="../../js/script.js"%>
</script>
</body>
</html>