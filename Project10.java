package Projelerim;
import java.util.Scanner;

public class Project10 {
    public static void main(String[] args){
        String kullaniciAdi;
        String sifre;
        int hak = 3;
        int bakiye = 2500;
        int seçim;


        while (hak>0) {
            Scanner input = new Scanner(System.in);
            System.out.print("Lutfen kullanıcı adınızı giriniz: ");
            kullaniciAdi = input.nextLine();
            System.out.print("Lütfen şifrenizi giriniz: ");
            sifre = input.nextLine();
            if(kullaniciAdi.equals("devrimbenzer") && sifre.equals("mertbenzer")){
                System.out.println("Merhaba BENZER bankasına hoşgeldini");
                do {

                    System.out.print("1-Para Yatırma\n" +
                            " 2-Para Çekme\n" +
                            " 3-Bakiye Sorgulama\n" +
                            " 4-Çıkış Yap \n");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    seçim = input.nextInt();
                    if(seçim == 1){
                        System.out.print("Lütfen yatırmak istediğiniz tutarı giriniz: ");
                        int yatırım = input.nextInt();
                        bakiye +=yatırım;
                        System.out.println("Güncel bakiyeniz: "+bakiye);

                    }
                    else if(seçim==2){
                        System.out.print("Lütfen çekmek istediğiniz tutarı giriniz: ");
                        int çekme = input.nextInt();
                        if(çekme>bakiye){
                            System.out.println("Yetersiz bakiye.Lütfen daha düşük bir tutar giriniz");

                        }else {
                            bakiye -= çekme;
                            System.out.println("Güncel bakiyeniz: "+bakiye);
                        }
                    }
                    else if(seçim==3){
                        System.out.println("Güncel bakiyeniz: "+bakiye);
                    }

                }while (seçim != 4);
                System.out.print("Çıkış yapıldı.Sağlıklı günler dileriz");
                break;

            }
            else{
                System.out.println("Hatalı kullanıcı adı ve şifre tekrar deneyiniz.Kalan hakkınız: "+ --hak);
            }
        }


    }
}
