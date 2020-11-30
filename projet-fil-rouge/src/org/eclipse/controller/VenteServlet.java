package org.eclipse.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.service.ProduitService;

@WebServlet("/vente")
public class VenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProduitService produitService = new ProduitService();


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("produits", produitService.findAll());
		getServletContext().getRequestDispatcher("/WEB-INF/produit/achat.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idProduit = Integer.parseInt(request.getParameter("idProduit"));
		produitService.remove(idProduit);
		doGet(request, response);
	}

}