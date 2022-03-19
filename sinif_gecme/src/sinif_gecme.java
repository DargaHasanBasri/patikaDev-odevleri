import java.util.Scanner;
public class sinif_gecme {
    public static void main(String[] args) {
        double mat, fizik, turkce, kimya, muzik;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Matematik notunuz : ");
        mat = girdi.nextDouble();
        System.out.print("Fizik notunuz : ");
        fizik = girdi.nextDouble();
        System.out.print("Turkce notunuz : ");
        turkce = girdi.nextDouble();
        System.out.print("Kimya notunuz : ");
        kimya = girdi.nextDouble();
        System.out.print("Muzik notunuz : ");
        muzik = girdi.nextDouble();
        double ort = (mat + fizik + turkce + kimya + muzik) / 5;
        boolean sonuc1 = (ort >= 60);
        String  sonuc2 = (sonuc1) ? "-Gectiniz" : "-Kaldınız" ;
        System.out.println("Ortalamanız : " + ort + sonuc2);
    }
}
