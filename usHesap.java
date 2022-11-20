import java.util.Scanner;

public class usHesap {
    static int ushesaplama(int a,int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;

        }
        return result;
    }

    public static void main(String[] args) {
        while (true){
            Scanner btl=new Scanner(System.in);
            System.out.println("Taban sayıyı giriniz:");
            int a=btl.nextInt();
            System.out.println("Üs sayıyı giriniz:");
            int b=btl.nextInt();
            System.out.println("SONUÇ:"+ushesaplama(a,b));
        }
    }


}
