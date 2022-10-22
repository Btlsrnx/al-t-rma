import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args) {
        int n,r;
        Scanner input=new Scanner(System.in);
        System.out.print("Üssü alınacak sayı:");
        n=input.nextInt();
        System.out.print("Üs olacak sayı:");
        r=input.nextInt();
        int total=1;
        for (int i=1;i<=r;i++){
           total*=n;
        }
        System.out.println("Cevap:"+total);
    }
}
