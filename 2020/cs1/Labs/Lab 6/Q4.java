import java.util.Arrays;

class Q4 {

    public static void main(String[] args) {
        
        int[] randomInts = new int[getRandomIntInRange(20, 50)];
        randomInts = fillArrayWithRandomInts(randomInts, -150, 150);
        displayIntArrayInGrid(randomInts);

    }

    public static int getRandomIntInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Max must be greated than min");
        }

        return (int)(Math.random() * ((max-min) + 1)) + min;
    }

    public static int[] fillArrayWithRandomInts(int[] array, int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Max must be greated than min");
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomIntInRange(min, max);
        }
        return array;
    }

    public static void displayIntArrayInGrid(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i%10==0) {
                System.out.println("");
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}