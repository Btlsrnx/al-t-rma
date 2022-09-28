import java.util.Scanner;
public class taksiMetre1 {
    public static void main(String[] args) {
     double km=2.2;
     Scanner btl=new Scanner(System.in);
        System.out.println("Mesafe ne kadar?");
        int mesafe=btl.nextInt();
      double tutar=10+(km*mesafe);

        tutar=(tutar<20)?20: tutar;
        System.out.println("tutar "+ tutar);
    }
}
