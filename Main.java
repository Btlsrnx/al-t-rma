import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("DİZİNİN ELEMAN SAYISINI GİRİNİZ:");
        n=input.nextInt();
        int btl=1;
        int[] number=new int[n];
        for (int i=0;i<number.length;i++){
            System.out.print((i + 1) + ". Elemanı : ");
            number[i] = input.nextInt();
        }
        Arrays.sort(number);

        System.out.print("Sıralama : " );
        for(int i : number) {
            System.out.print(i + " ");
    }

}
}