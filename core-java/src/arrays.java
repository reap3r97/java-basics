public class arrays {
    public static void main(String[] args) {
        int[] numArray1 = new int[5];
        numArray1[0] = 1;
        numArray1[1] = 2;
        numArray1[2] = 3;
        numArray1[3] = 4;
        numArray1[4] = 5;

        int[] numArray2 = { 3, 5, 7, 9 };

        System.out.println("First value of array 1: " + numArray1[0]);
        System.out.println("First value of array 2: " + numArray2[0]);

        // for loop
        for (int i = 0; i < numArray1.length; i++) {
            System.out.println("Value at index " + i + ": " + numArray1[i]);
        }

        for (int j = numArray2.length - 1; j >= 0; j--) {
            System.out.println("Value at index " + j + ": " + numArray2[j]);
        }

        String[] names = { "Hamza", "Ali", "Khan", "Niazi" };

        for (int z = 0; z < names.length; z++) {
            System.out.println(names[z]);
        }
    }
}