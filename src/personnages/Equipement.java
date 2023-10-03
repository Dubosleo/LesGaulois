package personnages;

public enum Equipement {
	CASQUE("Casque"),
    BOUCLIER("Bouclier");
    private  static String nom;

	Equipement(String nom) {
		this.nom = nom;
	}

	public static String getNom() {
		return nom;
	}
	public String toString() {
		return "Equipement:" + nom;
		}
	
    
}