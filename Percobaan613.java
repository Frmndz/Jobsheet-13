package JOBSHEET_13;
import java.util.Scanner;

public class Percobaan613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukkan panjang : ");
        p = sc.nextInt();
        System.out.print("Masukkan lebar : ");
        l = sc.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = sc.nextInt();

        L = p*l;
        System.out.println("Luas persegi panjang adalah " + L);

        vol = p*l*t;
        System.out.println("Volume balok adalah "+  vol);
    }
}
