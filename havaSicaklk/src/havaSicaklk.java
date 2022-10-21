import java.util.Scanner;

public class havaSicaklk {
    public static void main(String[] args) {
        int heat;
        System.out.print("Hava sıcakllığı Giriniz:");
        Scanner input = new Scanner(System.in);
        heat = input.nextInt();
        if (heat < 5) {
            System.out.print("Kayağa git yada hava buz gibi evinde otur.");
        }  else if (heat>=5&&heat<=25){
            if (heat<=15) {
                System.out.println("Sinemaya git ama güzel film yok bu aralar.");

            } if (heat<15) {
                System.out.print("pikniğe git,Hava güzel.");
            }}if (heat>25){
            System.out.println("Yüzmeye git.");
        }

        }
    }

