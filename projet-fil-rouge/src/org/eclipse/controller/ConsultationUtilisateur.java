package org.eclipse.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.service.UtilisateurService;


@WebServlet("/ConsultationUtilisateur")
public class ConsultationUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private UtilisateurService utilisateurService = new UtilisateurService();
    protected void duGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
    	request.setAttribute("participePasse", "consulter");
    	request.setAttribute("utilisateurs", utilisateurService.findAll());
    	this.getServletContext().getRequestDispatcher("/WEB-INF/utilisateur/confirmation.jsp").forward(request, response);
    }
}
