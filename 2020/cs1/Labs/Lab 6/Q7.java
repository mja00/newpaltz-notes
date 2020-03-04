class Q7 {

    public static void main(String[] args) {
        
        double[] test = {12.3, 353.3, 45.3, 4.5, 7.2, 9.5};
        System.out.println(minimumDoubleInArray(test));
        System.out.println(indexOfMinimumDouble(test));
    }

    public static double minimumDoubleInArray(double[] array) {
        double _lowestValue = array[0];
        for (int i = 0; i < array.length; i++) { 
            if (array[i] < _lowestValue) {
                _lowestValue = array[i];
            }
        }
        return _lowestValue;
    }

    public static int indexOfMinimumDouble(double[] array) {
        int indexValue = 0;
        double lowestValue = minimumDoubleInArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == lowestValue) {
                indexValue = i;
                break;
            }
        } 
        return indexValue;
    }
}