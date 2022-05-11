package Projelerim;
import java.util.Scanner;

public class Project4 {
    public static void main(String[] args){
        int kg = 0;
        int sum =0;
        int elma = 3 * kg;
        int patlıcan = 2 * kg;
        int armut = 2 * kg;


        System.out.print("Kaç kilogram elma aldınız: ");
        Scanner input = new Scanner(System.in);
        kg = input.nextInt();




        System.out.print("Kaç kilogram armut aldınız: ");
        Scanner asd = new Scanner(System.in);
        kg = input.nextInt();



        System.out.print("Kaç kilogram patlıcan aldınız: ");
        Scanner ask = new Scanner(System.in);
        kg = input.nextInt();
        sum=patlıcan + elma + armut;


        System.out.println("Ödemeniz gereken toplam tutar: " +sum);




    }
}
