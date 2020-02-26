class Q3 {

    public static void main(String[] args) {
        
        int[] array = {1,2,3,5,13,21,34,55,89};
        int divisible = 0;
        for(int i=0;i<array.length;i++) {
            int test = array[i];
            if (test%3==0) {
                divisible++;
            }
        }
        System.out.println(divisible);
    }
}