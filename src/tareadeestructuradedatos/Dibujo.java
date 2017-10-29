/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadeestructuradedatos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author oscar
 */
public class Dibujo {
    Color color;
    
    public Dibujo(){
        
    }
    
    /**
     *
     * @param g
     * @param x
     * @param y
     */
    //metodo para sirve para dibujar los nodos
    public static void dibujarNodo(Graphics g,int x,int y){
        ((Graphics2D)g).setColor(Color.YELLOW);
        ((Graphics2D)g).setStroke(new BasicStroke(1));//leda el grosor al circulo        
        ((Graphics2D)g).fillOval(x, y, 15, 15);        
        ((Graphics2D)g).setColor(Color.BLACK);
        ((Graphics2D)g).drawOval(x, y, 15, 15);
    }
    
    //metodo para dibujar las aristas
    public static void dibujarArista(Graphics g, int x1,int y1,int x2,int y2){
        int xAux = 0; int yAux = 0; 
         ((Graphics2D)g).setColor(Color.YELLOW);
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(2);
        ((Graphics2D)g).setStroke(stroke);         
       ((Graphics2D)g).drawLine(x1+10, y1+10, x2+10, y2+10);
       ((Graphics2D)g).setColor(Color.red);
       if(x1<=x2)
           xAux=((x2-x1)/2)+x1;       
        if(x1>x2)
           xAux=((x1-x2)/2)+x2;
        if(y1<y2)
           yAux=((y2-y1)/2)+y1;
        if(y1>=y2)
            yAux=((y1-y2)/2)+y2;
    }
    
     
    
}
