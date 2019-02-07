package fr.jc.controleur;

import java.awt.Color;

import java.awt.Font;


import javax.swing.ImageIcon;
import javax.swing.JLabel;

import fr.jc.vue.FenetreCalculatrice;
import fr.jc.vue.FenetreFelicitation;

public class ControleurCalculatrice {

	private int operande1;
	private int operande2;
	private int choixOperateur;
	private int chance;
	private String egal;
	private String operation;
	private String resultat;
	private String reponse;
	private String imageChoisie;
	private String[] tableauOperateur = new String[2];

	private boolean operateurAleatoire;
	private int resultatMaxi;
	private int nombreChanceMaxi;
	


	public ControleurCalculatrice() {
		this.egal = " =";
		this.reponse = "";
		this.resultat = "";
		this.operation = "";
		this.nombreChanceMaxi = 3;
		this.chance = this.nombreChanceMaxi;
		this.tableauOperateur [0] = "+";
		this.tableauOperateur [1] = "-";
		this.operateurAleatoire = true;
		this.resultatMaxi = 21;
	}
	
	public void jugeResultat(FenetreCalculatrice FenetreCalculatrice, JLabel LblResultat, JLabel LblOperation, JLabel LblFigurine1, JLabel LblOperateur, JLabel LblFigurine2) {
		if (this.chance >= 1 ) {
			if (definiBonnereponse() == Integer.parseInt(getReponse())) { 
				FenetreCalculatrice.dispose();
				String bonneReponse = String.valueOf(definiBonnereponse());
				ControleurFelicitation controleurFelicitation = new ControleurFelicitation();
				controleurFelicitation.setImage(this.imageChoisie);
				controleurFelicitation.setBonneReponse(bonneReponse);
				controleurFelicitation.setOperation(this.operation);
				
				controleurFelicitation.setOperateurAleatoire(this.isOperateurAleatoire());
				controleurFelicitation.setResultatMaxi(this.getResultatMaxi());
				controleurFelicitation.setChoixOperateur(this.getChoixOperateur());
				controleurFelicitation.setNombreChanceMaxi(this.getNombreChanceMaxi());
				
				FenetreFelicitation FenetreFelicitation = new FenetreFelicitation(controleurFelicitation);
				FenetreFelicitation.setVisible(true);
				FenetreCalculatrice.dispose();
			}
			else { this.chance -= 1;
				   if (this.chance > 0) {
				   LblResultat.setFont(new Font("Tahoma", Font.BOLD, 25));
				   LblResultat.setForeground(new Color(255, 255, 255));
				   LblResultat.setText("<html>Mauvaise réponse ! essayez encore<br> il vous reste "+this.chance+" chance"+definiSiChanceAUnS()+"</html>");
				   this.reponse= "";
				   }
				   else {
					    LblResultat.setFont(new Font("Tahoma", Font.BOLD, 25));
					    LblResultat.setForeground(new Color(255, 0, 0));
						LblResultat.setText(this.afficheFausseReponse());
						initCalculatrice(LblOperation, LblFigurine1, LblOperateur,  LblFigurine2);
				   }
			}
			
		} 
		else {
			LblResultat.setFont(new Font("Tahoma", Font.BOLD, 15));
			LblResultat.setText(this.afficheFausseReponse());
			initCalculatrice(LblOperation, LblFigurine1, LblOperateur,  LblFigurine2);
			
		}
	}
	
	public String definiSiChanceAUnS(){
		String str = "";
		if (this.chance > 1) {str = "s";}
		
		return str;
	}
	
	public void initCalculatrice(JLabel LblOperation, JLabel LblFigurine1, JLabel LblOperateur, JLabel LblFigurine2){

		  this.reponse ="" ;
		  this.resultat = "";
		  int borneInfTab = 0;
		  int borneSupTab = tableauOperateur.length;
		  if(isOperateurAleatoire()) {
			  this.choixOperateur = (int)(Math.random() * (borneSupTab - borneInfTab )) + borneInfTab ;
		  }
		  this.setChance(getNombreChanceMaxi());
		  LblOperation.setText(definiOperation());
//		  LblFigurine1.setIcon(new ImageIcon(this.definiDessinOperande1()));
//		  LblOperateur.setIcon(new ImageIcon(this.definiDessinOperateur()));
//		  LblFigurine2.setIcon(new ImageIcon(this.definiDessinOperande2()));
		  LblFigurine1.setIcon(new ImageIcon(FenetreCalculatrice.class.getResource(this.definiDessinOperande1())));
		  LblOperateur.setIcon(new ImageIcon(FenetreCalculatrice.class.getResource(this.definiDessinOperateur())));
		  LblFigurine2.setIcon(new ImageIcon(FenetreCalculatrice.class.getResource(this.definiDessinOperande2())));
	}
	
