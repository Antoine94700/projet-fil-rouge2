package org.eclipse.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.model.Utilisateur;
import org.eclipse.service.UtilisateurService;
import org.eclipse.dao.UtilisateurDao;

@WebServlet("/ajoutUtilisateur")
public class AjoutUtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilisateurService utilisateurService = new UtilisateurService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("WEB-INF/utilisateur/ajoutUtilisateur.jsp").forward(request,
				response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean test = true;

		String courriel = request.getParameter("courrielSaisi");
		String motDePasse = request.getParameter("motDePasseSaisi");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String type = request.getParameter("typeSaisi");

		try {
			verifChaine(nom);
		} catch (Exception e) {
			request.setAttribute("NomIncorrect", e.getMessage());
			test = false;
		}

		try {
			verifChaine(prenom);
		} catch (Exception e) {
			request.setAttribute("prenomIncorrect", e.getMessage());
		}

		if (!test) {
			request.setAttribute("courrielSaisi", courriel);
			request.setAttribute("motDePasseSaisi", motDePasse);
			request.setAttribute("nomSaisi", nom);
			request.setAttribute("prenomSaisi", prenom);
			request.setAttribute("typeSaisi", type);
			this.getServletContext().getRequestDispatcher("WEB-INF/utilisateur/ajoutUtilisateur.jsp").forward(request,
					response);
		} else {
			Utilisateur utilisateur = new Utilisateur(0, courriel, motDePasse, nom, prenom, type);
			request.setAttribute("utilisateur", utilisateur);
			utilisateurService.save(utilisateur);
			request.setAttribute("utilisateurs", utilisateurService.findAll());
			request.setAttribute("participePasse", "ajoute");
			this.getServletContext().getRequestDispatcher("/WEB-INF/utilisateur/confirmation.jsp").forward(request,
					response);
		}
	}

	public void verifChaine(String s) throws Exception {
		if (s == null || s.length() < 2)
			throw new Exception("La chaine doit comporter au moins deux caracteres");
		char c = s.charAt(0);
		if (!(c >= 'A' && c <= 'Z'))
			throw new Exception("La chaane doit commencer par une lettre en majuscule");
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z'))
				throw new Exception("La chaane ne peut contenir que des lettres");
		}

	}
}
