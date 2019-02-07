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

import fr.jc.controleur.ControleurCalculatrice;


public class FenetreCalculatrice extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9017511194488934612L;
	private JPanel contentPane;

	public FenetreCalculatrice(ControleurCalculatrice controleurCalculatrice) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JLabel LblOperation = new JLabel();
		LblOperation.setText(controleurCalculatrice.definiOperation());
		LblOperation.setForeground(new Color(0, 0, 0));
		LblOperation.setFont(new Font("Tahoma", Font.BOLD, 70));
		LblOperation.setHorizontalAlignment(SwingConstants.CENTER);
		LblOperation.setBounds(20, 0, 460,70);
		contentPane.add(LblOperation);
		
		JLabel LblResultat = new JLabel("= ?");
		LblResultat.setForeground(new Color(255, 255, 255));
		LblResultat.setHorizontalAlignment(SwingConstants.CENTER);
		LblResultat.setFont(new Font("Tahoma", Font.BOLD, 70));
		LblResultat.setBounds(20, 250, 460, 70);
		contentPane.add(LblResultat);
		
		JLabel LblFigurine1 = new JLabel("");
		LblFigurine1.setHorizontalAlignment(SwingConstants.CENTER);
//		LblFigurine1.setIcon(new ImageIcon(controleurCalculatrice.definiDessinOperande1()));
		LblFigurine1.setIcon(new ImageIcon(FenetreCalculatrice.class.getResource(controleurCalculatrice.definiDessinOperande1())));
//		LblFigurine1.setIcon(new ImageIcon(this.getClass().getResource(controleurCalculatrice.definiDessinOperande1())));
		LblFigurine1.setBounds(5, 100, 200, 150);
		contentPane.add(LblFigurine1);
		
		JLabel LblOperateur = new JLabel("");
		LblOperateur.setHorizontalAlignment(SwingConstants.CENTER);
//		LblOperateur.setIcon(new ImageIcon(controleurCalculatrice.definiDessinOperateur()));
		LblOperateur.setIcon(new ImageIcon(FenetreCalculatrice.class.getResource(controleurCalculatrice.definiDessinOperateur())));
//		LblOperateur.setIcon(new ImageIcon(this.getClass().getResource(controleurCalculatrice.definiDessinOperateur())));
		LblOperateur.setBounds(213, 100, 70, 150);
		contentPane.add(LblOperateur);
		
		JLabel LblFigurine2 = new JLabel("");
		LblFigurine2.setHorizontalAlignment(SwingConstants.CENTER);
//		LblFigurine2.setIcon(new ImageIcon(controleurCalculatrice.definiDessinOperande2()));
		LblFigurine2.setIcon(new ImageIcon(FenetreCalculatrice.class.getResource(controleurCalculatrice.definiDessinOperande2())));
