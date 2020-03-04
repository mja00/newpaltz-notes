import java.util.Arrays;

class Q1 {

    public static void main(String[] args) {
        
        char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] reverseArray = reverseArray(c);
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(reverseArray));
    }

    public static char[] reverseArray(char[] c) {
        char[] _tempReverse = new char[c.length];
        for (int i = c.length; i>0; i--) {
            int reverseIndex = c.length - i;
            _tempReverse[reverseIndex] = c[i-1];
        }
        return _tempReverse;
    }
}