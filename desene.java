import java.util.Scanner;

public class desene {
    static int negatif(int a){
        if (a<=0){
            return a;
        }
        else {
            System.out.println(a+" ");
            return negatif(a-5);
        }
    }
    static int pozitif(int a,int y) {
        if (a > y) {
            return a;
        }
        else{
            System.out.println(a+" ");
            return pozitif(a+5,y);
        }

    }

    public static void main(String[] args) {
        while (true){
            Scanner btl=new Scanner(System.in);
            System.out.println("Bir sayı giriniz:");
            int number= btl.nextInt();
            pozitif(negatif(number),number);
            if (number==0){
                break;
            }
            System.out.println("Bitirmek için 0'a basın.");
        }
    }
}


