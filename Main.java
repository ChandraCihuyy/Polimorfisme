/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author SMK TELKOM 09
 */
public class Main {
    
      public static void main(String[] args){
        BangunDatar bangunDatar = new BangunDatar();
        Persegi Persegi = new Persegi(4);
        Segitiga Segitiga = new Segitiga(6,3);
        Lingkaran Lingkaran = new Lingkaran(50);

       bangunDatar.luas();
       bangunDatar.keliling();

        System.out.println("Luas persegi : " + Persegi.luas());
        System.out.println("Keliling persegi : " + Persegi.keliling());
        System.out.println("Luas segitiga : " + Segitiga.luas());
        System.out.println("Luas Lingkaran : " + Lingkaran.luas());
        System.out.println("Keliling Lingkaran : " + Lingkaran.keliling());
    }
}
