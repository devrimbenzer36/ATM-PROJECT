package Projelerim;
import java.util.Scanner;

public class Project7 {
    public static void main(String[] args){

        int km,yas,tip;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen km cinsinden yolculuk mesafenizi giriniz:  ");
        km = input.nextInt();

        input = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz:  ");
        yas = input.nextInt();

        input = new Scanner(System.in);
        System.out.print("Lütfen yolculuk tipini giriniz\n 1=Tek Yön,2=Gidiş Dönüş\n:   ");
        tip = input.nextInt();

        double toplam;
        toplam = km * 0.10;

        if(yas<12 && tip==2){
            System.out.print("Ödemeniz gereken toplam tutar:  " +toplam*0.80);
        }
        if(yas>12 && tip==2){
            System.out.print("Ödemeniz gereken toplam tutar:  " +toplam*0.30);
        }
        if(yas>12 && tip==1){
            System.out.print("Ödemeniz gereken toplam tutar:  " +toplam);
        }
        if(yas<12 && tip==2){
            System.out.print("Ödemeniz gereken toplam tutar:  " +toplam*0.50);
        }

        // Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.








    }
}
