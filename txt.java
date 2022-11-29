
import java.util.Arrays;
import java.util.Scanner;

public class txt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int[] numbers = {5, 6, 9, 78};
        Arrays.sort(numbers);
        int min = numbers[0];
        int max = numbers[0];
        System.out.println(Arrays.toString(numbers));
        for (int i : numbers) {
            if (input>i)
                min = i ;
            else if (input==i){}
            else {
                max = i;
                break;
            }
        }
        System.out.println("EN YAKIN SAYI MİNİMUMA :"+min);
        System.out.println("EN YAKIN SAYI MAKSİMUMA:"+max);

          }
}


