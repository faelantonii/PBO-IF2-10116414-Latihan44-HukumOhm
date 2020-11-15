/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan44_HukumOhm;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan hukum ohm
 */
public class PBO_IF2_10116414_HukumOhm {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        
        Arus arus = new Arus();
        
        System.out.print("Masukkan Kuat Arus : ");
        float kuatArus = scan.nextFloat();
        
        System.out.print("Masukkan Hambatan : ");
        float hambatan = scan.nextFloat();
             
        Arus arus1 = new Arus(kuatArus, hambatan);
        
        float total = arus1.hitungTegangan();
        System.out.println("\nHasil Tegangan = " + total + " Volt");
    }
}
