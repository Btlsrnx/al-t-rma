import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        int n1, n2;
        System.out.print("Lütfen birinci sayı giriniz:");
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz:");
        n2 = input.nextInt();
        int ebob = 1;
        int ekok=1;
        int i = 1,k=1;
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;

            }
            i++;
        }
        System.out.println("Ebob:"+ebob);
        while (k<=(n1*n2)){
            if (n1 % k == 0 && n2 % k ==0 ){
                ekok=i;

            }
            k++;
        }
        System.out.println("Ekok:"+(n1*n2)/ebob);
           }
       }

