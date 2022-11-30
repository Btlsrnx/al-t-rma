public class Main {
    public static void main(String[] args) {
        int[][] matris= {{5,3,3},{6,5,2},{}};
        int[][] transpoz=new int[3][2];


        for (int i=0;i< 3;i++){
            for (int j=0;j<2;j++){
                transpoz[i][j]=matris[j][i];
                System.out.print(" "+transpoz[i][j]);
            }
            System.out.println();
        }

    }
}