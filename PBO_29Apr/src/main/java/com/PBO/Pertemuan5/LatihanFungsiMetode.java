/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PBO.Pertemuan5;
import java.util.Scanner;
        
/**
 *
 * @author A-1
 */
public class LatihanFungsiMetode {
    public static void main(String[] args) {
        int varInteger;
        sayHello(); //memanggil metode sayHello()
        sayHelloTo("Budi"); //memanggil metode sayHelloTo(String nama)
        String namaMahasiswa = "George";
        //di bawah ini memanggil metode sayHelloTo(String nama) dengan
        // memberikan data variabel namaMahasiswa sebagai nilai parameter String nama
        sayHelloTo(namaMahasiswa);
        //di bawah ini memanggil metode inputNilaiInteger(String namaVariabel)
        //untuk memberikan nilai variabel varInteger melalui input dari user.
        varInteger = inputNilaiInteger("var Integer");
        System.out.println("Nilai varInteger sekarang = "+ varInteger);

        // Panggil metode hitungLuasLingkaran
        double jariJari = 5.0; // Contoh nilai jari-jari
        double luas = hitungLuasLingkaran(jariJari);
        System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah " + luas);

        // Panggil metode selamatUlangTahun
        String namaDepan = "Abdulloh";
        String namaBelakang = "Mun'am";
        String ucapanUlangTahun = selamatUlangTahun(namaDepan, namaBelakang);
        System.out.println(ucapanUlangTahun);
    }

    // Metode bertipe void, tanpa parameter
    static void sayHello(){
        System.out.println("Hello, ini dari metode bertipe void, tanpa parameter");
    }

    static void sayHelloTo(String nama){
        System.out.println("Hello "+ nama + ", Metode bertipe void, dengan parameter");
    }

    static int inputNilaiInteger(String namaVariabel){
        Scanner inputScanner = new Scanner(System.in);
        int nilaiInput;
        System.out.println("Silakan input nilai untuk variabel " + namaVariabel);
        nilaiInput = inputScanner.nextInt();
        return nilaiInput;
    }

    // Metode untuk menghitung luas lingkaran
    static double hitungLuasLingkaran(double jariJari){
        double luas = (22.0/7) * jariJari * jariJari;
        System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah " + luas);
        return luas;
    }

    // Metode untuk mengucapkan selamat ulang tahun
    static String selamatUlangTahun(String namaDepan, String namaBelakang){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Masukkan umur untuk " + namaDepan + " " + namaBelakang + ": ");
        int umur = inputScanner.nextInt();
        String ucapan = "Saudara " + namaDepan + " " + namaBelakang + " berumur " + umur + ", semoga panjang umur.";
        return ucapan;
    }
}
