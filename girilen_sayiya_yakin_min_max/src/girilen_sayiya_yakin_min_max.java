import java.util.Scanner;
public class girilen_sayiya_yakin_min_max {
    public static void main(String[] args) {
        int sayi, buyuk_en_kucuk = 9999, kucuk_en_buyuk = -9999;
        int[] list1 = {15,12,788,1,-1,-778,2,0};
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz : ");
        sayi = girdi.nextInt();
        for (int i = 0; i < list1.length; i++) {
            if (sayi < list1[i]){
                if (list1[i] < buyuk_en_kucuk){
                    buyuk_en_kucuk = list1[i];
                }
            }
            if (sayi > list1[i]){
                if (list1[i] > kucuk_en_buyuk){
                    kucuk_en_buyuk = list1[i];
                }
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + kucuk_en_buyuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + buyuk_en_kucuk);
    }
}
