import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int k , total = 1 ;

        Scanner input = new Scanner(System.in);

        System.out.println(" Lutfen hesaplamak isteginiz faktoriyeli girin: ");
        k = input.nextInt();

        for ( int i = 1 ; i <= k ; i ++) {
            total = total * i;
        }
        System.out.println(k + "!="+ total);
    }
}
