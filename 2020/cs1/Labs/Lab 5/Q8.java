import java.util.Arrays;

class Q8 {
    public static void main(String[] args) {
        int[] a = {56,9,17,6,2,0,1,199,256,94};
        int evenNumbers = getEvenCount(a);
        int[] evenNumbersArray = new int[evenNumbers];
        int evenNumbersArrayIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0) {
                evenNumbersArray[evenNumbersArrayIndex] = a[i];
                evenNumbersArrayIndex++;
            }
        }
        System.out.println(Arrays.toString(evenNumbersArray));

        int oddNumbers = getOddCount(a);
        int[] oddNumbersArray = new int[oddNumbers];
        int oddNumbersArrayIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==1) {
                oddNumbersArray[oddNumbersArrayIndex] = a[i];
                oddNumbersArrayIndex++;
            }
        }
        System.out.println(Arrays.toString(oddNumbersArray));
    }
    
    public static int getEvenCount(int array[]) {
        int _evenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0) {
                _evenNumbers++;
            }
        }
        return _evenNumbers;
    }

    public static int getOddCount(int array[]) {
        int _oddNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==1) {
                _oddNumbers++;
            }
        }
        return _oddNumbers;
    }
}