package ma.projet;


public abstract class Personne {
	int id;
	protected String nom;
	protected String prenom;
	protected String mail;
	protected String telephone;
	protected double salaire;
	
	static int comp;

	public Personne(String nom, String prenom, String mail, String telephone, double salaire) {
		this.id = ++comp;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.telephone = telephone;
		this.salaire = salaire;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getMail() {
		return mail;
	}

	public String getTelephone() {
		return telephone;
	}

	public double getSalaire() {
		return salaire;
	}

	public abstract double calculerSalaire();

}
