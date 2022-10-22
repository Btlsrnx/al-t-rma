import java.util.Scanner;

public class armstrongSayi {
    public static void main(String[] args) {
        System.out.print("Bir sayı giriniz:");
        Scanner input=new Scanner(System.in);
        int number= input.nextInt();
        int tempNumber=number;
        int numberCounter=0;
        int basvalue;
        int result=0;
        int basPow;
        while (tempNumber!=0){
            tempNumber/=10;
            numberCounter++;
        }
        tempNumber=number;
        while (tempNumber!=0){
            basvalue=tempNumber%10;
            basPow=1;
            for (int i=1;i<=numberCounter;i++){
                basPow*=basvalue;
            }
            result+=basPow;
            tempNumber/=10;

        }if (result==number){
            System.out.println(number+" bir armstrong sayıdır.");
        }else{
            System.out.println(number+" bir armstrong sayı değildir!");
        }

    }
}
