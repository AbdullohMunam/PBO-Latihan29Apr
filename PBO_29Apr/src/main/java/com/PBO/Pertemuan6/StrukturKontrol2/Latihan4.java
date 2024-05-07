/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PBO.Pertemuan6.StrukturKontrol2;
import java.util.Scanner;

/**
 *
 * @author B-3
 */
public class Latihan4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day;
        
        while(true){
            System.out.println("Enter a day (1-7):");
            day = input.nextInt();
            
            if (day < 1 || day > 7){
                System.out.println("Invalid input! Day must be between 1 and 7.");
                continue;
            } else break;
        }
        
        switch (day) {
        case 1:
        System.out.println("Monday");
        break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
        break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        }
    }
}
