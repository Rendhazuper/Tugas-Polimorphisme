/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphisme;

/**
 *
 * @author GAMES
 */
public class Polimorphisme{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        toko input = new toko();
        kipasangin input2 = new kipasangin();
        smartphone input3 = new smartphone();
        tv input4 = new tv();
        
        input.admin();
        System.out.println("===============================================");
        input3.smartphone();
        System.out.println("===============================================");
        input2.kipasangin();
        System.out.println("===============================================");
        input4.TV();
        System.out.println("===============================================");
    }
    
}
