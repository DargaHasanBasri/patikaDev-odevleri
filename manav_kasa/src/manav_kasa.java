import java.util.Scanner;
public class manav_kasa {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, tutar;
        Scanner deger = new Scanner(System.in);
        System.out.print("Armut Kac Kilo ? : ");
        double a_kilo = deger.nextDouble();
        System.out.print("Elma Kac Kilo ? : ");
        double e_kilo = deger.nextDouble();
        System.out.print("Domates Kac Kilo ? : ");
        double d_kilo = deger.nextDouble();
        System.out.print("Muz Kac Kilo ? : ");
        double m_kilo = deger.nextDouble();
        System.out.print("Patlican Kac Kilo ? : ");
        double p_kilo = deger.nextDouble();

        tutar = (a_kilo * armut) + (e_kilo * elma) + (d_kilo * domates) + (m_kilo * muz) + (p_kilo * patlican);

        System.out.print("Toplam Tutar : " + tutar);
    }
}
