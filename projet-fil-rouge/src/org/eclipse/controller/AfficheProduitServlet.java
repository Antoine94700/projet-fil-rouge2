package org.eclipse.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eclipse.dao.ProduitDao;
import org.eclipse.model.Produit;
import org.eclipse.service.ProduitService;

/**
 * Servlet implementation class AfficheProduitServlet
 */
@WebServlet("/produit")
public class AfficheProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProduitDao produitDao = new ProduitDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AfficheProduitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		int id = Integer.parseInt((String) request.getParameter("idProduit"));
		ProduitService produitService = (ProduitService) session.getAttribute("produitService");
		Produit produit = produitService.findById(id);
		session.setAttribute("produit", produit);
		this.getServletContext().getRequestDispatcher("/WEB-INF/produit/produit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
