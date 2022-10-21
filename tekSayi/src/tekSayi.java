import java.util.Scanner;

public class tekSayi{
    public static void main(String[] args) {
        int n,total=0;
        Scanner input=new Scanner(System.in);
       do {
           System.out.print("Sayı Giriniz:");
           n=input.nextInt();
           if (n%4==0) {
               total += n;
           }
           }while (n>0);
           System.out.println("Toplam:"+total);
           {

        }

    }



}
