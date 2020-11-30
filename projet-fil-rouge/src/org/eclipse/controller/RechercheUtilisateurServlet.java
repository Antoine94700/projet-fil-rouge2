/*
package org.eclipse.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.service.UtilisateurService;


@WebServlet("/RechercheUtilisateurServlet")
public class RechercheUtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UtilisateurService utiliaService = new UtilisateurService();
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
    	String resultat = "valide";
    	String nom = request.getParameter("nom");
    	String prenom = request.getParameter("prenom");
    	
    	System.out.println(nom);
    	System.out.println(prenom);
    	
    	if (nom != null) {
    		boolean result = utilisateurService.findByNom(nom);
    		response.setContentType("text/xml");
    		if (result) {
    			resultat = "invalide";
    		}
    	}
    	
    	else {
    		boolean result = utilisateurService.findByPrenom(prenom);
    		response.setContentType("text/xml");
    		if (result) {
    			resultat = "invalide";
    		}
    	}
    	
    	response.getWriter().write("<message>" + resultat + "</message>");
    	
    }
}
*/