/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1.main;

import questao1.bridge.Codec1;
import interfaces.IVideo;
import questao1.bridge.Video1;
import questao1.decorator.PropagandaAntes;
import questao1.decorator.PropagandaDepois;

/**
 *
 * @author qt
 */
public class main {
    
    public static void main(String[] args) {
        
        IVideo video = new Video1();
        video.setCodec(new Codec1());
        IVideo videoComPropaganda = new PropagandaAntes(new PropagandaDepois(video));
        videoComPropaganda.play();
        
        
    }
    
}
