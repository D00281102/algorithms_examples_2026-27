package in_class.week06_two_pointer.ArrayUtils;


public class StringUtils {
    public static String longestSection(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Cant calculate");
        }

        if (text.isEmpty()) {
            return " ";
        }
        int start = 0;
        int end = 1;
        int longestStartPos = 0;
        int longestEndPos= 0;
        int longestSubstring = 0;

        while (end < text.length()) {
            for (int i = start; i < end; i++) {
                if (text.charAt(end) == text.charAt(start)) {
                    int currentLength = end - start;
                    if (currentLength > longestSubstring) {
                        longestStartPos = start;
                        longestEndPos = end;
                        longestSubstring = currentLength;
                    }
                    start = i + 1;

                    break;
                }
            }
            end++;
        }
        if(start == 0){
            return text;
        }
        return text.substring(longestEndPos, longestStartPos);
    }
}