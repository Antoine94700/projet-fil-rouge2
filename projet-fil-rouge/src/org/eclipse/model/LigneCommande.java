package org.eclipse.model;

public class LigneCommande {
	private int idLigneCommande;
	private int quantiteCommandee;
	private Produit produit;
	private Commande commande;

	public LigneCommande() {
	}

	public LigneCommande(int idLigneCommande, int quantiteCommandee, Produit produit, Commande commande) {
		this.idLigneCommande = idLigneCommande;
		this.quantiteCommandee = quantiteCommandee;
		this.produit = produit;
		this.commande = commande;
	}

	public int getIdLigneCommande() {
		return idLigneCommande;
	}

	public void setIdLigneCommade(int idLigneCommande) {
		this.idLigneCommande = idLigneCommande;
	}

	public int getQuantiteCommandee() {
		return quantiteCommandee;
	}

	public void setQuantiteCommandee(int quantiteCommandee) {
		this.quantiteCommandee = quantiteCommandee;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	@Override
	public String toString() {
		return "LigneCommande [idLigneCommande=" + idLigneCommande + ", quantiteCommandee=" + quantiteCommandee + ", produit=" + produit
				+ ", commande=" + commande + "]";
	}

}