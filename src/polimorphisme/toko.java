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
public class toko {
   
        
    
    String admin; 
    String merk;
    int total; 
    int harga; 
    
    
   
    
    public String getAdmin(){
        return admin;
    }
    public void setAdmin(String newAdmin){
        admin = newAdmin;
        
     
    }
    void admin(){
        setAdmin("Ren");
        
        System.out.println("Admin "+getAdmin());
    }
    
    
    
    
    
    
    
}

