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
			<label for="description">Description : </label> 
			<input type="text" id="description" name="description" onkeyup="validerDescription()">
			<span id="validationDdescription"></span>
		</div>
				<div>
			<label for="identifiant">imageUrl </label> 
			<input type="text" id="imageUrl" name="imageUrl" onkeyup="validerImageUrl()"> 
			<span id="validationImageUrl"></span>
		</div>
		<div>
			<label for="prixUnitaire"> Prix unitaire : </label> 
			<input type="text" id="prixUnitaire" name="prixUnitaire" onkeyup="validerPrixunitaire()">
			<span id="validationPrixUnitaire"></span>
		</div>	
		<div>
			<label for="quantiteEnStock"> QuantiteEnStock : </label> 
			<input type="text" id="quantiteEnStock" name="quantiteEnStock" onkeyup="validerQuantiteEnStock()">
			<span id="validationQuantiteEnStock"></span>
		</div>	
		<button type="submit">Ajouter</button>
	</form>
<script type="text/javascript">
<%@ include file="../../js/script.js"%>
</script>
</body>
</html>