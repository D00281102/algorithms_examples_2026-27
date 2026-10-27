package Homework.brute_force_week06;

public class Q2_Brute {
    /**
     * Determines whether a string is a palindrome
     * using a brute force approach.
     *
     * @param text the supplied string
     * @return true if the string is a palindrome,
     *         otherwise false
     */
    public static boolean PalindromeBruteForce(String text)
    {
        String cleaned = "";

        for(int i = 0; i < text.length(); i++)
        {
            char current = text.charAt(i);

            if(Character.isLetterOrDigit(current))
            {
                cleaned += Character.toLowerCase(current);
            }
        }

        String reversed = "";

        for(int i = cleaned.length() - 1; i >= 0; i--)
        {
            reversed += cleaned.charAt(i);
        }

        for(int i = 0; i < cleaned.length(); i++)
        {
            if(cleaned.charAt(i) != reversed.charAt(i))
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(
                PalindromeBruteForce(
                        "A man, a plan, a canal: Panama"));

        System.out.println(
                PalindromeBruteForce(
                        "hello"));
    }
}
