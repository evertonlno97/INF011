/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import interfaces.ICodec;

/**
 *
 * @author qt
 */
public abstract class IVideo {
    
    protected ICodec codec;
    
    public abstract void play();
    
   public void setCodec(ICodec codec) {
        
        this.codec = codec;
        
    }
    
}
