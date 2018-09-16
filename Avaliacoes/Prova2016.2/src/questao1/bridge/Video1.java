/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1.bridge;

import interfaces.IVideo;

/**
 *
 * @author qt
 */
public class Video1 extends IVideo {

    @Override
    public void play() {
        
        System.out.println("Exibindo o Video1");
        this.codec.displayFormat();
        
    }
    
}
