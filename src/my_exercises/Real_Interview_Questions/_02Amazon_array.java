package my_exercises.Real_Interview_Questions;

public class _02Amazon_array {

    /*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    determine if the input string is valid.

    (([])
    0,1,2,3,4
     */

    /*

    // Sonucu bulamadi, dene

    public boolean charValidation(String s) {
        char[] chars = s.toCharArray();

        boolean result = false;

        for(int i=0; i<chars.length; i++) {
            char c = chars[i];
            if (c != '('  c != '{'  c != '[', c != ')'  c != '}'  c != ']') {
                return result;
            }

            if (c == '(' && chars[chars.length-i+1] == ')') {
                result = true;
            } else {
                return result;
            }

            if (c == '{' && chars[chars.length-i+1] == '}') {
                result = true;
            } else {
                return result;
            }

            if (c == '[' && chars[chars.length-i+1] == ']') {
                result = true;
            } else {
                return result;
            }
        }

        return result;

     */

    }
