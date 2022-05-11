package Projelerim;
import java.util.Scanner;

public class Project6 {
    public static void main(String[] args){
        String kullaniciadi;
        String sifre;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen kullanıcı adınızı giriniz:  ");
        kullaniciadi = inp.nextLine();

        System.out.print("Lütfen şifrenizi giriniz:  ");
        sifre = inp.nextLine();


        if(kullaniciadi.equals("devrimbenzer") && sifre.equals("mertbenzer")){
            System.out.println("Giriş başarılı");
        }
        else {
            System.out.println("Girdiğiniz bilgiler hatalı");
        }
    }
}
