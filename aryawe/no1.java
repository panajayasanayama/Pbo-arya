package aryawe;

import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String noI,N,A,j;
        double p1,p2,p3,p4,tot,pp,gb;
        System.out.println("no 1");
        System.out.println("Nomor induk karyawan:");
        noI=cin.nextLine();
        System.out.println("Nama karyawan:");
        N=cin.nextLine();
        System.out.println("Alamat:");
        A=cin.nextLine();
        System.out.println("Jabatan:");
        j=cin.nextLine();
        System.out.println("Gaji pokok:");
        p1=cin.nextDouble();
        System.out.println("Tunjangan Jabatan:");
        p2=cin.nextDouble();
        System.out.println("Tunjangan Istri:");
        p3=cin.nextDouble();
        System.out.println("Tunjangan anak:");
        p4=cin.nextDouble();
        
        
        tot=p1+p2+p3+p4;
        pp=0.10*(p1+p2+p3);
        gb=tot-pp;
        
        System.out.println("Total gaji:"+tot);
        System.out.println("pajak penghasilan:"+pp);
        System.out.println("Gaji bersih:"+gb);
    }
}
