import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        int k, r, total=1, total1=1,sonuc, sonuc2=1;

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen ilk grubun kaç elamanlı oldugunu belirtin: ");
        k = input.nextInt();
        System.out.println("Lutfen ikinci grubun kaç elamanlı oldugunu belirtin: ");
        r = input.nextInt();

        for (int i = 1 ; i <= k ; i++){
            total = total * i;
        }for (int n = 1 ; n <= r ; n++) {
            total1 = total1 * n;
        }
        int fark= k - r;
        for (int l = 1 ; l <= fark ; l++){
          sonuc2 = sonuc2 * l;

        }

        sonuc = (total/ (total1 * sonuc2));
        System.out.println(sonuc);
}}
