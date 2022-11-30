
public class ArrayFrequancy {
    public static void main(String[] args) {
        int[] series={2,3,3,3,3,4,5,8,9};
        int[] repeaterSeries= {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        boolean isAvailable=true; int count=0;
        for (int i=0; i<series.length;i++){
            isAvailable=true;
            for (int j=0;j<series.length;j++){
                if (series[i]==repeaterSeries[j]){
                   isAvailable=false;
                }
            }

            if (isAvailable){
                for (int a=0;a<series.length;a++){
                    if (series[i]==series[a]){
                        count++;
                       repeaterSeries[i]=series[i];
                    }
                }
                System.out.println(count+" defa tekrar etti");
                count=0;
            }



        }

    }}



