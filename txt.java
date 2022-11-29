public class txt {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        int sum=0;
        for(int i : numbers) {
            sum += (1.0 / i );
        }
        double harmonicAverage = numbers.length / sum;
        System.out.println("Harmonik Ortalama = " + harmonicAverage);
    }
}
