package aryabaru4;

import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        HitungPendapatan m = new HitungPendapatan();
        Scanner s = new Scanner(System.in);
        System.out.println("Program Menghitung Pendapatan Salesman");
        System.out.print("Masukkan total penjualan hari ini: ");
        m.penjualan=s.nextDouble();  
        m.hitung();
        
        System.out.println("pendapatan");
        System.out.println("Uang Jasa\t: Rp "+m.uangJasa);
        System.out.println("Uang Komisi\t: Rp "+m.komisi);
        System.out.println("Total Pendapatan: Rp "+m.totalPendapatan);
    }
}

class HitungPendapatan {
    double penjualan,uangJasa,komisi,totalPendapatan;

    void hitung(){
        if(this.penjualan>0&&this.penjualan<=2000000) {
            this.uangJasa=100000;
            this.komisi= 0.10*this.penjualan;
        }else if(this.penjualan>2000000&&this.penjualan<=5000000) {
            this.uangJasa=200000;
            this.komisi=0.15*this.penjualan;
        }else if(this.penjualan>5000000) {
            this.uangJasa=300000;
            this.komisi=0.20*this.penjualan;
        }else {
            this.uangJasa=0;
            this.komisi=0;
        }this.totalPendapatan=this.uangJasa+this.komisi;
    }
}
