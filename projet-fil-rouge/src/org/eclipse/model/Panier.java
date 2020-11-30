package org.eclipse.model;

public class Panier {
	private int idPanier;
	private Utilisateur utilisateur;

	public Panier() {
	}

	public Panier(int idPanier, Utilisateur utilisateur) {
		this.idPanier = idPanier;
		this.utilisateur = utilisateur;
	}

	public int getIdPanier() {
		return idPanier;
	}

	public void setIdPanier(int id) {
		this.idPanier = id;
	}

	public Utilisateur getClient() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "Panier [idPanier=" + idPanier + ", utilisateur=" + utilisateur + "]";
	}

}