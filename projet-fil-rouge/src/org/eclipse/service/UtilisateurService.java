package org.eclipse.service;

import java.util.*;

import org.eclipse.dao.UtilisateurDao;
import org.eclipse.model.Utilisateur;

public class UtilisateurService {
	private UtilisateurDao utilisateurDao = new UtilisateurDao();

	
	public Utilisateur save(Utilisateur utilisateur) {
		utilisateur.setNom(utilisateur.getNom().toUpperCase());
		return utilisateurDao.save(utilisateur);
	}

	public Utilisateur update(Utilisateur utilisateur) throws Exception {
		if (utilisateurDao.findById(utilisateur.getIdUtilisateur()) == null) {
			throw new Exception("Personne introuvable");
		}
		utilisateur.setNom(utilisateur.getNom().toUpperCase());
		return utilisateurDao.update(utilisateur);
	}

	public void remove(Utilisateur utilisateur) throws Exception {
		if (utilisateurDao.findById(utilisateur.getIdUtilisateur()) == null) {
			throw new Exception("Personne introuvable");
		}
		utilisateurDao.remove(utilisateur);
	}

	public Utilisateur findById(int idUtilisateur) {
		return utilisateurDao.findById(idUtilisateur);

	}

	public List<Utilisateur> findAll() {
		return utilisateurDao.findAll();
	}

	public Utilisateur findByNomAndPrenom(String nom, String prenom) {
		return utilisateurDao.findByNomAndPrenom(nom, prenom);
	}
	

}