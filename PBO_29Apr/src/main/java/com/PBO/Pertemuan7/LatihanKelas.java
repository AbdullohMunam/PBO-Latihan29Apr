/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PBO.Pertemuan7;
import com.person.Person;

/**
 *
 * @author A-12
 */
public class LatihanKelas {
    public static void main(String[] args) {
        System.out.println("Latihan Kelas");
        
        String judulbuku1 = "Java 1";
        String authorbuku1 = "Abdul";
        String judulbuku2 = "Java 2";
        String authorbuku2 = "Aam";
        System.out.println(judulbuku1);
        System.out.println(authorbuku1);
        System.out.println(judulbuku2);
        System.out.println(authorbuku2);
        
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        buku1.judul = "Java 1";
        buku1.author.nama = "Abdul";
        buku2.judul = "Java 2";
        buku2.author.nama = "Aam";
        
        System.out.println(buku1.judul);
        buku1.author.sebutNama();
        System.out.println(buku2.judul);
        System.out.println(buku2.author.nama);
        System.out.println(buku1.tahunpenerbitan);
        buku1.harga.setJual(120000);
        System.out.println(buku1.harga.getBeli());
        System.out.println(buku1.penerbit.nama);
        System.out.println("Harga jual buku 1 = " + buku1.harga.getJual());
        System.out.println("Harga jual buku 2 = " + buku2.harga.getJual());
        buku1.terjual();
        
    }
}

class Buku {
    String judul;
    Person author = new Person();
    int tahunpenerbitan = 2024;
    Harga harga = new Harga();
    PerusahaanBuku penerbit = new PerusahaanBuku();
    
    public void terjual(){
        System.out.println("Buku terjual dengan harga:" + harga);
    }
}

class Harga {
    double jual = 100000.00;
    double beli = 60000.00;

    public double getJual() {
        return jual;
    }

    public void setJual(double jual) {
        this.jual = jual;
    }

    public double getBeli() {
        return beli;
    }

    public void setBeli(double beli) {
        this.beli = beli;
    }
    
    
}