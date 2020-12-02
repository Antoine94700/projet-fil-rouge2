package org.eclipse.controller;

import org.eclipse.model.Utilisateur;
import org.eclipse.service.UtilisateurService;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/utilisateur")
public class UtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilisateurService utilisateurService = new UtilisateurService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("utilisateur", utilisateurService.findAll());
		getServletContext().getRequestDispatcher("/WEB-INF/utilisateur/utilisateur.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String courriel = request.getParameter("courriel");
		String motDePasse = request.getParameter("motDePasse");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String type = request.getParameter("type");
		Utilisateur utilisateur = new Utilisateur(id, courriel, motDePasse, nom, prenom, type);
		utilisateurService.save(utilisateur);
		doGet(request, response);
		
	}
}