package aryawe;

import java.util.Scanner;

public class no7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("no 7");
        

        System.out.print("Masukkan jumlah novel yang dicetak : ");
        int jumlahNovel = input.nextInt();
        
        System.out.print("Masukkan tebal lembar per novel    : ");
        int tebalLembar = input.nextInt();
        
        int totalLembar = jumlahNovel * tebalLembar;
        int totalDetik = totalLembar; 
        
        
        int hari = totalDetik / 86400;
        int sisaDetik = totalDetik % 86400;
        
        int jam = sisaDetik / 3600;
        sisaDetik = sisaDetik % 3600;
        
        int menit = sisaDetik / 60;
        int detik = sisaDetik % 60;
        

        System.out.println("HASIL PERHITUNGAN");
        System.out.println("Total Lembar Yang Dicetak: " + totalLembar + " lembar");
        System.out.println("Total Waktu (Detik): " + totalDetik + " detik");
        System.out.println("Estimasi Waktu Pengerjaan :");
        System.out.println(hari + " Hari, " + jam + " Jam, " + menit + " Menit, " + detik + " Detik");
        
        input.close();
    }
}