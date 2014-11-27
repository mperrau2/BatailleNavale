import java.awt.event.ActionEvent;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.*;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
public class ControlMenu implements ActionListener {
 
 Fenetre fene;

 

 
  public ControlMenu(Fenetre fene) {
    this.fene = fene;    
  }
  
  
 
  public void actionPerformed(ActionEvent a) {

       if(a.getSource()==fene.item1){
           fene.setVisible(false);
           fene= new Fenetre();
       }

	  if(a.getSource()==fene.item2){
		  
		 JOptionPane d = new JOptionPane();
		 JOptionPane.showMessageDialog( fene, "Bonjours",
				                       "Règles", JOptionPane.ERROR_MESSAGE );
				   
				 JDialog fenErr = d.createDialog("Règles");
			
		  
		   
  
	  }
		
	  }
	  
      
}
