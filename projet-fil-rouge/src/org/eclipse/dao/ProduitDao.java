package org.eclipse.dao;

import java.sql.*;
import java.util.*;

import org.eclipse.config.MyConnection;
import org.eclipse.model.Produit;
import org.eclipse.model.Utilisateur;



	public class ProduitDao implements Dao<Produit>{

		
		
		@Override
		public Produit save(Produit produit) {
			Connection c = MyConnection.getConnection();
			if(c != null) {
				try {
					PreparedStatement ps = c.prepareStatement("INSERT INTO Produit (nom, description, imageUrl, prixUnitaire, quantiteEnStock) values (?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
					ps.setString(1, produit.getNom());
					ps.setString(2,produit.getDescription());
					ps.setString(3,produit.getImageUrl());
					ps.setFloat(4,produit.getPrixUnitaire());
					ps.setInt(5,produit.getQuantiteEnStock());
					ps.executeUpdate();
					ResultSet resultat = ps.getGeneratedKeys();
					if (resultat.next()) {
						produit.setIdProduit(resultat.getInt(1));
						return produit;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return null;
		}
		
		@Override
		public void remove(Produit produit) {
			Connection c = MyConnection.getConnection();
			if (c != null) {
				try {
					PreparedStatement ps = c.prepareStatement("DELETE FROM Produit WHERE idProduit = ?;");
					ps.setInt(1, produit.getIdProduit());
					ps.executeUpdate();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}

		@Override
		public Produit update(Produit produit) {
			Connection c = MyConnection.getConnection();
			if (c != null) {
				try {
					PreparedStatement ps = c.prepareStatement("UPDATE Produit SET courriel=?, nom=?, description=?, imageUrl=?, prixUnitaire=?, quantiteEnStock=?; WHERE idUtilisateur=?", PreparedStatement.RETURN_GENERATED_KEYS);
					ps.setString(1, produit.getNom());
					ps.setString(2,produit.getDescription());
					ps.setString(3,produit.getImageUrl());
					ps.setFloat(4,produit.getPrixUnitaire());
					ps.setInt(5,produit.getQuantiteEnStock());
					int a = ps.executeUpdate();
					if (a != 0) {
						return produit;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return null;
		}

		@Override
		public Produit findById(int id) {
			Connection c = MyConnection.getConnection();
			if (c != null) {
				try {
					PreparedStatement ps = c.prepareStatement("SELECT * FROM Produit WHERE idProduit=?;");
					ps.setInt(1, id);
					ResultSet result = ps.executeQuery();
					if (result.next()) {
						int a = result.getInt(1);
						String nom = result.getString(2);
						String description = result.getString(3);
						String imageUrl = result.getString(4);
						float prixUnitaire = result.getFloat(5);
						int quantiteEnStock = result.getInt(6);
						Produit produit = new Produit(a, nom, description, imageUrl, prixUnitaire, quantiteEnStock );
						return produit;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return null;
		}
		
		@Override
		public Produit findByNom(String nom) {
			Connection c = MyConnection.getConnection();
			if (c != null) {
				try {
					PreparedStatement ps = c.prepareStatement("SELECT * FROM Produit WHERE nom=?");
					ps.setString(1, nom);;
					ResultSet result = ps.executeQuery();
					if (result.next()) {
						int a = result.getInt(1);
						String n = result.getString(2);
						String description = result.getString(3);
						String imageUrl = result.getString(4);
						float prixUnitaire = result.getFloat(5);
						int quantiteEnStock = result.getInt(6);
						Produit produit = new Produit(a, n, description, imageUrl, prixUnitaire, quantiteEnStock );
						return produit;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return null;
		}
		

		@Override
		public List<Produit> findAll() {
			ArrayList<Produit> produits = new ArrayList<Produit>();
			Connection c = MyConnection.getConnection();
			if ( c != null);
			try {
				PreparedStatement ps = c.prepareStatement("SELECT * FROM Produit;");
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					int a = result.getInt(1);
					String n = result.getString(2);
					String description = result.getString(3);
					String imageUrl = result.getString(4);
					float prixUnitaire = result.getFloat(5);
					int quantiteEnStock = result.getInt(6);
					Produit produit = new Produit(a, n, description, imageUrl, prixUnitaire, quantiteEnStock );
					produits.add(produit);
				}
			}
			
			catch (SQLException e) {
				e.printStackTrace();
			}
			return produits;
		}

		@Override
		public Utilisateur findByNomAndPrenom(String nom, String prenom) {
			// TODO Auto-generated method stub
			return null;
		}

		
		
	}
