import java.util.Arrays;

class Q3 {

    public static void main(String[] args) {
        
        double[] a = new double[10];
        for (int i = 0;i<a.length;i++) {
            a[i] = getRandomDoubleInRange(0, 100);
        }
        System.out.println(getAverageOfArray(a));
        //System.out.println(Arrays.toString(a));
    }

    public static int getRandomIntInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Max must be greated than min");
        }

        return (int)(Math.random() * ((max-min) + 1)) + min;
    }

    public static double getRandomDoubleInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Max must be greated than min");
        }

        return (double)(Math.random() * ((max-min) + 1)) + min;
    }

    public static double getAverageOfArray(double[] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum/(double)a.length;
    }
}