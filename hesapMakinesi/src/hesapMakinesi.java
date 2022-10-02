
import java.util.Scanner;
public  class hesapMakinesi {
    public static void main(String[] args) {
        int a, b, select;

        Scanner btl = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz:");
        a = btl.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        b = btl.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz:");
        select=btl.nextInt();

              switch (select){
                case 1 :
                    System.out.println("Toplama işlemi :"+ (a+b));
                    break;

                case 2 :
                    System.out.println("Çıkarma işlemi :"+ (a-b));
                    break;

                  case 3 :
                      System.out.println("Çarpma işlemi:"+(a*b));
                      break;

                  case 4 :
                      if (b != 0) {
                          System.out.println("Bölme işlemi" + (a / b));
                          break;
                      }else{
                          System.out.println("Bir sayı 0'a bölünemez!");
                      }
                      break;
                  default:
                      System.out.println("Lütfen 1 ila 4 arasında seçim yapınız.");

    }   }
}
