<!--
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Utilisateur</title>
</head>
<body>
	<h2>Gestion des utilisateurs</h2>
	<h3>
		<c:out value="${ operation }"></c:out>
		Utilisateur
	</h3>
	<form method="POST" action="${ action }">
		<c:if test="${ !fn:contains(operation, 'Ajouter') }">
			<div>
				<label for="idUtilisateur">Identifiant utilisateur</label> <input type="text" id="idUtilisateur"
					name="idUtilisateur">
			</div>
		</c:if>
		<c:if test="${ !fn:contains(operation, 'Supprimer') }">
			<div>
				<label for="nom">Nom *</label> <input type="text" id="nom"
					name="nom"" >
			</div>
			<div>
				<label for="prenom">Prénom *</label> <input type="text" id="prenom"
					name="prenom">
			</div>
		</c:if>
		<input type="submit" value="${operation }">
	</form>
</body>
</html>
-->