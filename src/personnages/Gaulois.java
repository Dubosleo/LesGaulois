package personnages;


public class Gaulois {
	private static String nom;
	public static int effetPotion = 1;
	private int force;
	private int nbtrophees;
	private Equipement[] trophees= new Equipement[200];
	private Trophee[] trophee;
	
	public void faireUneDonation(Musee musee) {
		if(trophees.length>0) {
		for(Trophee trophee : trophee) {
			if(trophee!=null) {
				if (trophee.getEquipement().equals(Equipement.BOUCLIER)) {
				    System.out.println("Le Gaulois"+ nom + "donne le Trophee: BOUCLIER au musee");
			    	musee.donnerTrophees(this, trophee.getEquipement());
				}
				if(trophee.getEquipement().equals(Equipement.CASQUE)) {
					System.out.println("Le Gaulois"+ nom + "donne le Trophee: CASQUE au musee");
			    	musee.donnerTrophees(this, trophee.getEquipement());
					
				}
			}
		}
		}
	}
	
	
	public void setNbtrophees(int nbtrophees) {
		this.nbtrophees = nbtrophees;
	}
	public int getNbtrophees() {
		return nbtrophees;
	}
	public Gaulois(int nbtrophees, Equipement[] trophees) {
		this.nbtrophees = nbtrophees;
		this.trophees = trophees;
	}
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public static String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
		}
//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//		}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
//		+ romain.getNom());
//		romain.recevoirCoup((force / 3)*effetPotion);
//		}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		 romain.recevoirCoup((force / 3) *effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,nbtrophees++) {
		  this.trophees[nbtrophees] = trophees[i];
		}
		}
	
		
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion="
		+ effetPotion + "]";
		}
	
	
	public static int getEffetPotion() {
		return effetPotion;
	}
	public void boirePotion(int effetPotion) {
		this.effetPotion = effetPotion;
		parler("Merci Druide,je sens que ma force est" + effetPotion + " fois décuplée");
		
		
	}
	
	public static void setEffetPotion(int effetPotion) {
		Gaulois.effetPotion = effetPotion;
	}
	public static void main(String[] args) {
		}
		}