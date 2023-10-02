package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert forcePasNégative();
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
		}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		int forceactuelle=force;
		force -= forceCoup;
		assert forcePasNégative();
		int forceaprescoup=force;
		assert forceaprescoup<forceactuelle;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		
	}
	private boolean forcePasNégative() {
		boolean pasNégatif =true;
		if (force>=0) {
			return pasNégatif;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
	  	
		
	}
}
