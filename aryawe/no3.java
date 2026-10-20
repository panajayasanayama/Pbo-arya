package aryawe; 

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class no3{
    public static void main(String[] args) throws IOException {
        System.out.println("no 3");
        System.out.println("=== 1. MENGGUNAKAN SCANNER ===");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan umur (Scanner): ");
        int umurScanner = input.nextInt(); 
        System.out.println("Umur yang dibaca Scanner: " + umurScanner);
        
        System.out.println("");
        System.out.println("=== 2. MENGGUNAKAN BUFFEREDREADER ===");
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        
        System.out.print("Masukkan umur (BufferedReader): ");
        String inputString = br.readLine(); 
        int umurBR = Integer.parseInt(inputString); 
        
        System.out.println("Umur yang dibaca BufferedReader: " + umurBR);
    }
}