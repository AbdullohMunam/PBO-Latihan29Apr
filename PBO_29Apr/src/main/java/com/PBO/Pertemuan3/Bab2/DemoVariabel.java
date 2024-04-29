/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PBO.Pertemuan3.Bab2;

/**
 *
 * @author A-13
 */
public class DemoVariabel {
    public static void main(String[] args) {
        // Deklarasi variabel
        char huruf;
        boolean isMasihBelajar;
        int nilaiUjian;
        double hargaBarang;
        float diskon;
        byte umur;
        short kodePos;
        long populasiNegara;
        String namaLengkap;
        // Inisialisasi variabel
        huruf = 'a';
        isMasihBelajar = true;
        nilaiUjian = 80;
        hargaBarang = 150000.0;
        diskon = 0.1f;
        umur = 17;
        kodePos = (short) 51121; // Saya tambahkan (short) karena error
        populasiNegara = 273523615;
        namaLengkap = "Budi Raharjo";
        // Menampilkan data
        System.out.println("Data:");
        System.out.println("Huruf: " + huruf);
        System.out.println("Masih belajar: " + isMasihBelajar);
        System.out.println("Nilai ujian: " + nilaiUjian);
        System.out.println("Harga barang: " + hargaBarang);
        System.out.println("Diskon: " + diskon);
        System.out.println("Umur: " + umur);
        System.out.println("Kode pos: " + kodePos);
        System.out.println("Populasi negara: " + populasiNegara);
        System.out.println("Nama lengkap: " + namaLengkap);
    }
}
