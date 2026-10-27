package aryabaru4;

import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        kasir m = new kasir();
        Scanner s = new Scanner(System.in);
        
        System.out.println("program kasir");
        System.out.print("apakah kamu member [y/n]: ");
        m.mem = s.nextLine().toUpperCase(); 
        System.out.print("total belanja: ");
        m.x = s.nextInt();
        m.prosesKasir();
        System.out.print("masukkan uang yang diberikan: ");
        m.uang = s.nextInt();
        m.kembalian = m.uang - m.tot;
        System.out.println("nota belanja");
        System.out.println("Status: " + m.k);
        System.out.println("Harga Awal: Rp " + m.x);
        System.out.println("Diskon: Rp " + m.dis);
        System.out.println("Total Bayar: Rp " + m.tot);
        System.out.println("Uang Bayar: Rp " + m.uang);
        System.out.println("Kembalian: Rp " + m.kembalian);
    }
}

class kasir {
    int x,dis,tot,uang,kembalian;
    String k,mem;
    
    void prosesKasir() {
        if (this.mem.equals("Y")&&x>500000) { 
            k = "member"; 
            dis = 50000; 
        } else if (this.mem.equals("Y")&&x>100000){   k = "member";   dis = 15000; 
        } else if (this.mem.equals("Y")) { k = "member";  dis = 0; 
        } else if (this.mem.equals("N") && x > 100000) {  k = "bukan member";  dis = 10000; 
        } else {  k = "bukan member";  dis = 0; 
        }
        tot = x - dis;
    }
}
