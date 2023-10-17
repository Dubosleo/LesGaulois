package personnages;

public class Romain {
	private String nom;
	private int force;
	private int nbEquipement = 0;
	private Equipement[] equipements = new Equipement[2];
	private String texte;
	
	

	public int getNbEquipement() {
		return nbEquipement;
	}

	public String getTexte() {
		return texte;
	}

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert forcePasNégative();
	}

	public void sEquiper(Equipement equipement) {
		if (nbEquipement == 2) {
			System.out.println("le soldat est deja bien protégé");
		} else {
			if (nbEquipement == 1) {
				if (equipement.getNom() == equipements[0].getNom()) {
					System.out.println("le soldat detient deja cette équipement");
				} else {
					equipements[1] = equipement;
					nbEquipement++;
				}
			} else {
				equipements[0] = equipement;
				nbEquipement++;
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

//	public void recevoirCoup(int forceCoup) {
//		int forceactuelle=force;
//		force -= forceCoup;
//		assert forcePasNégative();
//		int forceaprescoup=force;
//		assert forceaprescoup<forceactuelle;
//		if (force > 0) {
//			parler("Aïe");
//		} else {
//			parler("J'abandonne...");
//		}
//		
//	}
	private boolean forcePasNégative() {
		boolean pasNégatif = true;
		if (force >= 0) {
			return pasNégatif;
		} else {
			return false;
		}

	}

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		 if (force > 0) {
		 parler("Aïe");
		 } else {
		 equipementEjecte = ejecterEquipement();
		 parler("J'abandonne...");
		}
		    if(force==0) {
			parler("Aïe");
		    }
			else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			}
		// post condition la force a diminuée
		assert force < oldForce;
		return equipementEjecte;
	}

	private int calculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
		texte += "\nMais heureusement, grace à mon équipement saforce est diminué de ";
		for (int i = 0; i < nbEquipement;i++) {
		if (equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) {
		resistanceEquipement += 8;
		} else {
		System.out.println("Equipement casque");
		resistanceEquipement += 5;
		}
		}
		texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}

	private Equipement[] ejecterEquipement() {
	Equipement[] equipementEjecte = new Equipement[nbEquipement];
	System.out.println("L'équipement de " + nom + "s'envole sous la force du coup.");
	int nbEquipementEjecte = 0;
	for (int i = 0; i < nbEquipement; i++) {
		if (equipements[i] != null) {
			equipementEjecte[nbEquipementEjecte] =
			equipements[i];
			nbEquipementEjecte++;
			equipements[i] = null;
			} 
			}
			return equipementEjecte;
			}

	public int getForce() {
		return force;
	}

	public static void main(String[] args) {


	}
}
