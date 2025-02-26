package ma.projet.testSalaire;

import ma.projet.bean.Developpeur;
import ma.projet.bean.Manager;

public class Testsalaire {
	public static void main(String[] args) {
		Developpeur dev1 = new Developpeur("Karim", "Salim", "salim.karim@email.com", "0612345678", 10000, "PHP");
        Developpeur dev2 = new Developpeur("Mehdi", "Ali", "mehdi.ali@email.com", "0676543210", 12000, "Java");
        Manager man1 = new Manager("Mohamed", "LACHGAR", "mohamed.lachgar@email.com", "0654321789", 30000, "Informatique");
        Manager man2 = new Manager("Youssef", "Benali", "youssef.benali@email.com", "0643219876", 25000, "Finance");
        
        System.out.println(dev1.afficher());
        System.out.println(dev2.afficher());
        System.out.println(man1.afficher());
        System.out.println(man2.afficher());
        
        // creeation d'un objet Personne provoquera une erreur de compilation
        // Personne p = new Personne(5, "Test", "User", "test.user@email.com", "0600000000", 15000);
        // System.out.println(p.calculerSalaire());
        // on remarque qu'on peut pas instancier une classe abstraite
	}
}
