import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        int n, toplam=0;
        System.out.print("Bir sayı giriniz:");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int i = 1;
        while (i < n) {
            if (n % i == 0) {
                toplam += i;

            }
            i++;
        }
        if (toplam == n) {
            System.out.println("Mükemmel sayıdır.");
        }else{
                System.out.println("Mükemmel sayı değildir!");


            }
        }
    }

