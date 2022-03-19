public class bir_yuz_arasindaki_asallar {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            int sayac = 0;
            for(int k = 1; k <= i; k++){
                if(i % k == 0){
                    sayac++;
                }
            }
            if(sayac == 2){
                System.out.print(" " + i);
            }
        }
    }
}
