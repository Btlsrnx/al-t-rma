import java.util.Scanner;

public class artikYili {
    public static void main(String[] args) {
        int dogumyiliniz;

        System.out.print("Doğum yılınızı giriniz:");
        Scanner btl =new Scanner(System.in);
        dogumyiliniz= btl.nextInt();
        int srn=(dogumyiliniz%400);

        switch(srn){
            case 0:
                System.out.println("Doğum yılınız artık yıldır.");
                break;
             default:
                 System.out.println("Doğum yılınız artık yıl değildir!!");
        }

    }
}
