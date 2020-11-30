<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Modif</title>
</head>
<body>
	<form method="POST" action="modifUtilisatur">
		<div>Formulaire de modification d'un produit</div>
		<div>
			<label for="nom">Nom :</label> <input type="text" id="nom" name="nom"/> 
		</div>
		<div>
			<label for="description">Description :</label> <input type="text" id="description" name="description"  /> 
		</div>
		<div>
			<label for="prixUnitaire">Prix unitaire : </label> <input type="text" id="prixUnitaire" name="prixUnitaire"/> 
		</div>
		<div>
			<label for="quantiteEnStock">Quantite en stock : :</label> <input type="text" id="quantiteEnStock" name="quantiteEnStock"  /> 
		</div>
		<input type="submit" value="Modifier" />
	</form>
</body>
</html>