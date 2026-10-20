package aryawe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class no5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("no 5");
        System.out.print("Masukkan harga 1 Apel (Rp)  : ");
        double hargaApel = Double.parseDouble(br.readLine());
        
        System.out.print("Masukkan harga 1 Jeruk (Rp) : ");
        double hargaJeruk = Double.parseDouble(br.readLine());
        
        int apelDibeli = 70;
        
        int jerukPerTetangga = 30;
        int jumlahTetangga = 4;
        int totalJerukAwal = jerukPerTetangga * jumlahTetangga;
        int jerukBusuk = 15;
        
        int jerukDibeli = totalJerukAwal - jerukBusuk; 
        
        double totalBayarSemua = (apelDibeli * hargaApel) + (jerukDibeli * hargaJeruk);
        
        // --- OUTPUT CUMA TOTAL ---
        System.out.println("");
        System.out.printf("TOTAL YANG HARUS DIBAYAR :", totalBayarSemua);

    }
}