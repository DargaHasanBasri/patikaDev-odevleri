import java.util.Scanner;
public class girilen_sayi_asal_mi {
    static void asal_mi(int sayi){
        int sayac = 0;
        for (int i = 1; i <= sayi; i++) {
            int kalan = sayi % i;
            if (kalan == 0) {
                sayac++;
            }
        }
        if (sayac == 2){
            System.out.println("Girilen sayı ASAL SAYIDIR! : " + sayi);
        } else {
            System.out.println("Girilen sayı ASAL DEĞİLDİR! : " + sayi);
        }
    }
    public static void main(String[] args) {
        int sayi;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz : ");
        sayi = girdi.nextInt();
        asal_mi(sayi);
    }
}
