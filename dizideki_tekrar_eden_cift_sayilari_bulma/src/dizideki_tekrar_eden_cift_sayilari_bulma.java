public class dizideki_tekrar_eden_cift_sayilari_bulma {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {6,7,6,6,2,8,11,21,11,11,8,2,3,4,7,3};
        int[] duplicate = new  int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if ((i != j) && (list[i] == list[j]) && (list[i] %2 == 0)){
                    if (!isFind(duplicate,list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value : duplicate){
            if (value != 0){
                System.out.print(" " + value);
            }
        }
    }
}