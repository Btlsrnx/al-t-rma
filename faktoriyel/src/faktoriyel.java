import java.util.Scanner;

public class faktoriyel{
    public static void main(String[] args) {
        int n, r;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz n:");
        n = input.nextInt();
        System.out.print("Seçim sayısı r:");
        r = input.nextInt();
        int totaln = 1,totalr=1,totalnr=1;


        for (int i = 1; i <= n; i++) {
            totaln = totaln * i;
        }
        for (int i = 1; i <= r; i++) {
            totalr = totalr * i;
        }
        for (int i = 1; i <= (n - r); i++) {
            totalnr = totalnr * i;
        }

        System.out.println("Kombinasyon: C(" + n + "," + r + ") = " + (totaln / (totalr * totalnr)));
    }

}
