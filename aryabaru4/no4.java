
package aryabaru4;

import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        tahunkabisat m=new tahunkabisat();
        Scanner s=new Scanner(System.in);
        System.out.println("perogram ngecek tahun kabisat");
        System.out.print("masukan tahun:");
        m.x=s.nextInt();
        System.out.println(m.x+" adalah "+m.keterangan());
    }
}
class tahunkabisat{
    int x;
    String k;
    String keterangan(){
        if((this.x % 4 == 0 && this.x % 100 != 0) || (this.x % 400 == 0)) k="tahun kabisat";
        else k="bukan tahun kabisat";
        return k;
    }
}