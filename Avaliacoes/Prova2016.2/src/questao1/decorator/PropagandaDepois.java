/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1.decorator;

import interfaces.IVideo;

/**
 *
 * @author qt
 */
public class PropagandaDepois extends Decorator {

    public PropagandaDepois(IVideo decorator) {
        
        super(decorator);
        
    }

    @Override
    public void play() {
        
        decorator.play();
        System.out.println("Exibindo propaganda depois");
        
    }
    
}
