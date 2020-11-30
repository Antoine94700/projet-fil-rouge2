package org.eclipse.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.model.Utilisateur;
import org.eclipse.service.UtilisateurService;

@WebServlet("/ModificationUtilisateurServlet")
public class ModificationUtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private UtilisateurService utilisateurService = new UtilisateurService();
       protected void doGet(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException{
    	   this.getServletContext().getRequestDispatcher("/WEB-INF/utilisateur/modificationUtilisateur.jsp").forward(request, response);
       }
       
       protected void doPost(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException{
    	   int a = Integer.parseInt(request.getParameter("a"));
    	   String courriel = request.getParameter("courriel");
   		String motDePasse = request.getParameter("motDePasse");
   		String nom = request.getParameter("nom");
   		String prenom = request.getParameter("prenom");
   		String type = request.getParameter("type");
    	   Utilisateur utilisateur = new Utilisateur(a, courriel, motDePasse, nom, prenom, type);
    	   request.setAttribute("utilisateur", utilisateur);
    	   try {
			utilisateurService.update(utilisateur);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   request.setAttribute("participePasse", "modifie");
    	   request.setAttribute("utilisateur", utilisateurService.findAll());
    	   this.getServletContext().getRequestDispatcher("/WEB-INF/utilisateur/confirmation.jsp").forward(request, response);
       }
}
