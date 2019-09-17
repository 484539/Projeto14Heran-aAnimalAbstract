/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Robson
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cao cao1 = new Cao();
        cao1.movimentar();
        
        Siames siames1 = new Siames();
        siames1.movimentar();
        siames1.makeNoise();
        
        
    }
    
}