	public String definiOperation() {
        int borneInfTab = 0;
        int borneSupTab = tableauOperateur.length;
        if(isOperateurAleatoire()) {
            this.choixOperateur = (int)(Math.random() * (borneSupTab - borneInfTab )) + borneInfTab ;
        }
        int borneInfOperande1 = 0;
        int borneSupOperande1  = getResultatMaxi();
        if(borneSupOperande1 > 10 ) {
            borneSupOperande1 = 10;
        }
        this.operande1 = (int)(Math.random() * (borneSupOperande1 - borneInfOperande1 )) + borneInfOperande1 ;
        int borneInfOperande2 = 0;
        int borneSupOperande2 = 0;
        if (this.choixOperateur == 0){ 
            borneSupOperande2 = getResultatMaxi() - this.operande1;
            if(borneSupOperande2 > 10 ) {
                borneSupOperande2 = 10;
            }
        }
        else 
            borneSupOperande2 = this.operande1;

        this.operande2 = (int)(Math.random() * (borneSupOperande2 - borneInfOperande2 )) + borneInfOperande2 ;
        this.operation = String.valueOf(operande1)+" "+this.tableauOperateur[this.choixOperateur]+" "+String.valueOf(operande2)+this.egal;

        return this.operation;
    }
	
	public String definiDessinOperande1() {
		String cheminDessin1 = "/images/"+this.getImageChoisie()+String.valueOf(this.operande1)+".png";
		
		return cheminDessin1;
	}
	
	public String definiDessinOperande2() {
		String cheminDessin2 = "/images/"+this.getImageChoisie()+String.valueOf(this.operande2)+".png";
		
		return cheminDessin2;
	}
	
	public String definiDessinOperateur() {
		String cheminOperateur = "/images/"+this.tableauOperateur[this.getChoixOperateur()]+".png";
		
		return cheminOperateur;
	}
	
	public int definiBonnereponse(){
		int bonneReponse;
		if (this.choixOperateur == 0) {
			bonneReponse = this.operande1 + this.operande2;
		}
		else {
			bonneReponse = this.operande1 - this.operande2;
		}
		return bonneReponse;
	}
	

	public String afficheFausseReponse() {
		String str = "<html>Perdu ! La bonne réponse était "+String.valueOf(definiBonnereponse()) +"<br> essayez encore une fois</html>";
		return str;	
	}

	public int getNombreChanceMaxi() {
		return nombreChanceMaxi;
	}

	public void setNombreChanceMaxi(int nombreChanceMaxi) {
		this.nombreChanceMaxi = nombreChanceMaxi;
		this.setChance(nombreChanceMaxi);
	}

	public int getResultatMaxi() {
		return resultatMaxi;
	}

	public void setResultatMaxi(int resultatMaxi) {
		this.resultatMaxi = resultatMaxi;
	}

	public int getChance() {
		return chance;
	}

	public void setChance(int chance) {
		this.chance = chance;
	}
	
	public String getReponse() {
		return this.reponse;
	}

	public void setReponse(String chiffre) {
		if (this.reponse.length()<=1)
		this.reponse = this.reponse+=chiffre;
	}
	
	public int getChoixOperateur() {
		return choixOperateur;
	}

	public void setChoixOperateur(int choixOperateur) {
		this.choixOperateur = choixOperateur;
	}
	
	public String getImageChoisie() {
		return imageChoisie;
	}

	public void setImageChoisie(String imageChoisie) {
		this.imageChoisie = imageChoisie;
	}
	
	public String getResultat() {
		String str = "la bonne réponse est ";
		int bonneReponse = this.operande1 + this.operande2;
		this.resultat = str+String.valueOf(bonneReponse);
		return this.resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	
	public int getOperande1() {
		return operande1;
	}

	public void setOperande1(int operande1) {
		this.operande1 = operande1;
	}

	public int getOperande2() {
		return operande2;
	}

	public void setOperande2(int operande2) {
		this.operande2 = operande2;
	}
	

	public boolean isOperateurAleatoire() {
		return operateurAleatoire;
	}

	public void setOperateurAleatoire(boolean operateurAleatoire) {
		this.operateurAleatoire = operateurAleatoire;
	}

}
