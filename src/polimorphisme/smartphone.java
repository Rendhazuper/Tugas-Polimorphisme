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
public class smartphone extends toko{
      String ukuran;
   
    
    
    public int getHarga(){
        return harga;
    }
    public int getTotal(){
        return total; 
        
    }
    public String getMerk(){
        return merk;
    }
    public String getUkuran(){
        return ukuran;
    }
    public void setHarga(int newHarga){
        harga = newHarga;
    }
    public void setTotal(int newTotal){
        total = newTotal;
        
    }
    public void setMerk(String newMerk){
        merk = newMerk;
    }
    public void setUkuran(String newUkuran){
        ukuran = newUkuran; 
        
        
    }
    
    void smartphone(){
        setMerk("Xiaomi");
        setHarga(2550000);
        setUkuran("8 Inch");
        setTotal (1);
        
        System.out.println("Nama produk "+getMerk()+ getUkuran());
        System.out.println("Harga "+getHarga());
        System.out.println("stok barang " +getTotal());
    
}
}


