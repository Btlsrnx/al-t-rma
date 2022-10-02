
import java.util.Scanner;
public class kiloHesaplama {
    public static void main(String[] args) {
        double kg,m;
        Scanner btl =new Scanner(System.in);
        System.out.println("Kilonuzu giriniz:");
        kg= btl.nextDouble();
        Scanner str=new Scanner(System.in);
        System.out.println("Boyunuzu giriniz:");
        m= btl.nextDouble();
        double indeks=kg/(m*m);
        System.out.println("vücut kitle indeksiniz:"+indeks);



    }
}
