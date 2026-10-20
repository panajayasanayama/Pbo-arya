package aryawe;

import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("no.4:");
        System.out.print("Masukkan massa benda (m) dalam kg    : ");
        double m = input.nextDouble();
        System.out.print("Masukkan kecepatan (v) dalam m/s     : ");
        double v = input.nextDouble();
        System.out.print("Masukkan jari-jari lintasan (r) dalam m: ");
        double r = input.nextDouble();

        double vKuadrat = v * v; 
        double fc = (m * vKuadrat) / r;
        
        System.out.printf("Gaya Sentripetal (Fc) ="+fc);
        
        input.close();
    }
}