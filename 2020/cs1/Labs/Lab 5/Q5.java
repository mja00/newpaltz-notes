class Q5 {

    public static void main(String[] args) {
        
        int[] array = {1,2,3,5,13,21,34,55,89};
        int[] reverseArray = new int[array.length];
        for (int i = array.length; i>0; i--) {
            int reverseIndex = array.length - i;
            reverseArray[reverseIndex] = array[i-1];
        }
        System.out.println(reverseArray[8]);
    }
}