/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2.Adapter;

/**
 *
 * @author qt
 */
public class Adaptee {
    
    protected int x;
    protected int y;
    
    public void mover(int deltaX, int deltaY){
    
        this.x += deltaX;
        this.y += deltaY;
    
    } 

    public int getX() {
        
        return x;
        
    }

    public int getY() {
        
        return y;
        
    }
    
    
    
    
}
