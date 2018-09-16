/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2.Adapter;

import interfaces.Target;

/**
 *
 * @author qt
 */
public class Adapter extends Adaptee implements Target{

    public Adapter(int pontoX, int pontoY) {
        
        this.x = pontoX;
        this.y = pontoY;
        
    }  

    public void moverAdapter(int pontoX, int pontoY){
    
        this.mover(pontoX - this.getX(), pontoY - this.getY());
    
    }
    
    public void printPoint(){
    
        System.out.println("Cordenada do ponto P no eixo X: " + this.getX());
        System.out.println("Cordenada do ponto P no eixo Y: " + this.getY());
    
    
    }

    
}
