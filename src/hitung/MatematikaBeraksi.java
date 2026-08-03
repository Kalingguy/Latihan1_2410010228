/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung;

/**
 *
 * @author HP
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        
        Matematika kalingga = new Matematika(2,8);
        
        System.out.println("Hasil Penjumlahan : "+kalingga.setPenjumlahan());
        System.out.println("Hasil Pengurangan : "+kalingga.setPengurangan());
        System.out.println("Hasil Perkalian : "+kalingga.setPerkalian());
        System.out.println("Hasil Pembagian : "+kalingga.setPembagian());   
    }
}
