package aryabaru4;

import java.util.Scanner;

public class no7{
    public static void main(String[] args){
        HitungLuas m=new HitungLuas();
        Scanner s=new Scanner(System.in);
        
        System.out.println("program bangundatar hitung");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Pilih menu (1-5): ");
        m.pilihan=s.nextInt();
        
        m.prosesHitung(s);
    }
}

class HitungLuas{
    int pilihan;
    double luas;

    void prosesHitung(Scanner s){
        switch(this.pilihan){
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                double sisi=s.nextDouble();
                this.luas=sisi*sisi;
                System.out.println("Luas Persegi adalah: "+this.luas);
                break;
                
            case 2:
                System.out.print("Masukkan alas segitiga: ");
                double alas=s.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggi=s.nextDouble();
                this.luas=0.5*alas*tinggi;
                System.out.println("Luas Segitiga adalah: "+this.luas);
                break;
                
            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double r=s.nextDouble();
                this.luas=3.14*r*r;
                System.out.println("Luas Lingkaran adalah: "+this.luas);
                break;
                
            case 4:
                System.out.print("Masukkan sisi sejajar atas: ");
                double a=s.nextDouble();
                System.out.print("Masukkan sisi sejajar bawah: ");
                double b=s.nextDouble();
                System.out.print("Masukkan tinggi trapesium: ");
                double tTrapesium=s.nextDouble();
                this.luas=0.5*(a+b)*tTrapesium;
                System.out.println("Luas Trapesium adalah: "+this.luas);
                break;
                
            case 5:
                System.out.print("Masukkan diagonal 1: ");
                double d1=s.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double d2=s.nextDouble();
                this.luas=0.5*d1*d2;
                System.out.println("Luas Layang-layang adalah: "+this.luas);
                break;
                
            default:
                System.out.println("Pilihan menu tidak valid!");
                break;
        }
    }
}
