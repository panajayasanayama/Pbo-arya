package aryawe;

import java.io.*;
import java.util.Scanner;

public class no2{
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Scanner input1 = new Scanner(System.in);
        System.out.println("no 2");
        System.out.print("Nama\t\t: ");
        String nama = input1.nextLine();
        System.out.print("Total Belanja\t: ");
        double totalBelanja = input1.nextDouble();
        System.out.print("Diskon (%)\t: ");
        double diskon = input1.nextDouble();
        System.out.print("Bayar\t\t: ");
        double bayar = input1.nextDouble();
        
        double total=totalBelanja-(totalBelanja *(diskon/100));
        double kembalian=bayar-total;
        
        DataOutputStream output = new DataOutputStream(
                new FileOutputStream("belanja.dat")
        );
        
        output.writeUTF(nama);
        output.writeDouble(totalBelanja);
        output.writeDouble(diskon);
        output.writeDouble(total);
        output.writeDouble(bayar);
        output.writeDouble(kembalian);
        
        output.close();
        
        DataInputStream input2 = new DataInputStream(
                new FileInputStream("belanja.dat")
        );
        
        String bacaNama=input2.readUTF();
        double bacaTotalBelanja=input2.readDouble();
        double bacaDiskon=input2.readDouble();
        double bacaTotal=input2.readDouble();
        double bacaBayar=input2.readDouble();
        double bacaKembalian=input2.readDouble();
        
        input2.close();
        
 
        System.out.println("");
        System.out.println("Nama\t\t: " + bacaNama);
        System.out.println("Total Belanja: " + bacaTotalBelanja);
        System.out.println("Diskon (%)\t: " + bacaDiskon);
        System.out.println("Total\t: " + bacaTotal);
        System.out.println("Bayar\t: " + bacaBayar);
        System.out.println("Kembalian\t: " + bacaKembalian);
    }
}