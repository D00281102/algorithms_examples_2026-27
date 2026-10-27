package Homework.brute_force_week06;

import java.util.Arrays;

public class Q1_Point {
    /**
     * Determines whether two arrays contain the same values
     * regardless of order using a sorted two-pointer approach.
     *
     * @param arr1 first array
     * @param arr2 second array
     * @return true if arrays are equal, otherwise false
     */
    public static boolean EqualTwoPointer(int[] arr1, int[] arr2)
    {
        if(arr1.length != arr2.length)
        {
            return false;
        }

        int[] copy1 = Arrays.copyOf(arr1, arr1.length);
        int[] copy2 = Arrays.copyOf(arr2, arr2.length);

        Arrays.sort(copy1);
        Arrays.sort(copy2);

        int pointer = 0;

        while(pointer < copy1.length)
        {
            if(copy1[pointer] != copy2[pointer])
            {
                return false;
            }

            pointer++;
        }

        return true;
    }
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3};
        int[] b = {3, 2, 1};

        System.out.println(EqualTwoPointer(a, b));
    }
}
