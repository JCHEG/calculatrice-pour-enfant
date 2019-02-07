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

import fr.jc.controleur.ControleurChoixFigurine;



public class FenetreChoix extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5793677741710594192L;
	private JPanel contentPane;

	public FenetreChoix(ControleurChoixFigurine ControleurChoixFigurine) {
//		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setTitle("Calculatrice CP1");
		setBounds(650, 20, 500, 700);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Color Vert = Color.decode("#317F48");
		contentPane.setBackground(Vert);
//		setUndecorated(true);
		
		JLabel lblChoisissezLaFigurine = new JLabel("Choisissez la figurine...");
		lblChoisissezLaFigurine.setForeground(new Color(0, 0, 0));
		lblChoisissezLaFigurine.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblChoisissezLaFigurine.setHorizontalAlignment(SwingConstants.CENTER);
		lblChoisissezLaFigurine.setBounds(80, 15, 300, 60);
		contentPane.add(lblChoisissezLaFigurine);
		
		JLabel lblAvecLaQuelle = new JLabel("avec la quelle vous voulez...");
		lblAvecLaQuelle.setForeground(new Color(0, 0, 0));
		lblAvecLaQuelle.setHorizontalAlignment(SwingConstants.CENTER);
		lblAvecLaQuelle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAvecLaQuelle.setBounds(80, 65, 300, 60);
		contentPane.add(lblAvecLaQuelle);
		
		JLabel lblApprendreCompter = new JLabel("apprendre \u00E0 compter !");
		lblApprendreCompter.setForeground(new Color(0, 0, 0));
		lblApprendreCompter.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblApprendreCompter.setHorizontalAlignment(SwingConstants.CENTER);
		lblApprendreCompter.setBounds(80, 115, 300, 60);
		contentPane.add(lblApprendreCompter);
		
		ImageIcon imageFille = new ImageIcon(FenetreChoix.class.getResource("/images/filleGrandFormat.png"));
		ArrondirBoutton BtnFille = new ArrondirBoutton(imageFille);
		BtnFille.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControleurChoixFigurine.choixImage("fille",FenetreChoix.this);
			}
		});
		BtnFille.setBounds(30, 275, 200, 240);
		contentPane.add(BtnFille);

		ImageIcon imageGarcon = new ImageIcon(FenetreChoix.class.getResource("/images/garconGrandFormat.png"));
		ArrondirBoutton BtnGarcon = new ArrondirBoutton(imageGarcon);
		BtnGarcon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControleurChoixFigurine.choixImage("garcon",FenetreChoix.this);
			}
		});
		BtnGarcon.setBounds(260, 275, 200, 240);
		contentPane.add(BtnGarcon);
		
		JLabel LblPoupee = new JLabel("Poup\u00E9e");
		LblPoupee.setForeground(new Color(0, 0, 0));
		LblPoupee.setHorizontalAlignment(SwingConstants.CENTER);
		LblPoupee.setFont(new Font("Tahoma", Font.BOLD, 20));
		LblPoupee.setBounds(75, 525, 100, 20);
		contentPane.add(LblPoupee);
		
		JLabel LblVoiture = new JLabel("Voiture");
		LblVoiture.setForeground(new Color(0, 0, 0));
		LblVoiture.setHorizontalAlignment(SwingConstants.CENTER);
		LblVoiture.setFont(new Font("Tahoma", Font.BOLD, 20));
		LblVoiture.setBounds(300, 525, 100, 20);
		contentPane.add(LblVoiture);
		
		setVisible(true);
		
	}
}
