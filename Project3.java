package Projelerim;
import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        int km;
        int baslangıc = 2;
        int giris = 10;
        System.out.print("Lütfen kaç km gittiğinizi söyleyiniz: ");
        Scanner kac = new Scanner(System.in);
        km = kac.nextInt();
        int tutar = baslangıc * km + giris;

        System.out.println("Ödemeniz gereken toplam tutar : " +tutar);





    }
}
