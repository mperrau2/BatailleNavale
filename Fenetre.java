import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Vector;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.border.Border;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Fenetre extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int[] order,tab;
	JLabel l1, l2,l3,global,ci;
	JButton[][] grille=  new JButton[10][10];
    JButton[] grille2=  new JButton[100];
	Dimension taille = new Dimension(150,150);
	JComboBox liste;
    JRadioButton rb1 = new JRadioButton("Horizontale",true);
    JRadioButton rb2 = new JRadioButton("Verticale",false);
	boolean init=false;
	 public ControlButton control;
	 public ControlMenu controle;
	 public ControlListe control1;
	 ImageIcon image;
	 int compteur;
	 String chaine ;
	 int compFin;
	 JMenuItem item1,item2;
	 int k=0;
	 float s;
	 String u,monscore,bestScores;
	 String[] items = { "Porte-avion : 5 cases", "Croiseur : 4 cases","Contre-torpilleurs : 3 cases","Sous-marin : 3 cases","Tropilleur : 2 cases" };
	 
	 
	 public Fenetre() {
		  
		     initAttribut();
			 creerWidget();
			 pack(); // Fixe la taille par d�faut
			 setVisible(true); // Affiche la fenetre
			 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Gestion de la fermeture
			 }
			
			 
		  
		  
	 
	
	 
	
	 
	/*public void FinJeu(){
		System.out.println(compFin);
		 if(compteur<0){
			 for(int i=0;i<16;i++){
				 b[i].setEnabled(false);
				}
			 l3.setText("0");
			 c.stop();
			 JOptionPane d = new JOptionPane();
			  JOptionPane.showMessageDialog( this, "Vous avez perdu", "Defaite",
			                       JOptionPane.ERROR_MESSAGE );
			   
			  JDialog fenErr = d.createDialog("Scores");
		 }
		if(compFin==8){
			c.stop();
		MeilleurScore();	
		JOptionPane d = new JOptionPane();
		  JOptionPane.showMessageDialog( this, "Vous avez gagner en "+score, "Victoire",
		                       JOptionPane.ERROR_MESSAGE );
		   
		  JDialog fenErr = d.createDialog("Scores");
		}
		
	 }*/
	 
	 public void initAttribut(){
		 
		 control = new ControlButton(this);
		 controle = new ControlMenu(this);
		 control1=new ControlListe(this);
		
		
	 }
	 
	
		

	 
	 
	 public void creerWidget(){
 
		 JMenuBar barMenu = new JMenuBar();
		 JMenu menu = new JMenu("Menu");
		 item1 = new JMenuItem("Nouvelle partie");
		 item1.addActionListener(controle);
		 item2 = new JMenuItem("Règles");
		 item2.addActionListener(controle);
		 menu.add(item1);
		 menu.add(item2);
		 barMenu.add(menu);
		 setJMenuBar(barMenu);
		 
		
		 
		
		    
		 
		
		 liste=new JComboBox(items);
		 liste.addActionListener(control1);
         rb1.addActionListener(control1);
         rb2.addActionListener(control1);
		
		 
		 JPanel pan = new JPanel(new GridLayout(11,11));

		 JPanel pan1 = new JPanel(new GridLayout(3,1));
         JPanel panboutton = new JPanel();

		
		 
		 
		 	for(int i=0;i<11;i++){
		 		JLabel mi= new JLabel("          "+i);
		 		pan.add(mi);
		 	}
			 
		 	 
		 	
		 for(int i=0;i<10;i++){
			 if(i==0){
				 ci= new JLabel("           A");
				 pan.add(ci);
			 }
			
			 if(i==1){
				  ci= new JLabel("          B");
				  pan.add(ci);
			 } 
			 if(i==2){
				 ci= new JLabel("          C");
				  pan.add(ci);
			 }
			 if(i==3){
				 ci= new JLabel("          D");
				  pan.add(ci);
			 }
			 if(i==4){
				 ci= new JLabel("          E");
				  pan.add(ci);
			 }
			 if(i==5){
				 ci= new JLabel("          F");
				  pan.add(ci);
			 }
			 if(i==6){
				 ci= new JLabel("          G");
				  pan.add(ci);
			 }
			 if(i==7){
				 ci= new JLabel("          H");
				  pan.add(ci);
			 }
			 if(i==8){
				 ci= new JLabel("          I");
				  pan.add(ci);
			 }
			 if(i==9){
				 ci= new JLabel("          J");
				  pan.add(ci);
			 }


			for(int j=0;j<10;j++){
                grille[i][j]= new JButton();


                pan.add(grille[i][j]);

                grille[i][j].addActionListener(control);
                grille[i][j].setIcon(new ImageIcon("src/mer.jpg"));
                grille[i][j].setDisabledIcon(new ImageIcon("src/bateaux.jpg"));
            }

			 
								
			 
			
		 
		 }
       /*  JPanel pan2 = new JPanel(new GridLayout(11,11));
         for(int i=0;i<100;i++){
             grille2[i]= new JButton();
             pan2.add(grille2[i]);

             grille2[i].addActionListener(control);
             grille2[i].setIcon(new ImageIcon("src/mer.jpg"));
         }*/
		 
		 // cr�ation de tous les composants graphiques de la fen�tre
         panboutton.add(rb1);
         panboutton.add(rb2);

         pan1.add(liste);
         pan1.add(panboutton);
		 pan1.add(pan);
         //pan1.add(pan2,BorderLayout.EAST);
		 setContentPane(pan1);
		 
		 
	/*	
		 
		 JPanel p2 = new JPanel();
		 p2.add(l1);
		 p2.add(chro);
		 
		 JPanel p3 = new JPanel();
		 p3.add(l2);
		 p3.add(l3);
		 
		 JPanel global = new JPanel();
		 global.setLayout(new BoxLayout(global, BoxLayout.Y_AXIS));
		 global.add(p2);
		 global.add(p1);
		 global.add(p3);
		 setContentPane(global);*/
		 
	 }

}
