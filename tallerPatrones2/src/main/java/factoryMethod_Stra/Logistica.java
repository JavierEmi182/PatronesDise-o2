/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod_Stra;

/**
 *
 * @author DELL-USER
 */
public abstract class Logistica {
    
    public void planDelivery(){
        
    }
    abstract Transporte CreateTransport();
    
    
}
