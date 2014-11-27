import java.awt.event.ActionEvent;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.*;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
public class ControlButton implements ActionListener {
 
 Fenetre fen;
int i;
int j;
 
  
 
  public ControlButton(Fenetre fen) {
    this.fen = fen;    
  }
  
  

  public void actionPerformed(ActionEvent e){	   
	   fen.compteur=0;
	  
	
	   while(fen.compteur<fen.compFin){
		 for(i=0;i<10;i++){
				for(j=0;j<10;j++){
                    if(e.getSource()==fen.grille[i][j]){
                        fen.grille[i+fen.compteur][j].setEnabled(false);
                }

				 }
			 
		}	
		 fen.compteur++;	
	 }
	
									 
  }
      
}
