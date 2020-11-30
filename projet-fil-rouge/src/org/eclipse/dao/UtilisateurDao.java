package org.eclipse.dao;

import org.eclipse.config.MyConnection;
import org.eclipse.model.Produit;
import org.eclipse.model.Utilisateur;

import java.util.*;
import java.sql.*;

public class UtilisateurDao implements Dao<Utilisateur>{

	
	
	@Override
	public Utilisateur save(Utilisateur utilisateur) {
		Connection c = MyConnection.getConnection();
		if(c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("INSERT INTO Utilisateur (nom,prenom,type) values (?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, utilisateur.getCourriel());
				ps.setString(2, utilisateur.getMotDePasse());
				ps.setString(3,utilisateur.getNom());
				ps.setString(4,utilisateur.getPrenom());
				ps.setString(5,utilisateur.getType());
				ps.executeUpdate();
				ResultSet resultat = ps.getGeneratedKeys();
				if (resultat.next()) {
					utilisateur.setIdUtilisateur(resultat.getInt(1));
					return utilisateur;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public void remove(Utilisateur utilisateur) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("DELETE FROM Utilisateur WHERE idUtilisateur = ?;");
				ps.setInt(1, utilisateur.getIdUtilisateur());
				ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public Utilisateur update(Utilisateur utilisateur) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("UPDATE Utilisateur SET courriel=?, motDePasse=? nom=?, prenom=?, type=? WHERE idUtilisateur=?", PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, utilisateur.getCourriel());
				ps.setString(2, utilisateur.getMotDePasse());
				ps.setString(3,utilisateur.getNom());
				ps.setString(4,utilisateur.getPrenom());
				ps.setString(5,utilisateur.getType());
				int a = ps.executeUpdate();
				if (a != 0) {
					return utilisateur;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Utilisateur findById(int id) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("SELECT * FROM Utilisateur WHERE idUtilisateur=?;");
				ps.setInt(1, id);
				ResultSet result = ps.executeQuery();
				if (result.next()) {
					int a = result.getInt(1);
					String courriel = result.getString(2);
					String motDePasse = result.getString(3);
					String nom = result.getString(4);
					String prenom = result.getString(5);
					String type = result.getString(6);
					Utilisateur utilisateur = new Utilisateur(a, courriel, motDePasse, nom, prenom, type );
					return utilisateur;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	@Override
	public Utilisateur findByNomAndPrenom(String nom, String prenom) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("SELECT * FROM Utilisateur WHERE nom=?, prenom=?");
				ps.setString(1, nom);
				ps.setString(2, prenom);
				ResultSet result = ps.executeQuery();
				if (result.next()) {
					int a = result.getInt(1);
					String courriel = result.getString(2);
					String motDePasse = result.getString(3);
					String n = result.getString(4);
					String p = result.getString(5);
					String type = result.getString(6);
					Utilisateur utilisateur = new Utilisateur(a, courriel, motDePasse, n, p, type );
					return utilisateur;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	

	@Override
	public List<Utilisateur> findAll() {
		ArrayList<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
		Connection c = MyConnection.getConnection();
		if ( c != null);
		try {
			PreparedStatement ps = c.prepareStatement("SELECT * FROM Utilisateur;");
			ResultSet result = ps.executeQuery();
			while (result.next()) {
				int a = result.getInt(1);
				String courriel = result.getString(2);
				String motDePasse = result.getString(3);
				String nom = result.getString(4);
				String prenom = result.getString(5);
				String type = result.getString(6);
				Utilisateur utilisateur = new Utilisateur(a, courriel, motDePasse, nom, prenom, type );
				utilisateurs.add(utilisateur);
			}
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		return utilisateurs;
	}

	@Override
	public Produit findByNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}

