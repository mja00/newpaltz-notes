import java.util.Arrays;

class Q11 {

    public static void main(String[] args) {
        
        int[] a = {12, 4, 3, -9, -8, 30, 100, 2, -2};
        int maxVal = 0;
        int maxIndex = 0;
        for ( int i = 0; i < a.length; i++) {
            if (a[i] > maxVal) {
                maxVal = a[i];
                maxIndex = i;
            }
        }
        System.out.println("The max value of the array is "+maxVal+" at index location: "+maxIndex);
    }
}