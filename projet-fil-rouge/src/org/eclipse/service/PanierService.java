package org.eclipse.service;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.model.Panier;

public class PanierService {
	private List<Panier> paniers;

	public PanierService() {
		paniers = new ArrayList<>();
	}

	public void save(Panier panier) {
		paniers.add(panier);
	}

	public void remove(Panier panier) {
		paniers.remove(panier);
	}
	
	public void update(Panier panier) {
		for (Panier prod: paniers) {
			if (prod.getIdPanier() == panier.getIdPanier()) {
				prod = panier;
			}
		}
	}

	public List<Panier> getPaniers() {
		return paniers;
	}

	public void setPanier(List<Panier> paniers) {
		this.paniers = paniers;
	}
}
