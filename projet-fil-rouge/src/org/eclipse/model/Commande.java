package org.eclipse.model;

import java.util.Date;

public class Commande {
	private int idCommande;
	private Date dateCommande;
	private Utilisateur utilisateur;

	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setClient(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", dateCommande=" + dateCommande + ", utilisateur=" + utilisateur + "]";
	}

}