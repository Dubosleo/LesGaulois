package personnages;

public class Gaulois {
	private static String nom;
	private int force;
	public static int effetPotion = 1;
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
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
		+ romain.getNom());
		romain.recevoirCoup((force / 3)*effetPotion);
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