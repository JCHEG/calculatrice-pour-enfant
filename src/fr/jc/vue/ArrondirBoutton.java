package fr.jc.vue;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ArrondirBoutton extends JButton {

	    private static final long serialVersionUID = 9032198251140247116L;
	    String text;
	    public ArrondirBoutton(String s) {
	        super(s);
	        text = s;
	        setBorderPainted(false);
	        setContentAreaFilled(false);
	        setFocusable(false);
	    }
	    
	    public ArrondirBoutton(Icon i) {
	        super(i);
	        setBorderPainted(false);
	        setContentAreaFilled(false);
	        setFocusable(false);
	    }
	    
	    @Override
	    public void paintComponent(Graphics g) {
	        Graphics2D g2 = (Graphics2D) g;
	        if (getModel().isPressed()) {
	        	Color Blanc = Color.decode("#004623");
	            g.setColor(Blanc);
	            g2.fillRect(3, 3, getWidth() - 6, getHeight() - 6);
	        }
	        super.paintComponent(g);
	        g2.setColor(new Color(255, 255, 255));
	        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	                RenderingHints.VALUE_ANTIALIAS_ON);
	        g2.setStroke(new BasicStroke(1.2f));
	        g2.draw(new RoundRectangle2D.Double(1, 1, (getWidth() - 3),
	                (getHeight() - 3), 12, 8));
	        g2.setStroke(new BasicStroke(1.5f));
	        g2.drawLine(4, getHeight() - 3, getWidth() - 4, getHeight() - 3);
	        g2.dispose();
	    }
	    
	    //test de la classe
	    public static void main(String[] args) {
	        JFrame frame = new JFrame();
	        frame.getContentPane().setLayout(new FlowLayout());
	        ArrondirBoutton xrButton = new ArrondirBoutton("XrButton");
	        JButton jButton = new JButton("JButton");
	        frame.getContentPane().add(xrButton);
	        frame.getContentPane().add(jButton);
	        frame.setSize(150, 150);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}

