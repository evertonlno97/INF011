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
public abstract class Decorator extends IVideo {
    
    protected IVideo decorator;

    protected Decorator(IVideo decorator) {
        
        this.decorator = decorator;
        
    } 
    
}
