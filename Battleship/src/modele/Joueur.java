package modele;

import java.util.LinkedList;
import java.util.List;

public class Joueur {
	private String nom;
	private int score;
	private int nombreCoup;
	private List<Bateau> flotte;

	public Joueur(String nom) {
		super();
		this.nom = nom;
		this.score = 0;
		this.flotte = new LinkedList<Bateau>();
	};

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getNombreCoup() {
		return nombreCoup;
	}

	public void setNombreCoup(int nombreCoup) {
		this.nombreCoup = nombreCoup;
	}

	public List<Bateau> getFlotte() {
		return flotte;
	}

	public void setFlotte(List<Bateau> flotte) {
		this.flotte = flotte;
	}

}
