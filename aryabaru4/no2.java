
package aryabaru4;


import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        hari m=new hari();
        Scanner s=new Scanner(System.in);
        System.out.println("perogram kode hari");
        System.out.print("masukan angka:");
        m.x=s.nextInt();
        System.out.println("ini adalah hari "+m.keterangan());
    }
}
class hari{
    int x;
    String k;
    String keterangan(){
        if(this.x==1) k="senin";
        else if(this.x==2) k="selasa";
        else if(this.x==3) k="rabu";
        else if(this.x==4) k="kamis";
        else if(this.x==5) k="jumat";
        else if(this.x==6) k="sabtu";
        else if(this.x==7) k="minggu";
        else k="tidak valid";
        return k;
    }
}