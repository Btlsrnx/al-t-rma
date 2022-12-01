import java.util.Scanner;

public class fibonacci {
 public static void main(String[] args) {
     int b = 0, s= 1, m, h;
     Scanner input= new Scanner(System.in);
     System.out.print("Fibonacci serisinin eleman sayisini yaziniz: ");
     h = input.nextInt();
     System.out.print(b+", "+s);
     for (int i = 2; i <= h; i++) {
         m = b+s;
         System.out.print(", "+m);
         b= s;
         s = m;
         System.out.print(" ");
 }
}
}