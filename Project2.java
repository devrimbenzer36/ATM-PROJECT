package Projelerim;
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args){
        double tutar;
        double kdvOrani = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz:  ");
        tutar = input.nextDouble();

        System.out.println("Kdv tutarınız :" +kdvOrani*tutar);

        double kdvliTutar = kdvOrani * tutar + tutar;
        System.out.print("Kdvli tutarınız: " +kdvliTutar);
    }
}
