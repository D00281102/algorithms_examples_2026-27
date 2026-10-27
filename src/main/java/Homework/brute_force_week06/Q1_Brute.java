package Homework.brute_force_week06;

public class Q1_Brute {
    /**
     * Determines whether two integer arrays contain the same values
     * regardless of order using a brute force approach.
     *
     * @param array1 the first array to compare
     * @param array2 the second array to compare
     * @return true if both arrays contain the same values,
     *         otherwise false
     */
    public static boolean equalarrays(int[] array1, int[] array2)
    {
        if(array1.length != array2.length)
        {
            return false;
        }
        boolean[] matched = new boolean[array2.length];

        for (int i = 0; i < array1.length; i++)
        {
            boolean found = false;

            for (int j = 0; j < array2.length; j++)
            {
                if (array1[i] == array2[j] && !matched[j])
                {
                    matched[j] = true;
                    found = true;
                    break;
                }

            }
            if(!found)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3};
        int[] b = {3, 2, 4};

        System.out.println(equalarrays(a, b));
    }
}

