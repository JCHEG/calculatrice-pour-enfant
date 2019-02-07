package fr.jc.vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import fr.jc.controleur.ControleurFelicitation;


public class FenetreFelicitation extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6440203976324528594L;
	/**
	 * 
	 */

	private JPanel contentPane;
//	private ControleurFelicitation ControleurFelicitation= new ControleurFelicitation();
	FenetreCalculatrice FenetreCalculatrice;


	public FenetreFelicitation(ControleurFelicitation controleurFelicitation) {
		setTitle("Calculatrice CP1");
		setBounds(650, 20, 500, 700);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Color Vert = Color.decode("#317F48");
		contentPane.setBackground(Vert);
		
		JLabel LblImagehaut = new JLabel("");
		LblImagehaut.setBounds(150, 10, 200, 200);
//		LblImagehaut.setIcon(new ImageIcon("./src/images/bravoHaut.png"));
		LblImagehaut.setIcon(new ImageIcon(FenetreFelicitation.class.getResource("/images/bravoHaut.png")));
		contentPane.add(LblImagehaut);
		
		JLabel LblBravo = new JLabel(controleurFelicitation.getBonneReponse());
		LblBravo.setHorizontalAlignment(SwingConstants.CENTER);
		LblBravo.setForeground(new Color(255, 255, 255));
		LblBravo.setFont(new Font("Tahoma", Font.BOLD, 40));
		LblBravo.setBounds(0, 210, 494, 50);
		contentPane.add(LblBravo);
		
		
		ArrondirBoutton BtnRecommencez = new ArrondirBoutton("RECOMMENCER");
		BtnRecommencez.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controleurFelicitation.recommencerCalclul(FenetreFelicitation.this);
			}
		});
		BtnRecommencez.setBounds(50, 260, 400, 50);
		BtnRecommencez.setForeground(new Color(0, 0, 255));
		BtnRecommencez.setFont(new Font("Tahoma", Font.BOLD, 40));
		contentPane.add(BtnRecommencez);
		
		JLabel LblOu = new JLabel("OU");
		LblOu.setHorizontalAlignment(SwingConstants.CENTER);
		LblOu.setForeground(new Color(255, 255, 255));
		LblOu.setFont(new Font("Tahoma", Font.BOLD, 40));
		LblOu.setBounds(215, 320, 70, 50);
		contentPane.add(LblOu);
		
		ArrondirBoutton BtnQuitter = new ArrondirBoutton("QUITTER");
		BtnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FenetreFelicitation.this.dispose();
			}
		});
		BtnQuitter.setBounds(50, 380, 400, 50);
		BtnQuitter.setForeground(new Color(255, 0, 0));
		BtnQuitter.setFont(new Font("Tahoma", Font.BOLD, 49));
		contentPane.add(BtnQuitter);
		
		JLabel lblImagebas = new JLabel("");
		lblImagebas.setBounds(150, 440, 200, 200);
//		lblImagebas.setIcon(new ImageIcon("./src/images/bravoBas.png"));
		lblImagebas.setIcon(new ImageIcon(FenetreFelicitation.class.getResource("/images/bravoBas.png")));
		contentPane.add(lblImagebas);

	}
}
