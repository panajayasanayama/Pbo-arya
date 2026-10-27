package aryabaru4;

import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        gajiber m = new gajiber();
        Scanner s = new Scanner(System.in);
        
        System.out.println("=== Program Hitung Gaji Bersih Karyawan ===");
        System.out.print("Masukkan NIK\t\t\t: ");
        m.nik = s.nextLine();
        System.out.print("Masukkan Nama\t\t\t: ");
        m.nama = s.nextLine();
        System.out.print("Masukkan Kode Golongan (1-4): ");
        m.kodeGolongan = s.nextInt();
        s.nextLine(); 
        System.out.print("Masukkan Status Pernikahan: ");
        m.status = s.nextLine();
        System.out.print("Masukkan Jumlah Anak\t: ");
        m.jumlahAnak = s.nextInt();
        m.hitungGaji();
        System.out.println("Rincian Gaji");
        System.out.println("NIK\t\t: " + m.nik);
        System.out.println("Nama\t\t: " + m.nama );
        System.out.println("Kode Golongan\t: " + m.kodeGolongan);
        System.out.println("Status Pernikahan: " + m.status);
        System.out.println("Jumlah Anak\t: " + m.jumlahAnak);
        System.out.println("Gaji Pokok\t: Rp " + m.gajiPokok);
        System.out.println("Tunjangan Pasangan : Rp " + m.tunjanganPasangan);
        System.out.println("Tunjangan Anak: Rp " + m.tunjanganAnak);
        System.out.println("Gaji Bersih: Rp " + m.gajiBersih);
    }
}

class gajiber{

    String nik, nama, status;
    int kodeGolongan, jumlahAnak;
    double gajiPokok, tunjanganPasangan, tunjanganAnak, gajiBersih;

    void hitungGaji() {
        switch (kodeGolongan) {
            case 1:
                gajiPokok = 1200000;
                break;
            case 2:
                gajiPokok = 1500000;
                break;
            case 3:
                gajiPokok = 1750000;
                break;
            case 4:
                gajiPokok = 2000000;
                break;
            default:
                System.out.println("Kode ga ada 1-4 aja!!!!!!!");
                gajiPokok = 0;
        }
        if(kodeGolongan==1||kodeGolongan==3||kodeGolongan==4){tunjanganPasangan = 0.10 * gajiPokok;
        }else{tunjanganPasangan = 0;
        }
        tunjanganAnak=0.05*gajiPokok*jumlahAnak;
        gajiBersih=gajiPokok+tunjanganPasangan+tunjanganAnak;
    }
}