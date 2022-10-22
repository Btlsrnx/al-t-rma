import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        System.out.println("Bir sayı giriniz:");
        int sayi;
        Scanner input=new Scanner(System.in);
        double result=0.0;
        sayi=input.nextInt();
        for(int i=1;i<=sayi;i++) {
            result += (1.0 / i);
        }
            System.out.println("Harmonik sayı:"+result);
        }
    }

