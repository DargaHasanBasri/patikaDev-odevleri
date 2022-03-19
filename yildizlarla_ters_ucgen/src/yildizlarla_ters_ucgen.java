import java.util.Scanner;
public class yildizlarla_ters_ucgen {
    public static void main(String[] args) {
        int basamak_sayisi;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        basamak_sayisi = girdi.nextInt();
        for (int i = basamak_sayisi; i >= 1; i--) {
            for (int k = (basamak_sayisi-i); k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = (2*i) - 1; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
