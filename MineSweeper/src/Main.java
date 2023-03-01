import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many rows does has board:");
        int row= input.nextInt();
        System.out.print("How many columns does has board:");
        int col = input.nextInt();
        MineSweepers mine = new MineSweepers(row,col);
        mine.run();
    }
}