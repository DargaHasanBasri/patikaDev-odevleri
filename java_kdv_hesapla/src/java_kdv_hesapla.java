import java.util.Scanner;
public class java_kdv_hesapla {
    public static void main(String[] args) {
        double fiyat, kdv_tutari, kdvli_fiyat;
        Scanner veri = new Scanner(System.in);
        System.out.print("Lütfen KDV'li fiyatını öğrenmek istediğiniz tutarı girin: ");
        fiyat = veri.nextDouble();
        if(fiyat >= 0 && fiyat < 1000){
            kdv_tutari = (fiyat * 0.18);
            kdvli_fiyat = fiyat + kdv_tutari;
        } else {
            kdv_tutari = (fiyat * 0.8);
            kdvli_fiyat = fiyat + kdv_tutari;
        }
        System.out.println("KDV'siz fiyat: " + fiyat);
        System.out.println("KDV'li fiyat: " + kdvli_fiyat);
        System.out.println("KDV tutarı : " + kdv_tutari);
    }
}
