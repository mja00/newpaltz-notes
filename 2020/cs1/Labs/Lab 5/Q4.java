class Q4 {

    public static void main(String[] args) {
        
        int[] array = {1,2,3,5,13,21,34,55,89};
        int[] newArray = new int[array.length];
        for (int i=0;i<array.length;i++) {
            newArray[i] = array[i];
        }
        System.out.println(newArray[8]);
    }
}