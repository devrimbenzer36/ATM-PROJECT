package Projelerim;
import java.util.Scanner;

public class Project8 {
    public static void main(String[] args){
        int a;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz: ");
        a = inp.nextInt();

         for(int i = 1; i <= a; i++){
             if(i % 2 == 0){
                 System.out.println(i);
             }
         }



    }



}
