class Q5 {

    public static void main(String[] args) {
        System.out.println(computerRandomShit(3));
    }

    public static int computerRandomShit(int n) {
        int sum = 0;
        for (int i = 0; i < n;i++) {
            sum += n - i;
        }
        return sum;
    }
}