package org.eclipse.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.model.Produit;
import org.eclipse.service.ProduitService;
import org.eclipse.dao.ProduitDao;
import org.eclipse.controller.ProduitServlet;

@WebServlet("/AjoutProduit")
public class AjoutProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("WEB-INF/produit/ajoutProduit.jsp").forward(request, response);


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean test = true;

		String nom = request.getParameter("nomSaisi");
		String description = request.getParameter("descriptionSaisie");
		String imageUrl = request.getParameter("imageUrlSaisie");
		float prixUnitaire = request.getParameter("prixUnitaireSaisi");
		int quantiteEnStock = request.getParameter("quantiteEnStockSaisie");

		if (!test) {
			request.setAttribute("nomSaisi", nom);
			request.setAttribute("descriptionSaisie", description);
			request.setAttribute("imageUrlSaisie", imageUrl);
			request.setAttribute("prixUnitaireSaisi", prixUnitaire);
			request.setAttribute("quantiteEnStockSaisie", quantiteEnStock);
			this.getServletContext().getRequestDispatcher("WEB-INF/utilisateur/ajoutProduit.jsp").forward(request,
					response);
		} else {
			Produit produit = new Produit(, nom, description, imageUrl, prixUnitaire, quantiteEnStock);
			request.setAttribute("produit", produit);
			produitService.save(produit);
			request.setAttribute("utilisateurs", ProduitService.findAll());
			request.setAttribute("participePasse", "ajoute");
			this.getServletContext().getRequestDispatcher("/WEB-INF/utilisateur/confirmation.jsp").forward(request,
					response);
		}}}