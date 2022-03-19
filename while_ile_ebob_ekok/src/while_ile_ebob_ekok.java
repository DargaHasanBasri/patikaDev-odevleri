import java.util.Scanner;
public class while_ile_ebob_ekok {
    public static void main(String[] args) {
        int sayi1, sayi2;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen birinci sayıyı giriniz : ");
        sayi1 = girdi.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz : ");
        sayi2 = girdi.nextInt();
        boolean kucuk = sayi1 < sayi2;      // kullanıcının ilk sayıyı küçük mü büyük mü girdiğini kontrol ediyoruz
        int sonuc = kucuk ? sayi1 : sayi2; // kullanıcın girdiği sayılardan küçük olanını seçiyoruz sonuç değişkenine atıyoruz
        int i = 1, ebob = 1;              // hata almamak için gerekli değişkenlerin başlangıç değerlerini atıyoruz
        while (i != sonuc + 1){ // while döngüsünün sonuc sayısının +1(sonuc sayısınıda kontnrol etsin diye) değerine eşit olduğunda bitmesini sağlıyoruz
            if (sayi1 % i == 0 && sayi2 % i == 0){ // ebob olacak sayısın şartını belirliyoruz ve en büyük olanı dögü sayesinde ebob değişkenine atıyoruz
                ebob = i;
            }
            i++;
        }
        System.out.println("Girdiğiniz sayıların ebobu : " + ebob);
        System.out.println("Girdiğiniz sayıların ekoku : " + (sayi1 * sayi2) / ebob);
    }
}
