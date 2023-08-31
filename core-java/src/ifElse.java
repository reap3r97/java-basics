public class ifElse {
    public static void main(String[] args) {
        int[] numArray = { 4, 9, 3, 2, 5, 7, 10, 8, 1, 6 };

        // checking multiples and non-multiples of 2 in array
        for (int n : numArray) {
            if (n % 2 == 0) {
                System.out.println("Value multiple of 2 is " + n);
            }
            else{
                System.out.println("Value not multiple of 2 is " + n);
            }
        }
    }
}