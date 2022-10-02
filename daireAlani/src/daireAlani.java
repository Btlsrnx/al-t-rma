  import java.util.Scanner;
      public class daireAlani {
      public static void main(String[] args) {
          int r;
          double pi=3.14,𝛼;

          System.out.print("Yarı çapı giriniz:");
          Scanner btl=new Scanner(System.in);
          r= btl.nextInt();
          System.out.println("yarıçap:"+r);

          System.out.print("merkezi  açıyı giriniz :");
          Scanner str=new Scanner(System.in);
          𝛼= str.nextDouble();
          System.out.println("merkezi açı:"+𝛼);

          double alan=(pi * (r*r) * 𝛼) / 360;
          System.out.println("Alan :"+alan);


      }

}
