import java.util.Scanner;
public class gelismis_hesap_makinesi {
    static int topla(int a, int b){
        int result = a + b;
        System.out.println("Sonuç : " + result);
        return result;
    }
    static int cıkart(int a, int b){
        int result = a - b;
        System.out.println("Sonuç : " + result);
        return result;
    }
    static int carp(int a, int b){
        if (b == 0){
            return 0;
        }
        int result = a * b;
        System.out.println("Sonuç : " + result);
        return result;
    }
    static int bol(int a, int b){
        int result = a / b;
        System.out.println("Sonuç : " + result);
        return result;
    }
    static int us_alma(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }
    static int mod(int a, int b){
        return a % b;
    }
    static void diktorgen(int a, int b){
        System.out.println("Çevresi : " + (2 * (a + b)));
        System.out.println("Alanı : " + (a * b));
    }
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int secim;
        String menu = "1-Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme İşlemi\n" +
                "5- Üs Alma İşlemi\n" +
                "6- Mod Alma İşlemi\n" +
                "7- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış Yap";
        System.out.println(menu);
        while (true) {
            System.out.print("Bir işlem seçiniz : ");
            secim = girdi.nextInt();
            if (secim == 0){
                break;
            }
            System.out.print("İlk sayıyı girin : ");
            int a = girdi.nextInt();
            System.out.print("İkinci sayıyı girin : ");
            int b = girdi.nextInt();
            switch (secim) {
                case 1:
                    topla(a, b);
                    break;
                case 2:
                    cıkart(a, b);
                    break;
                case 3:
                    carp(a, b);
                    break;
                case 4:
                    if (b == 0){
                        System.out.println("İkinci sayı 0 olamaz!");
                        break;
                    }
                    bol(a,b);
                    break;
                case 5:
                    System.out.println("Üs Alma : " + us_alma(a, b));
                    break;
                case 6:
                    System.out.println("Mod İşlemi : " + mod(a, b));
                    break;
                case 7:
                    diktorgen(a, b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem şeçtiniz!");
            }
        }
        System.out.println("Güle Güle!");
    }
}
