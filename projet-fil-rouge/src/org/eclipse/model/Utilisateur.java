package org.eclipse.model;

public class Utilisateur {
	private int idUtilisateur;
	private String courriel;
	private String motDePasse;
	private String nom;
	private String prenom;
	private String type;
	
	public Utilisateur() {
	}
	public Utilisateur(int idUtilisateur, String courriel, String motDePasse, String nom, String prenom, String type) {
		this.idUtilisateur = idUtilisateur;
		this.courriel = courriel;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
		this.type = type;
	}
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getCourriel() {
		return courriel;
	}
	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", courriel=" + courriel + ", motDePasse="
				+ motDePasse + ", nom=" + nom + ", prenom=" + prenom + ", type=" + type + "]";
	}

	
	
	
}