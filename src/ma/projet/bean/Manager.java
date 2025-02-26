package ma.projet.bean;

import ma.projet.Personne;

public class Manager extends Personne {
	protected String service;

	public Manager(String nom, String prenom, String mail, String telephone, double salaire, String service) {
		super(nom, prenom, mail, telephone, salaire);
		this.service = service;
	}

	public String getService() {
		return service;
	}

	@Override
	public double calculerSalaire() {
		return salaire * 1.35;
	}

	public String afficher() {
		return "Le salaire du manager " + prenom + " " + nom + " est : " + calculerSalaire() + " dh, son service : " + service;
	}
}
