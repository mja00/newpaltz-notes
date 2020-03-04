import java.util.Arrays;

class Q10 {

    public static void main(String[] args) {
        
        //System.out.println(Arrays.toString(quadratic(1, 4, 2)));
        //System.out.println(areaOfCircle(4));
        //System.out.println(calculatePi(100000));
        System.out.println(areaOfTriangle(1, 2, 3));
    }

    public static double[] quadratic(int a, int b, int c) {
        int negativeB = -b;
        double totalPositive = (negativeB + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double totalNegative = (negativeB - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double[] values = {totalPositive, totalNegative};
        return values;   
    }

    public static double areaOfCircle(double a) {
        return (Math.PI * Math.pow(a, 2));
    }

    public static double areaOfSquare(double a) {
        return a * a;
    }

    public static double calculatePi(int iterations) {
        int index = 0;
        double fractionShit = 1;
        for (double i = 3.0; index < iterations; i+=2) {
            if (index%2==0) {
                fractionShit -= 1.0/i;
                index++;
            } else {
                fractionShit += 1.0/i;
                index++;
            }
        }
        return 4 * fractionShit;
    }

    public static double areaOfTriangle(double a, double b, double c) {
        if (isTriangle(a, b, c)) {
            double s = (a + b + c ) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
        return 0;
        
    }

    public static boolean isTriangle(double a, double b, double c) { 
        if ((a+b) > c && (b+c) > a && (a+c) > b) {
            return true;
        }

        return false;
    }
}