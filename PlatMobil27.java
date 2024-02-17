import java.util.Scanner;
public class PlatMobil27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] KODE = {'A','B','D','E','F','G','H','L','N','T'};
        char [][] KOTA = new char[10][12];
        KOTA[0] = "BANTEN".toCharArray();
        KOTA[1] = "JAKARTA".toCharArray();
        KOTA[2] = "BANDUNG".toCharArray();
        KOTA[3] = "CIREBON".toCharArray();
        KOTA[4] = "BOGOR".toCharArray();
        KOTA[5] = "PEKALONGAN".toCharArray();
        KOTA[6] = "SEMARANG".toCharArray();
        KOTA[7] = "SURABAYA".toCharArray();
        KOTA[8] = "MALANG".toCharArray();
        KOTA[9] = "TEGAL".toCharArray();
        System.out.print("Masukkan Plat Mobil = ");
        String cari = sc.next();
        char cari2 = cari.charAt(0);
        for (int i = 0;i<KODE.length;i++) {
            if (cari2 == KODE[i]){
                System.out.println(KOTA[i]);
            }
        }
    }
}