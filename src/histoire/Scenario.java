package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois aristote = new Gaulois("aristote",8);
		Romain minus = new Romain("Minus",6);
		Druide ah = new Druide("Ah",0,10);
		ah.preparerPotion();
		ah.booster(aristote);
		aristote.boirePotion(Gaulois.getEffetPotion());
		

	}

}
