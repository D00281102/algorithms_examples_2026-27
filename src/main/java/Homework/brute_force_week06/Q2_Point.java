package Homework.brute_force_week06;

public class Q2_Point {
    /**
     * Determines whether a String is a palindrome using
     * the two-pointer approach.
     *
     * Spaces, punctuation and character case are ignored.
     *
     * @param text the String to check
     * @return true if the String is a palindrome,
     *         otherwise false
     */
    public static boolean palindromeTwoPointer(String text)
    {
        int left = 0;
        int right = text.length() - 1;

        while(left < right)
        {
            char leftChar = Character.toLowerCase(text.charAt(left));
            char rightChar = Character.toLowerCase(text.charAt(right));

            if(!Character.isLetterOrDigit(leftChar))
            {
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(rightChar))
            {
                right--;
                continue;
            }

            if(leftChar != rightChar)
            {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(
                palindromeTwoPointer(
                        "A man, a plan, a canal: Panama"));

        System.out.println(
                palindromeTwoPointer(
                        "hello"));
    }
}
