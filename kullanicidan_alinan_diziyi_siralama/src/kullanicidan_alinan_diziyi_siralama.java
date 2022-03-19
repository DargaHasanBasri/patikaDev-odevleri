import java.util.Arrays;
import java.util.Scanner;
public class kullanicidan_alinan_diziyi_siralama {
    public static void main(String[] args) {
        int boyut, eleman, gecici;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Dizinin boyutunu girin : ");
        boyut = girdi.nextInt();
        int[] list = new int[boyut];
        for (int i = 0; i < boyut; i++){
            System.out.print((i+1) + ". elemanı girin : ");
            eleman = girdi.nextInt();
            list[i] = eleman;
        }
        Arrays.sort(list);
        System.out.println("Sıralama : " + Arrays.toString(list));
    }
}