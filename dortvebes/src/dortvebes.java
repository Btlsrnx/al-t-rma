import java.util.Scanner;

public class dortvebes {
    public static void main(String[] args) {
        System.out.print("Sınır sayısı giriniz:");
        int n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        System.out.println("Dört'ün katları:");
        for (int i=1;i<=n;i*=4){
            System.out.println(i);
        }

        System.out.println("Beş'in Katları:");
        for (int i=1;i<=n;i*=5){
            System.out.println(i);
        }
    }
}
