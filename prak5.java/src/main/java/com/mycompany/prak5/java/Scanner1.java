/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prak5.java;

import java.util.Scanner;

/**
 *
 * @autor Musfara
 */
public class Scanner1 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukan nama Lengkap: ");
        String nama = in.nextLine();
        
        System.out.print("Masukan nim: : ");
        int NIM = in.nextInt();
        
        System.out.print("Masukan Nilai: : ");
        float nilai = in.nextFloat();
        
        
        System.out.println("\nNama : " + nama +
                           "\nNIM  : " + NIM +
                           "\nNilai: " + nilai);                 
    }
}
