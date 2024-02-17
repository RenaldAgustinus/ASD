import java.util.Scanner;
public class Rumus27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kecepatan,jarak,waktu,pilihan;
        System.out.println("1. kecepatan");
        System.out.println("2. jarak");
        System.out.println("3. waktu");
        System.out.println("4. exit");
        System.out.print("Masukkan Pilihan : ");
        pilihan = sc.nextInt();
        if (pilihan == 1) {
            System.out.print("Masukkan Jarak = ");
            jarak = sc.nextInt();
            System.out.print("Masukkan Waktu = ");
            waktu = sc.nextInt();
            kecepatan = jarak/waktu;
            System.out.println("Kecepatan = "+ kecepatan );
        }else if (pilihan == 2) {
            System.out.print("Masukkan Kecepatan = ");
            kecepatan = sc.nextInt();
            System.out.print("Masukkan Waktu = ");
            waktu = sc.nextInt();
            jarak = kecepatan*waktu;
            System.out.print("Jarak = "+ jarak);
        }else if(pilihan == 3) {
            System.out.print("Masukkan Jarak = ");
            jarak = sc.nextInt();
            System.out.print("Masukkan Kecepatan = ");
            kecepatan = sc.nextInt();
            waktu = jarak/kecepatan;
            System.out.print("Waktu = " + waktu);
        }
        
    }
}