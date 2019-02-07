package Main;

import java.awt.EventQueue;

import fr.jc.controleur.ControleurChoixFigurine;
import fr.jc.vue.FenetreChoix;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
		    	ControleurChoixFigurine ControleurChoixFigurine = new ControleurChoixFigurine();
		    	FenetreChoix FenetreChoix = new FenetreChoix(ControleurChoixFigurine);
		    	
//		    	
//				ControleurCalculatrice controleurCalculatrice = new ControleurCalculatrice();
//				controleurCalculatrice.setImageChoisie("garcon");
//				controleurCalculatrice.setOperateurAleatoire(false);
//				controleurCalculatrice.setResultatMaxi(20);
//				controleurCalculatrice.setChoixOperateur(0);
//				controleurCalculatrice.setNombreChanceMaxi(2);
				
//				FenetreCalculatrice FenetreCalculatrice = new FenetreCalculatrice(controleurCalculatrice);
//		    	FenetreCalculatrice.setVisible(true);
//				ControleurFelicitation ControleurFelicitation = new ControleurFelicitation();
//				FenetreFelicitation FenetreFelicitation = new FenetreFelicitation(ControleurFelicitation);
//				FenetreFelicitation.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});

//		int x;
//		
//		x = (int)(Math.random() * (2 - 0 )) + 0 ;
//		double d = 1.00000001443543543545d;
//		x=(int) d;
//		System.out.println(x);
//		System.out.println(Math.random() );

		
	}
	
	
}
