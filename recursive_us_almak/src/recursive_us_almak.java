import java.util.Scanner;
public class recursive_us_almak {
    static int us_alma(int taban, int us){
        if(us == 0){
            return 1;
        } else if(taban == 1) {
            return 1;
        } else {
            return taban * us_alma(taban,us-1);
        }
    }
    public static void main(String[] args) {
        int taban, us;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen taban değerini giriniz : ");
        taban = girdi.nextInt();
        System.out.print("Lütfen üs değerini giriniz : ");
        us = girdi.nextInt();
        System.out.println("Üslü ifadenizin sonucu : " + us_alma(taban,us));
    }
}
