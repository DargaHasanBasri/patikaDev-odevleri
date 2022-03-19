public class Dizideki_sayilarin_harmonik_ort {
    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 4, 5};
        double sum = 0.0;

        for (int i = 0; i < myList.length; i++){
            sum += (1/(double)myList[i]);
        }
        System.out.println("Dizinin harmonik ortalaması : " + (myList.length) / (sum));
    }
}
