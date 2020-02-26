import java.util.Arrays;

class Q9 {

    public static void main(String[] args) {
        
        int[] a = {12,3,-8,100,-2};
        int[] b = {4,-9,30,2};
        int[] c = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        for (int i = 0; i < c.length; i++) {
            if (i%2==0) {
                c[i] = a[aIndex];
                aIndex++;
            } else {
                c[i] = b[bIndex];
                bIndex++;
            }
        }
        System.out.println(Arrays.toString(c));
    }   
}