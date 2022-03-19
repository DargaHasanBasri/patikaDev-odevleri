import java.util.Scanner;
public class taksimetre_hesaplama {
    public static void main(String[] args) {
        int mesafe;
        double kmBasi = 2.20, tutar, acilis_tutar = 10;
        Scanner yol = new Scanner(System.in);
        System.out.print("Lutfen mesafeyi KM olarak giriniz: ");
        mesafe = yol.nextInt();
        tutar = (mesafe * kmBasi);
        tutar += acilis_tutar;
        tutar = (tutar < 20) ? 20 : tutar;
        System.out.println("Ucret : " + tutar);

    }
}
