package Projelerim;
import java.util.Scanner;

public class Project1 {
    public static void main(String [] args) {
        int mat, tr, biyo;

        Scanner not = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz:  ");
        mat = not.nextInt();


        System.out.print("Türkçe notunuzu giriniz:  ");
        tr = not.nextInt();


        System.out.print("Biyoloji notunuzu giriniz:  ");
        biyo = not.nextInt();

        int toplam = (mat + tr + biyo);
        double sonuc = (toplam / 3);

        System.out.println("Derslerinizin ortalaması : " +sonuc);





    }
}
