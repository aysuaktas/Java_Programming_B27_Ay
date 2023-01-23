package practices_group_15;

public class _27DailyQuestionExceptions {

    /*
    What is the difference between checked exceptions and unchecked exception? Please give some examples of both of them.
     */


    /*
    Exceptions are unwanted/unexpected events about code-related issue, and we can handle them. There are 2 kinds of exceptions:

    1- Checked exception -> it is also known as "compile time" exception. To be able to compile it, we need to handle it "before" running, if they are checked exceptions.

              Examples for checked exception:
                  - InterruptedException, ClassNotFoundException, SQLException, IOException, InstantiationException, FileNotFoundException

      For example:

        public static void main(String[] args) {
             Thread.sleep(3000);
         }

              This is -> InterruptedException. We can handle this if we write "throws InterruptedException" at the end of main method like:
        public static void main(String[] args) throws InterruptedException {
            Thread.sleep(3000);
         }

    2- Unchecked exception -> it is also known as "runtime" exception. These are the exceptions that are not checked at compile time. So, the code will compile even we do not handle them.

              The most common examples for unchecked exception:
                  - NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException

                -> for ex, in ArithmeticException one, there is no a syntax problem when we say 4/0. So, code will compile. However, after that, there will be an ArithmeticException on runtime (after we run it) due to math issue.

    For example:

        String sentence = "hello best team ever";
        System.out.println(sentence.charAt(150));

            This is -> StringIndexOutOfBoundsException as an unchecked exception.

     */





}
