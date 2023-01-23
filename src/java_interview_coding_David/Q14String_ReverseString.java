package java_interview_coding_David;

public class Q14String_ReverseString {

    /*
    Q14: Write a return method that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {
        System.out.println(reverseString("ABCD"));   // DCBA
    }


        public static String reverseString(String str){   // ABCD

            String reversed = "";

            for(int i = str.length() -1; i >= 0; i--){   // for loop -> starting from the end of the String ; i-- decrement
                reversed += str.charAt(i);
            }
            return reversed;
        }
    }

    // You can also use Collections.reverse method

    /*
    // David's solution:

     String str5 = scan.next();
        String dummy5 = "";
        for (int i = str5.length() - 1; i >= 0; i--) {
            dummy5 += str5.charAt(i);
        }
        System.out.println("String reversed-> "+ dummy5);
     */
















    // Kizlar -> 2.yol olarak -> Collections List ile calistigi icin list'e cevirdi -> Merve'nin for each loop da []'i String'e cevirmek icin.