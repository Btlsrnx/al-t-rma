import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin=false;
        boolean isWrong=false;

        while (right < 5) {
            System.out.println("Lütfen bir sayı giriniz:");
            selected = input.nextInt();
            if (selected < 0 || selected > 101) {
                System.out.println("Lütfen 0 ve 100 aralığında bir değer giriniz:");
                if (!isWrong){
                    isWrong=true;
                    System.out.println("Hatalı girdiğiniz için hakkınızdan düşülecektir.");
                }else{
                    System.out.println("Çok fazla hatalı giriş yaptınız! Kalan hakkınız:"+(5-(++right)));
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler tahmin ettiğiniz sayı doğru !Tahmin ettiğiniz sayı :" + number);
                isWin=true;
                break;
            } else {
                wrong[right] = selected;
                right++;
                System.out.println("Hatalı bir sayı girdiniz! Lütfen tekrar deneyiniz:");
            }
            if (selected > number) {
                System.out.println(selected + " sayısı,gizli sayıdan büyüktür!");
            } else {
                System.out.println(selected + " sayısı,gizli sayıdan küçüktür!");
            }
            System.out.println("Kalan hakkı:" + (5 - right));
        }

         if (!isWin){
        System.out.println("Kaybedenler kulübüne hoşgeldin ciğerim!");
     }
        System.out.println("GİZLİ SAYI:"+number);
        System.out.println("Tahminleriniz:"+ Arrays.toString(wrong));
   }

}



