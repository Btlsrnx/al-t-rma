
public class ff {
    public static void main(String[] args) {

        for (int i = 2; i <= 97; i++) {
            boolean asal = true;
            for (int b = 2; b < i; b++) {
                if (i % b == 0) {

                    asal = false;
                    break;
                    }

                }
            if (asal) {
                System.out.print(" "+i);
            }

            }

        }
    }

