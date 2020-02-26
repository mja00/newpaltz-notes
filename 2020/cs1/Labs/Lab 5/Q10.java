import java.util.Arrays;

class Q10 {

    public static void main(String[] args) {
        
        int[] a = new int[10];
        int lastDigit = 1;
        int lastLastDigit = 0;
        for (int i = 0; i < a.length; i++) {
            int insertDigit = lastDigit + lastLastDigit;
            a[i] = insertDigit;
            lastLastDigit = lastDigit;
            lastDigit = insertDigit;
        }
        System.out.println(Arrays.toString(a));
    }
}