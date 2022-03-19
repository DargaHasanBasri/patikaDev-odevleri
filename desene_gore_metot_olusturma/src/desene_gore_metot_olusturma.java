import java.util.Scanner;
public class desene_gore_metot_olusturma {
    static void sayi_deseni(int n, int temp, boolean down) {
        System.out.print(" " + temp);
        if (temp <= 0) {
            down = false;
        }
        int next = down ? temp - 5 : temp + 5;
        if (next <= n) {
            sayi_deseni(n,next,down);
        }
    }
    public static void main(String[] args) {
        int sayi;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        sayi = girdi.nextInt();
        System.out.print("Desen : ");
        sayi_deseni(sayi,sayi,true);
    }
}