import java.util.Scanner;

public class sinifiGecme {
    public static void main(String[] args) {
        int toplam=1,derssayisi=0,ortalama,mat,fizik,turkce,kimya,muzik;

        System.out.print("Matematik notunuzu giriniz:");
        Scanner input=new Scanner(System.in);

        mat=input.nextInt();
        if (mat>-1&&mat<101){
            toplam+=mat;
            derssayisi+=1;
        }else{
        System.out.println("Geçersiz not girdiniz!");
        }
        System.out.print("fizik notunuzu giriniz :");
        fizik=input.nextInt();
        if (fizik>-1&&mat<101){
            toplam+=fizik;
            derssayisi+=1;
        }else{
            System.out.println("Geçersiz not girdiniz!");
        }
        System.out.println("Türkçe notunuzu giriniz:");
        turkce= input.nextInt();
        if (turkce>-1&&turkce<101){
            toplam+=turkce;
            derssayisi+=1;
        }else{
            System.out.println("Geçersiz not girdiniz!");
        }
        System.out.print("Kimya notunuzu giriniz:");
        kimya= input.nextInt();
        if (kimya>-1&&kimya<101){
            toplam+=kimya;
            derssayisi+=1;
        }else{
            System.out.println("Geçersiz not girdiniz!");
        }
        System.out.print("Müzik notunuzu giriniz:");
        muzik=input.nextInt();
        if (muzik>-1&&muzik<101){
            toplam+=muzik;
            derssayisi+=1;
        }else{
            System.out.println("Geçersiz not girdiniz!");
        }
        ortalama=toplam/derssayisi;
        System.out.println("Ortalama:"+ortalama);
    }
}
