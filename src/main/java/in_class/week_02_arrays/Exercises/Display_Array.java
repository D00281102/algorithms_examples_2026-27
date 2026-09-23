package in_class.week_02_arrays.Exercises;

/**
 * Displays all elements of an integer array along with their index positions.
 *
 * @param arr the integer array whose elements will be printed
 */
public class Display_Array {

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        displayArray(numbers);
    }
}
