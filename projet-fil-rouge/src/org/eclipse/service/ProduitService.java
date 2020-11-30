package org.eclipse.service;

import java.util.*;

import org.eclipse.dao.ProduitDao;
import org.eclipse.model.Produit;

public class ProduitService {
		private ProduitDao produitDao = new ProduitDao();

		
		public Produit save(Produit produit) {
			produit.setNom(produit.getNom().toUpperCase());
			return produitDao.save(produit);
		}

		public Produit update(Produit produit) throws Exception {
			if (produitDao.findById(produit.getIdProduit()) == null) {
				throw new Exception("produit introuvable");
			}
			produit.setNom(produit.getNom().toUpperCase());
			return produitDao.update(produit);
		}

		public void remove(Produit produit) throws Exception {
			if (produitDao.findById(produit.getIdProduit()) == null) {
				throw new Exception("Produit introuvable");
			}
			produitDao.remove(produit);
		}

		public Produit findById(int idProduit) {
			return produitDao.findById(idProduit);

		}

		public List<Produit> findAll() {
			return produitDao.findAll();
		}

		public Produit findByNom(String nom) {
			return produitDao.findByNom(nom);
		}
		

	}