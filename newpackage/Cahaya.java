package newpackage;

public class Cahaya {
            double kecepatanCahaya, jarakBumiBulan,jarakBumiMatahari;

        double waktuKeBulan(){
            return jarakBumiBulan / kecepatanCahaya;
        }
        double waktuKeMatahari(){
            return jarakBumiMatahari / kecepatanCahaya;
        }
}
