package org.eclipse.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.model.Produit;
import org.eclipse.service.ProduitService;

@WebServlet("/production")
public class ProductionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProduitService produitService = new ProduitService();


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("produits", produitService.findAll());
		getServletContext().getRequestDispatcher("/WEB-INF/produit/produire.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("idProduit"));
		String nom = request.getParameter("nom");
		String description = request.getParameter("descprition");
		String imageUrl = request.getParameter("imageUrl");
		float prixUnitaire = request.getParameter("PrixUnitaire");
		//int quantiteEnStock = request.getParameter("quantiteEnStock");
		Produit produit = new Produit(idProduit, nom, description, imageUrl, prixUnitaire, quantiteEnStock );
		produitService.save(produit);
		doGet(request, response);
	}

}
