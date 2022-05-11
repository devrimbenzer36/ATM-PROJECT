package Projelerim;
import java.util.Scanner;
public class Project9 {
    public static void main(String[] args) {
        int a;
        int toplam =0;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("Lütfen sayi giriniz: ");
            a = inp.nextInt();
            if(a % 2 == 1){
                toplam = toplam + a;


                }
            } while (a > 0);
        System.out.print(toplam);
    }
}
