package fr.jc.controleur;

import fr.jc.vue.FenetreCalculatrice;
import fr.jc.vue.FenetreFelicitation;



public class ControleurFelicitation {
	
	private String image;
	private String bonneReponse;
	private String operation;
	private boolean operateurAleatoire;
	private int resultatMaxi;
	private int choixOperateur;
	private int nombreChanceMaxi;
	


	public void recommencerCalclul (FenetreFelicitation fenetreFelicitation) {
		
		ControleurCalculatrice controleurCalculatrice = new ControleurCalculatrice();
		controleurCalculatrice.setImageChoisie(getImage());
		controleurCalculatrice.setOperateurAleatoire(this.isOperateurAleatoire());
		controleurCalculatrice.setResultatMaxi(this.getResultatMaxi());
		controleurCalculatrice.setChoixOperateur(this.getChoixOperateur());
		controleurCalculatrice.setNombreChanceMaxi(this.getNombreChanceMaxi());
		
		FenetreCalculatrice fenetreCalculatrice = new FenetreCalculatrice(controleurCalculatrice);
    	fenetreCalculatrice.setVisible(true);
    	fenetreFelicitation.dispose();
    	
	}
	
	public int getNombreChanceMaxi() {
		return nombreChanceMaxi;
	}

	public void setNombreChanceMaxi(int nombreChanceMaxi) {
		this.nombreChanceMaxi = nombreChanceMaxi;
	}
	
	public boolean isOperateurAleatoire() {
		return operateurAleatoire;
	}

	public void setOperateurAleatoire(boolean operateurAleatoire) {
		this.operateurAleatoire = operateurAleatoire;
	}



	public int getResultatMaxi() {
		return resultatMaxi;
	}

	public void setResultatMaxi(int resultatMaxi) {
		this.resultatMaxi = resultatMaxi;
	}



	public int getChoixOperateur() {
		return choixOperateur;
	}



	public void setChoixOperateur(int choixOperateur) {
		this.choixOperateur = choixOperateur;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public String getBonneReponse() {
		String str = "Bravo!   ";

		return str+this.operation + " " + this.bonneReponse;
	}

	public void setBonneReponse(String bonneReponse) {
		this.bonneReponse = bonneReponse;
	}
	
	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
}
