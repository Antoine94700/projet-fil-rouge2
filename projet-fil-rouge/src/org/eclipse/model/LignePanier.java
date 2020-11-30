package org.eclipse.model;

public class LignePanier {
	private int idLignePanier;
	private int qteCommandee;
	private Produit produit;
	private Panier panier;

	public LignePanier() {
	}

	public LignePanier(int idLignePanier, int qteCommandee, Produit produit, Panier panier) {
		this.idLignePanier = idLignePanier;
		this.qteCommandee = qteCommandee;
		this.produit = produit;
		this.panier = panier;
	}

	public int getIdLignePanier() {
		return idLignePanier;
	}

	public void setIdLignePanier(int idLignePanier) {
		this.idLignePanier = idLignePanier;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	public int getQteCommandee() {
		return qteCommandee;
	}

	public void setQteCommandee(int qteCommandee) {
		this.qteCommandee = qteCommandee;
	}

	@Override
	public String toString() {
		return "LignePanier [idLignePanier=" + idLignePanier + ", qteCommandee=" + qteCommandee + ", produit=" + produit + ", panier="
				+ panier + "]";
	}

}