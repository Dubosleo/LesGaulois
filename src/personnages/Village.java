package personnages;

public class Village {
	private String nom;
	private Chef chef;
	public int nbVillageois=0;
	public int nbVillageoisMax=10;
	public int numéro;
	
	String[] villageois = new String[nbVillageoisMax];
	public Village(String nom,int nbVillageoisMax) {
		this.nom = nom;
		this.nbVillageoisMax = nbVillageoisMax;
	}
	public void setChef(Chef chef) {
		this.chef=chef;
	}

	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=Gaulois.getNom();
		this.nbVillageois++;
		}
	public void ajouterHabitant(Chef chef) {
		villageois[nbVillageois]=Chef.getNom();
		this.nbVillageois++;
	}
	public void trouverHabitant(int numéro) {
		System.out.println("Le numéro est celui du gaulois:"+ villageois[numéro]);
	
	}
	public void afficherVillageois() {
		System.out.println("Dans le village de " + villageois[0]+" il y a plusieurs gaulois :\n");
		int i=1;
		while(i!=nbVillageois) {
			System.out.println("-"+ villageois[i++]+" \n");
		}
		
	}
	public static void main(String[] args) {
		Village villagedesirréductibles = new Village("Village des Irréductibles",30);
		Chef abraracourcix = new Chef("Abraracourcix",6,villagedesirréductibles);		
		villagedesirréductibles.ajouterHabitant(abraracourcix);
		Gaulois astérix = new Gaulois("Astérix",8);
		Gaulois obélix = new Gaulois("Obélix",25);
		villagedesirréductibles.ajouterHabitant(obélix);
		villagedesirréductibles.ajouterHabitant(astérix);
		villagedesirréductibles.trouverHabitant(1);
		System.out.println(villagedesirréductibles.nbVillageois);
		villagedesirréductibles.afficherVillageois();
		System.out.println(villagedesirréductibles.villageois[0]);
	}
	
}
