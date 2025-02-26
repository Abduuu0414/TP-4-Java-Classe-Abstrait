package ma.projet.bean;

import ma.projet.Personne;

public class Developpeur extends Personne {
	protected String specialite;

	public Developpeur(String nom, String prenom, String mail, String telephone, double salaire, String specialite) {
		super(nom, prenom, mail, telephone, salaire);
		this.specialite = specialite;
	}

	public String getSpecialite() {
		return specialite;
	}

	
	
	
	@Override
	public double calculerSalaire() {
		return salaire * 1.2;
	}

	public String afficher() {
		return "Le salaire du developpeur " + prenom + " " + nom + " est : " + calculerSalaire() + " dh, sa specialite : " + specialite;
	}
	
	
}
