import java.util.Scanner;

public class ucakBilet {
    public static void main(String[] args) {
        double yas12 = 0.50, yas65 = 0.30, yas24 = 0.10,km,yas,kmBaslangici = 0.10, yolculuk;

        System.out.print("Km giriniz:");
        Scanner btl = new Scanner(System.in);
        km=btl.nextDouble();

        System.out.print("Yaşınızı giriniz:");
        yas = btl.nextDouble();

        double normalTutar =    (km * kmBaslangici);

        double indirimliYas =   (normalTutar * yas12);
        double indirimliTutar = (normalTutar - indirimliYas);

        double indirimliYas2 =   (normalTutar * yas24);
        double indirimliTutar2 = (normalTutar - indirimliYas2);

        double indirimliYas3 =   (normalTutar * yas65);
        double indirimliTutar3 = (normalTutar - indirimliYas3);

        System.out.println("Tek yön=>1\nÇift yön=>2 ");
        yolculuk = btl.nextDouble();
        double gidisdonus = (indirimliTutar * 0.20);
        double tutar = (indirimliTutar - gidisdonus);
        if (yas < 12 && yolculuk == 1) {
            System.out.println("Yaşınız küçük %50 indirim uygulanacaktır:" + indirimliTutar);

        } else if (yas < 12 && yolculuk == 2) {
            System.out.println("Gidiş dönüş indirimi uygulandı:" + tutar);

        } else if (yas < 12 && yas < 24 && yolculuk == 1) {
            System.out.println("Gençsiniz %10 indirim uygulanacaktır:" + indirimliTutar2);

        } else if (yas < 12 && yas < 24 && yolculuk == 2) {
            System.out.println("Gidiş dönüş indirim uygulandı:" + tutar);

        } else if (yas < 65 && yolculuk == 1) {
            System.out.println("Yaşınız için %30 indirim uygulanacaktır:" + indirimliTutar3);

        } else if (yas < 65 && yolculuk == 2) {
            System.out.println("Gidiş dönüş indirimi uygulandı:" + tutar);
        }
        else{
            System.out.println("Hatalı veri girdiniz!");
        }
    }







    }


