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
public class PropagandaAntes extends Decorator{

    public PropagandaAntes(IVideo decorator) {
        super(decorator);
    }

    @Override
    public void play() {
        
        System.out.println("Exibindo propaganda antes");
        decorator.play();
          
    }
    
}
