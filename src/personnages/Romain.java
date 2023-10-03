package personnages;

public class Romain {
	private String nom;
	private int force;
	public int nbEquipement=0;
	String[] equipements = new String[2];
	

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert forcePasNégative();
	}
	public void sEquiper(Equipement equipement) {
		if(nbEquipement==2) {
			System.out.println("le soldat est deja bien protégé");
		}
		else {
			if(nbEquipement==1) {
				if(Equipement.getNom()==equipements[0]) {
				System.out.println("le soldat detient deja cette équipement");
				}
				else {
				 equipements[1]=Equipement.getNom();				   
				}
			}
			else {
			equipements[0]=Equipement.getNom();	
			}
		}
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
		minus.sEquiper(Equipement.BOUCLIER);
		

	  	
		
	}
}
