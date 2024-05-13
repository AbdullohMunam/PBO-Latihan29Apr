/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PBO.Pertemuan5;
import java.util.Random;

/**
 *
 * @author A-12
 */
public class LatihanControlFlow2 {
     public static void main(String[] args) {
        // Membuat bilangan acak dari 1 sampai 20
        Random random = new Random();
        int jumlahPengulangan = random.nextInt(20) + 1;

        System.out.println("Pesan akan diulang sebanyak " + jumlahPengulangan + " kali");

        // Menentukan jumlah pengulangan pesan
        int jumlahPengulanganPesan = Math.min(jumlahPengulangan, 10);

        // Menampilkan pesan sebanyak jumlahPengulanganPesan
        for (int i = 0; i < jumlahPengulanganPesan; i++) {
            System.out.println("Pesan");
        }

        // Menampilkan pesan jika bilangan random terlalu besar
        if (jumlahPengulangan > 10) {
            System.out.println("Bilangan random yang didapat terlalu besar");
            System.out.println("Pesan akan diulang 5 kali");
            for (int i = 0; i < 5; i++) {
                System.out.println("Pesan");
            }
        }
    }
}
