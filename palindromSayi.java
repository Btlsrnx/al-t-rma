public class palindromSayi {
    static boolean ispalindromsayi(int rakam) {
            int degisken =rakam,sayiters=0,sayison;
            while (degisken!=0) {
                sayison= degisken%10;
                sayiters=(sayiters*10)+sayison;
                degisken/=10;


            }
            if (rakam==sayiters)
                return true;
            else
                return false;
        }

    public static void main(String[] args) {
        System.out.println(ispalindromsayi(363));
    }
        }


