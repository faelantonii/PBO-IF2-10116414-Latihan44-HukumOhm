/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan44_HukumOhm;

/**
 *
 * @author sweenutt
 */
public class Arus {
    private float kuatArus;
    private float hambatan;
    
    public Arus() {
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat ");
        System.out.println("penghantar akan berbanding lurus dengan beda potensial ");
        System.out.println("pada ujung-ujung kawat penghantar tersebut asalkan suhu ");
        System.out.println("kawat dijaga konstan");
                
        System.out.println();
    }
    
    public Arus(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan() {
        return kuatArus * hambatan;
    }
}
