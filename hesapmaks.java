import java.util.Scanner;

public class hesapmaks {
    static int top(int a,int b){
        int result=a+b;
        System.out.println("Toplam:"+result);
        return result;
    }
    static int eksi(int a,int b){
        int result=a-b;
        System.out.println("Çıkarma:"+result);
        return result;
    }
    static  int carp(int a,int b){
        int result=a*b;
        System.out.println("Çarpma:"+result);
        return result;
    }
    static int bol(int a,int b){
        if (b==0){
            return 0;
        }
        int result=a/b;
        System.out.println("Bölme:"+result);
        return result;
    }
    static int uslu(int a,int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;

        }
        return result;
    }
     static void factoriel(){
        Scanner scan=new Scanner(System.in);
         System.out.println("Bir sayı giriniz:");
         int n=scan.nextInt();
         int result=1;
         for (int i=1;i<=n;i++){
             result *=i;
         }
         System.out.println("Faktöriyel: " + result);
     }
     static int mod(int a,int b){
        int result=a%b;
         System.out.println("Mod işlemi:"+result);
         return result;
     }
     static void dik(int a,int b) {
         System.out.println("Çevre:" + 2 * (a + b));
         System.out.println("Alan:" + (a * b));
     }
    public static void main(String[] args) {
        Scanner btl=new Scanner(System.in);
        int select;
        String menu="1-Toplama işlemi\n"
                +"2-Çıkarma işlemi\n"
                +"3-Çarpma işlemi\n"
                +"4-Bölme işlemi\n"
                +"5-Üslü sayı hesaplama\n"
                +"6-Faktoriyel Hesaplama\n"
                +"7-Mod Alma\n"
                +"8-Dikdörtgen Alan ve Çevre Hesabı\n"
                +"0-Çıkış yap";

           while (true){

               System.out.println(menu);
               System.out.print("Bir işlem seçiniz:");
               select= btl.nextInt();
               System.out.println("1.sayıyı giriniz:");
               int a= btl.nextInt();
               System.out.println("2.sayıyı giriniz:");
               int b= btl.nextInt();

               if (select==0){
                   break;
               }

               switch (select){
                   case 1:
                       top(a,b);
                       break;
                   case 2:
                       eksi(a,b);
                       break;
                   case 3:
                       carp(a,b);
                       break;
                   case 4:
                       if (bol(a,b)==0){
                           System.out.println("2.sayı 0'dan büyük olmalı!");
                       }
                       break;
                   case 5:
                       System.out.println("Üslü sayı hesabı"+uslu(a,b));
                       break;
                   case 6:
                       factoriel();
                       break;
                   case 7:
                       mod(a,b);
                       break;
                   case 8:
                       dik(a,b);
                       break;
                   default:
                       System.out.println("Geçersiz bir işlem girdiniz!");




               }
        }
        System.out.println("BYE :)");
    }
}
