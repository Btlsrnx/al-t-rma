import java.util.Scanner;

public class yildizlaTers {
    public static void main(String[] args) {
        int n;
        System.out.print("Bir basamak sayısı giriniz:");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for (int i=1;i<=n;i++){

            for(int k=1;k<=(n+i);k++) {
                System.out.print(" ");
            }
            for (int m=1;m<=((n-i)*2)-1;m++) {
                System.out.print("*");
            }
            System.out.println(" ");
            }
        }
    }

