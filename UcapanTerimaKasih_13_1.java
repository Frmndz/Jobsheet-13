package JOBSHEET_13;
import java.util.Scanner;

public class UcapanTerimaKasih_13_1 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan Nama orang yang ingin anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" + "You inspired in me a love for learning and made me feel like i Could ask you anything");
    }
    public static void UcapanTambahan(String ucapan){
        System.out.println(ucapan);
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
        String ucapan = "Terimakasih, Wassalamualaikum Wr Wb, Salam Sejahtera, Shalom, Om Swastiastu, Namo Buddhaya, Om Shanti Shanti Om, Rahayu Rahayu Rahayu ";
        UcapanTambahan(ucapan);
    }
}
