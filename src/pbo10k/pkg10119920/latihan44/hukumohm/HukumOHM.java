/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan44.hukumohm;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

class Baterai {
    
    private float kuatArus;
    private float hambatan;
    
    public Baterai() {
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar");
        System.out.println("akan berbanding lurus dengan beda potensial");
        System.out.println("pada ujung-ujung kawat penghantar tersebut");
        System.out.println("asalkan suhu kawat dijaga konstan.");
        System.out.println();
    }
    
    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }
    
    public float getKuatArus () {
        return kuatArus;
    }
    
    public float getHambatan () {
        return hambatan;
    }
    
    public float hitungTegangan () {
        return kuatArus * hambatan;
    }
    
}

public class HukumOHM {
    
    public static void main(String[] args) {
        
        Baterai b = new Baterai();
        
        Baterai bb = new Baterai(3, 12);
        
        System.out.println("Kuat Arus : " + bb.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + bb.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + bb.hitungTegangan() + " volt");
    }
}