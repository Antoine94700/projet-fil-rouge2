package org.eclipse.controller;

import org.eclipse.model.Produit;
import org.eclipse.service.ProduitService;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajoutProduit")
public class AjoutProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProduitService produitService = new ProduitService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("produits", produitService.findAll());
		getServletContext().getRequestDispatcher("/WEB-INF/produit/ajoutProduit.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String nom = request.getParameter("nom");
		String description = request.getParameter("description");
		String imageUrl = request.getParameter("imageUrl");
		float prixUnitaire = Float.parseFloat(request.getParameter("prixUnitaire"));
		int quantiteEnStock = Integer.parseInt(request.getParameter("quantiteEnStock"));
		Produit produit = new Produit(id, nom, description, imageUrl, prixUnitaire, quantiteEnStock);
		produitService.save(produit);
		doGet(request, response);
		
	}
}