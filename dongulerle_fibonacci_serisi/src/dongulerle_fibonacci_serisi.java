import java.util.Scanner;
public class dongulerle_fibonacci_serisi {
    public static void main(String[] args) {
        int eleman, e1 = 0, e2 = 1, top = 0;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Hangi elemana kadar Fibonacci serisini görüntülemek istersiniz : ");
        eleman = girdi.nextInt();
        if (eleman == 1){
            System.out.print(eleman + " Elemanlı Fibonacci Serisi : " + e1);
        }else if (eleman == 2){
            System.out.print(eleman + " Elemanlı Fibonacci Serisi : " + e1 + " " + e2);
        } else {
            System.out.print(eleman + " Elemanlı Fibonacci Serisi : " + e1 + " " + e2);
            for (int i = 3; i <= eleman; i++){
                top = e1 + e2;
                e1 = e2;
                e2 = top;
                System.out.print(" " + top);
            }
        }
    }
}
