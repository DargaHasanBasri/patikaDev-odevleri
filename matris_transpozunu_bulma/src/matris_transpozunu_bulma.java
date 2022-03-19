public class matris_transpozunu_bulma {
    public static void main(String[] args) {
        int[][] matris = {
                {1,2,3},
                {4,5,6},
        };
        System.out.println("Matris : ");
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Transpoz :");
        for (int i = 0; i < matris.length + 1; i++) {
            for (int j = 0; j < matris.length; j++) {
                System.out.print(matris[j][i] + " ");
            }
            System.out.println();
        }
    }
}
