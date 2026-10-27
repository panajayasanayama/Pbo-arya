
package aryabaru4;
//modulus no1

import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        mod m=new mod();
        Scanner s=new Scanner(System.in);
        System.out.println("perogram ngecek ganjil/genap");
        System.out.print("masukan angka:");
        m.x=s.nextInt();
        System.out.println("ini adalah bilangan "+m.keterangan());
    }
}
class mod{
    int x;
    String k;
    String keterangan(){
        if(this.x%2==0) k="genap";
        else k="ganjil";
        return k;
    }
}