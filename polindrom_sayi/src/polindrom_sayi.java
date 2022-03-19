import java.util.Scanner;
public class polindrom_sayi {
    static boolean isPolindrom(int sayi){
        int yeni_sayi = sayi, result = 0, son_sayi;
        while (yeni_sayi != 0){
            son_sayi = yeni_sayi % 10;
            result = (result * 10) + son_sayi;
            yeni_sayi /= 10;
        }

        if(result == sayi){
            System.out.println("Girdiğiniz sayı polindrom sayıdır : " + sayi);
        } else {
            System.out.println("Girdiğiniz sayı polindrom sayı değildir : " + sayi);
        }
        return true;
    }
    public static void main(String[] args) {
        int sayi;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen gireceğiniz sayının polindrom mu olduğunu görmek için bir sayi giriniz : ");
        sayi = girdi.nextInt();
        isPolindrom(sayi);

    }
}
