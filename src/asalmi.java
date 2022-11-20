import java.util.Scanner;

public class asalmi {
   static boolean asalMi(int number){
       int sayac=0;
       for (int i=2;i<number;i++){
           if(number%i==0){
               sayac++;
           }
       }
       if (sayac==0){
           System.out.println("Asal sayıdır.");
           return true;
       }else{
           System.out.println("Asal değildir.");
           return false;
       }
   }

    public static void main(String[] args) {
            while (true){
            Scanner btl=new Scanner(System.in);
            System.out.println("Sayı giriniz:");
            int number= btl.nextInt();
            asalMi(number);


        }
    }
}

