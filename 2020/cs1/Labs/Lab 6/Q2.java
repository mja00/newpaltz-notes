class Q2 {

    public static void main(String[] args) {
        
        char randomLetter = 'A';
        randomLetter = (char)getRandomNumberInRange(65, 90);
        System.out.println(randomLetter);
    }

    public static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Max must be greated than min");
        }

        return (int)(Math.random() * ((max-min) + 1)) + min;
    }
}