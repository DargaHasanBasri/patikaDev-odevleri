import java.util.Scanner;
public class mukemmel_sayi_bulma {
    /*
    Mükemmel Sayı Nedir ?
    Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
    toplamı kendisine eşit olan sayıya mükemmel sayı denir.
     */
    public static void main(String[] args) {
        int sayi, top = 0;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        sayi = girdi.nextInt();
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0){
                top += i;
            }
        }
        if (top == sayi){
            System.out.println(sayi + " Mükemmel bir sayıdır!");
        } else {
            System.out.println(sayi + " Mükemmel bir sayı değildir!");
        }
    }
}
