import java.util.Scanner;
public class girilen_sayilardan_min_max_bulma {
    public static void main(String[] args) {
        int kac_adet, sayi, buyuk_gecici = 0, kucuk_gecici = 999999;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz? : ");
        kac_adet = girdi.nextInt();
        for(int i = 1; i <= kac_adet; i++){
            System.out.print(i +". sayıyı giriniz : ");
            sayi = girdi.nextInt();
            if (sayi > buyuk_gecici){
                buyuk_gecici = sayi;
            }
            if (sayi < kucuk_gecici)
                kucuk_gecici = sayi ;
            }
        System.out.println("En büyük sayi : " + buyuk_gecici);
        System.out.println("En küçük sayi : " + kucuk_gecici);
    }
}
