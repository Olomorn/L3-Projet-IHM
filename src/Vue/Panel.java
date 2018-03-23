/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Controleur.Controleur;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author jerem
 */
public class Panel extends JPanel implements MouseListener{
    
    private boolean [][] tab;
    private int largeur;
    private int hauteur;
    private Controleur controleur;
    private int longeur_cellule;
    private int hauteur_cellule;
    public Panel(){
        super();
        this.setBorder(BorderFactory.createLineBorder(Color.yellow));
        this.largeur = 15;
        this.hauteur = 15;
        tab = new boolean[largeur][hauteur];
        for(int i =0; i< this.largeur ; i++){
            for(int j = 0; j < this.hauteur; j++){
                tab[i][j] = true;
            }
            
        }
        
         this.addMouseListener(this);
       
        
    }
    
    public Panel(boolean t [][]){
        
        super();
        this.setBorder(BorderFactory.createLineBorder(Color.yellow));
        this.setTab(t);
        
        this.addMouseListener(this);
    }
    
    
    public void setTab(boolean t [][]){
        this.tab = t;
        this.largeur = t.length;
        this.hauteur = t[0].length;
        this.resize();
        this.repaint();
    }
    
    private void resize(){
        this.longeur_cellule = this.getWidth()/this.largeur;
        this.hauteur_cellule = this.getHeight()/this.hauteur;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        resize();
        int x = e.getX()/longeur_cellule;
        int y = e.getY()/hauteur_cellule;
        controleur.catchClick(new Point(x,y));
        
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    
    @Override
    public void paintComponent(Graphics g)
    { 
         super.paintComponent(g);
         resize();
         for(int i =0; i< this.largeur; i++){
             for(int j = 0; j < this.hauteur; j++){
                 if(this.tab[i][j]){
                     g.setColor(Color.blue);
                 }else{
                     g.setColor(Color.white);
                 }
                 g.fillRect(i*this.longeur_cellule, j*this.hauteur_cellule, this.longeur_cellule, this.hauteur_cellule);
             }
         }
         
      
    }
    
    
    public void setLienControleur(Controleur c ){
        this.controleur = c;
    }
}
