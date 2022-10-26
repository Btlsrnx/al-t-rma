import java.util.Scanner;

public class sayi {
    public static void main(String[] args) {
        int number,buyuksayi=1,kucuksayi=1,which;
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        which=input.nextInt();
        for (int i=1;i<=which;i++) {
            System.out.print(i + ".sayı:");
            number = input.nextInt();
            if (i==1) {
                number=buyuksayi;
                number=kucuksayi;
            }
            if (number > kucuksayi) {
                kucuksayi=number;

            }
            if (number < buyuksayi) {
                buyuksayi=number;
            }
        }
            System.out.println("En büyük sayı:"+kucuksayi);
            System.out.println("En küçük sayı:"+buyuksayi);

    }
}