//		LblFigurine2.setIcon(new ImageIcon(this.getClass().getResource(controleurCalculatrice.definiDessinOperande2())));
		LblFigurine2.setBounds(290, 100, 200, 150);
		contentPane.add(LblFigurine2);	





		ArrondirBoutton Btn0 = new ArrondirBoutton("0");
		Btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controleurCalculatrice.setReponse("0");
				LblResultat.setFont(new Font("Tahoma", Font.BOLD, 70));
				LblResultat.setForeground(new Color(255, 255, 255));
				LblResultat.setText(controleurCalculatrice.getReponse());
			}
		});
		Btn0.setForeground(new Color(255, 255, 255));
		Btn0.setFont(new Font("Tahoma", Font.BOLD, 70));
		Btn0.setBounds(20, 365, 80, 80);
		contentPane.add(Btn0);
		
		ArrondirBoutton Btn1 = new ArrondirBoutton("1");
		Btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controleurCalculatrice.setReponse("1");
				LblResultat.setFont(new Font("Tahoma", Font.BOLD, 70));
				LblResultat.setForeground(new Color(255, 255, 255));
				LblResultat.setText(controleurCalculatrice.getReponse());
			}
		});
		Btn1.setForeground(new Color(255, 255, 255));
		Btn1.setFont(new Font("Tahoma", Font.BOLD, 70));
		Btn1.setBounds(115, 365, 80, 80);
		contentPane.add(Btn1);
		
		ArrondirBoutton Btn2 = new ArrondirBoutton("2");
		Btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controleurCalculatrice.setReponse("2");
				LblResultat.setFont(new Font("Tahoma", Font.BOLD, 70));
				LblResultat.setForeground(new Color(255, 255, 255));
				LblResultat.setText(controleurCalculatrice.getReponse());
			}
		});
		Btn2.setForeground(new Color(255, 255, 255));
		Btn2.setFont(new Font("Tahoma", Font.BOLD, 70));
		Btn2.setBounds(210, 365, 80, 80);
		contentPane.add(Btn2);
		
		ArrondirBoutton Btn3 = new ArrondirBoutton("3");
		Btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controleurCalculatrice.setReponse("3");
				LblResultat.setFont(new Font("Tahoma", Font.BOLD, 70));
				LblResultat.setForeground(new Color(255, 255, 255));
				LblResultat.setText(controleurCalculatrice.getReponse());
			}
		});
		Btn3.setForeground(new Color(255, 255, 255));
		Btn3.setFont(new Font("Tahoma", Font.BOLD, 70));
		Btn3.setBounds(305, 365, 80, 80);
		contentPane.add(Btn3);
		
		ArrondirBoutton Btn4 = new ArrondirBoutton("4");
		Btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controleurCalculatrice.setReponse("4");
				LblResultat.setFont(new Font("Tahoma", Font.BOLD, 70));
				LblResultat.setForeground(new Color(255, 255, 255));
				LblResultat.setText(controleurCalculatrice.getReponse());
			}
		});
		Btn4.setForeground(new Color(255, 255, 255));
		Btn4.setFont(new Font("Tahoma", Font.BOLD, 70));
		Btn4.setBounds(400, 365, 80, 80);
		contentPane.add(Btn4);
		
		ArrondirBoutton Btn5 = new ArrondirBoutton("5");
		Btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controleurCalculatrice.setReponse("5");
				LblResultat.setFont(new Font("Tahoma", Font.BOLD, 70));
				LblResultat.setForeground(new Color(255, 255, 255));
				LblResultat.setText(controleurCalculatrice.getReponse());
			}
		});
		Btn5.setForeground(new Color(255, 255, 255));
		Btn5.setFont(new Font("Tahoma", Font.BOLD, 70));
		Btn5.setBounds(20, 460, 80, 80);
		contentPane.add(Btn5);
		
		ArrondirBoutton Btn6 = new ArrondirBoutton("6");
		Btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controleurCalculatrice.setReponse("6");
				LblResultat.setFont(new Font("Tahoma", Font.BOLD, 70));
				LblResultat.setForeground(new Color(255, 255, 255));
				LblResultat.setText(controleurCalculatrice.getReponse());
			}
		});
		Btn6.setForeground(new Color(255, 255, 255));
		Btn6.setFont(new Font("Tahoma", Font.BOLD, 70));
		Btn6.setBounds(115, 460, 80, 80);
		contentPane.add(Btn6);
		
		ArrondirBoutton Btn7 = new ArrondirBoutton("7");
		Btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controleurCalculatrice.setReponse("7");
				LblResultat.setFont(new Font("Tahoma", Font.BOLD, 70));
				LblResultat.setForeground(new Color(255, 255, 255));
				LblResultat.setText(controleurCalculatrice.getReponse());
			}
		});
		Btn7.setForeground(new Color(255, 255, 255));
		Btn7.setFont(new Font("Tahoma", Font.BOLD, 70));
		Btn7.setBounds(210, 460, 80, 80);
		contentPane.add(Btn7);
		
		ArrondirBoutton Btn8 = new ArrondirBoutton("8");
		Btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controleurCalculatrice.setReponse("8");
				LblResultat.setFont(new Font("Tahoma", Font.BOLD, 70));
				LblResultat.setForeground(new Color(255, 255, 255));
				LblResultat.setText(controleurCalculatrice.getReponse());
			}
		});
		Btn8.setForeground(new Color(255, 255, 255));
		Btn8.setFont(new Font("Tahoma", Font.BOLD, 70));
		Btn8.setBounds(305, 460, 80, 80);
		contentPane.add(Btn8);
		
		ArrondirBoutton Btn9 = new ArrondirBoutton("9");
		Btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controleurCalculatrice.setReponse("9");
				LblResultat.setFont(new Font("Tahoma", Font.BOLD, 70));
				LblResultat.setForeground(new Color(255, 255, 255));
				LblResultat.setText(controleurCalculatrice.getReponse());
			}
		});
		Btn9.setForeground(new Color(255, 255, 255));
		Btn9.setFont(new Font("Tahoma", Font.BOLD, 70));
		Btn9.setBounds(400, 460, 80, 80);
		contentPane.add(Btn9);
		
		ArrondirBoutton BtnValider = new ArrondirBoutton("VALIDER");
		BtnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controleurCalculatrice.getReponse().length()!=0) {
				LblResultat.setFont(new Font("Tahoma", Font.BOLD, 21));
				controleurCalculatrice.jugeResultat(FenetreCalculatrice.this, LblResultat,LblOperation, LblFigurine1,  LblOperateur, LblFigurine2);
				}
			}
		});
		
		BtnValider.setForeground(new Color(0, 0, 255));
		BtnValider.setFont(new Font("Tahoma", Font.BOLD, 70));
		BtnValider.setBounds(20, 555, 365, 80);
		contentPane.add(BtnValider);
		
//		ImageIcon off = new ImageIcon("./src/images/off.png");
		ImageIcon off = new ImageIcon(FenetreCalculatrice.class.getResource("/images/off.png"));
		ArrondirBoutton btnQuitter = new ArrondirBoutton(off);
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FenetreCalculatrice.this.dispose();
			}
		});
		
		btnQuitter.setBounds(400, 555, 80, 80);
		btnQuitter.setForeground(new Color(239, 0, 0));
		btnQuitter.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(btnQuitter);
	}

}
