/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Vue.Frame;
import Vue.Panel;
import java.awt.BorderLayout;
import java.awt.Point;

/**
 *
 * @author jerem
 */
public class Controleur {
    
    private Panel p;
    private Frame f;
    private boolean tab [][];
    public Controleur(){
        
        
        
          tab = new boolean[15][15];
        for(int i =0; i< 15 ; i++){
            for(int j = 0; j < 15; j++){
                tab[i][j] = true;
            }
            
        }
        
        this.p = new Panel(this.tab);
        this.f = new Frame();
        f.add(p,BorderLayout.CENTER);
        f.Start();
        
        p.setLienControleur(this);
        
    
    
    }
    
    public void catchClick(Point p){
       
       this.tab[p.x][p.y] = !this.tab[p.x][p.y];
       this.p.setTab(this.tab);
        
    }
    
    
}
