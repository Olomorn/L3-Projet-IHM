/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jerem
 */
public class Frame extends JFrame{
    
    private JButton quit = new JButton("quit");
   
     public void Start(){
         
        
      
        this.add(quit,BorderLayout.SOUTH);
       
         
          
         quit.setSize(25, 30);
         quit.addActionListener((ActionEvent evt) -> {
            
            int reponse = JOptionPane.showConfirmDialog(null, "Êtes-vous sure ?", 
			"Quitter", JOptionPane.YES_NO_OPTION);
 
		if(reponse == JOptionPane.YES_OPTION){
			
                        this.dispose();
		}
        });
         
         
       
         
          
         
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setVisible(true);
         
     }
    
    
}
