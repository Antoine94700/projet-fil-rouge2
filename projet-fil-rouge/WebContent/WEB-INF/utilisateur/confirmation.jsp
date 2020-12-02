<!--
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmation</title>
</head>
<body>
	<c:if test="${ !fn:contains(participePasse, 'consult') }">
		<h2>Page de confirmation</h2>
		<c:out
			value="L'utilisateur nommée ${ utilisateur.prenom } ${ utilisateur.nom } a bien été ${ participePasse } dans notre base de données."></c:out>
	</c:if>
	<h2>Liste des utilisateurs</h2>
	<ul>
		<c:forEach items="${ utilisateurs }" var="element">
			<li><c:out
					value=" ${ element['idUtilisateur'] } ${ element['nom'] } ${ element['prenom'] }" /></li>
		</c:forEach>
	</ul>
	<c:url value="/" var="monLien"/>
	<a href="${ monLien }">Accueil</a>
</body>
</html>
-->