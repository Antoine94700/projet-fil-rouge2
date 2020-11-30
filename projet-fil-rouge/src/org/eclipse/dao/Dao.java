package org.eclipse.dao;
import java.util.List;

import org.eclipse.model.Produit;
import org.eclipse.model.Utilisateur;
public interface Dao<T> {
	T save(T t);
	void remove(T t);
	T update(T t);
	T findById(int id);
	List<T> findAll();
	Produit findByNom(String nom);
	Utilisateur findByNomAndPrenom(String nom, String prenom);
}