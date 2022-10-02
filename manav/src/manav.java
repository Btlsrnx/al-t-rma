

import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        double kilo1,kilo2,kilo3,kilo4,kilo5;

        System.out.print("Kaç kilo armut aldınız ? : ");
        Scanner btl =new Scanner(System.in);
        kilo1= btl.nextDouble();

        Scanner str=new Scanner(System.in);
        System.out.print("Kaç kilo elma aldınız ? : ");
        kilo2= btl.nextDouble();

        Scanner ctr=new Scanner(System.in);
        System.out.print("Kaç kilo domates aldınız ? :");
        kilo3= btl.nextDouble();

        Scanner ktr=new Scanner(System.in);
        System.out.print("Kaç kilo muz aldınız ? :");
        kilo4= btl.nextDouble();

        Scanner ftr=new Scanner(System.in);
        System.out.print("Kaç kilo patlıcan aldınız ? :");
        kilo5= btl.nextDouble();

        double tutar=(kilo1*armut)+(kilo2*elma)+(kilo3*domates)+(kilo4*muz)+(kilo5*patlican);
        System.out.println("Toplam Borcunuz : "+tutar);












    }

}
