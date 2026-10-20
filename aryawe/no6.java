package aryawe;

import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("No 6");
        
        System.out.println("Waktu Pertama");
        System.out.print("Jam(0-23) : "); 
        int jam1 = input.nextInt();
        System.out.print("Menit(0-59) : "); 
        int menit1 = input.nextInt();
        
        System.out.println("Waktu Kedua");
        System.out.print("Jam(0-23) : "); 
        int jam2 = input.nextInt();
        System.out.print("Menit (0-59) : "); 
        int menit2 = input.nextInt();
        
        int totalMenit1=(jam1*60)+menit1;
        int totalMenit2=(jam2*60)+menit2;
        
        int selisihMenit;
        if(totalMenit2 >= totalMenit1) {
            selisihMenit = totalMenit2-totalMenit1;
        }else{
            selisihMenit = totalMenit1-totalMenit2;
        }
        

        int hasilJam = selisihMenit / 60;
        int hasilMenit = selisihMenit % 60;
        
        System.out.println("");
        System.out.println("Selisih Waktu = " + hasilJam + " Jam " + hasilMenit + " Menit");
        
        input.close();
    }
}