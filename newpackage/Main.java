package newpackage;

public class Main {
    public static void main(String[] args) {
        increment Incre = new increment();
        System.out.println("no.1");
        System.out.println("increment dari " + Incre.increment(0));  
        System.out.println("");

        PersegiPanjang Pp = new PersegiPanjang();
        Pp.lebar = 45;
        Pp.panjang = 50;
        System.out.println("2. luasnya adalah : " + Pp.hitungluas());
        System.out.println("");
        
        PersamaanKuadrat Pk =new PersamaanKuadrat();
        System.out.println("3. persamaan kuadrat :"+Pk.hitung(2, 10, 5));
        System.out.println("");
        
        Operasimatematika Om= new Operasimatematika();
        Om.x=22;
        Om.y=33;
        System.out.println("4. tambah :"+Om.tambah());
        System.out.println("4. kurang :"+Om.kurang());
        System.out.println("4. Bagi :"+Om.bagi());
        System.out.println("4. kali :"+Om.kali());  
        System.out.println("");
        
        LuasSegitiga Ls=new LuasSegitiga();
        Ls.a=6; Ls.b=8;
        System.out.println("5. Luas Segitiga :"+Ls.hitung());
        System.out.println("6. pytagoras segitiga :"+Ls.pytagoras());
        System.out.println("6. keliling segitiga:"+Ls.keliling());
        System.out.println("");
        
        String a="saya belajar Java";
        String b="saya belajar java";
        System.out.println("no 7.");
        System.out.println("A:"+a+"   B:"+b);
        a="saya belajar java";
        b="SAYA BELAJAR JAVA";
        System.out.println("A:"+a+"   B:"+b);
        System.out.println("");
        
        Cahaya C=new Cahaya();
        C.kecepatanCahaya = 300000;
        C.jarakBumiBulan = 384400; 
        C.jarakBumiMatahari = 152100000;
        System.out.println("8. bumi ke bulan kecepatan cahaya:"+C.waktuKeBulan());
        System.out.println("8. bumi ke matahari kecepatan cahaya:"+C.waktuKeMatahari());
        System.out.println("");
        
        KonveksiSuhu Ks=new KonveksiSuhu();
        Ks.c=10; Ks.f=15; Ks.r=5;
        System.out.println("9. celcius ke farenheit:"+Ks.celciusKeFahrenheit());
        System.out.println("9. farenheit ke celcius:"+Ks.fahrenheitKeCelcius());
        System.out.println("9. celcius ke Reamur:"+Ks.celciusKeReamur());
        System.out.println("9. Reamur ke celcius "+Ks.reamurKeCelcius());
        System.out.println("9. farenheit ke Reamur:"+Ks.fahrenheitKeReamur());
        System.out.println("9. Reamur ke farenheit:"+Ks.reamurKeFahrenheit());
        
        
        
    }
}
