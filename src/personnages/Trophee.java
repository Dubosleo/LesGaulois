package personnages;

public class Trophee {
public Gaulois gaulois;
public Equipement equipement;

public Trophee(Gaulois gaulois, Equipement equipement) {
	this.gaulois = gaulois;
	this.equipement = equipement;
}

public Gaulois getGaulois() {
	return gaulois;
}
public Equipement getEquipement() {
	return equipement;
}
public String donnerNom() {
	return Gaulois.getNom();	
}



}
