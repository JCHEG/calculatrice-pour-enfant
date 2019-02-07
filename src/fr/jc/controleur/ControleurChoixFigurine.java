package fr.jc.controleur;

import fr.jc.vue.FenetreCalculatrice;
import fr.jc.vue.FenetreChoix;

public class ControleurChoixFigurine {
	
	
	public void choixImage (String image, FenetreChoix fenetreChoix) {
		ControleurCalculatrice ControleurCalculatrice = new ControleurCalculatrice();
		ControleurCalculatrice.setImageChoisie(image);
		FenetreCalculatrice fenetreCalculatrice = new FenetreCalculatrice(ControleurCalculatrice);
    	fenetreCalculatrice.setVisible(true);
    	fenetreChoix.dispose();
	}

}
