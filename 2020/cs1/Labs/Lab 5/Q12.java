import java.util.Arrays;

class Q12 {

    public static void main(String[] args) {
        
        int evenNumbers = 0;
        int divisible37 = 0;
        int divisible58 = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i%2==00) {
                evenNumbers++;
            }
            if (i%3==0 && i%7==0) {
                divisible37++;
            }
            if (i%5==0 || i%8==0) {
                divisible58++;
            }
        }
        int[] a = {evenNumbers, divisible37, divisible58};
        System.out.println(Arrays.toString(a));

    }
}