import java.util.Scanner;
public class vucut_kilo_indexi {
    public static void main(String[] args) {
        double boy, kilo, vk_index;

        Scanner indexi = new Scanner(System.in);
        System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz : ");
        boy = indexi.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz : ");
        kilo = indexi.nextDouble();

        vk_index = (kilo / (boy * boy));
        System.out.println("Vucut kilo indeksiniz : " + vk_index);

    }
}
