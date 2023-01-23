package practices_group_15;

public class _20DailyQuestionAccessModifiers {

    /*

    - What are the access modifiers? Which one is the most free one and which one is the most restricted one?

    - You have created a default instance variable. You create an object of that class under a different package inside a class(no inheritance). Can you initialize that variable in that class?

     */



    /*
    Access modifiers is a concept to define the visibility / scope. Visibility means that can we call/access that information or not.

    If we list from the most free/visible/accessible one from the most restricted one, our list would be like:
    public -> protected -> default -> private.

    Public is the most free one because public we can access from the whole project. Private is the most restrictive one, it is only accessible from that class. If we want to call it from another class, we need to use getters & setters.

    The answer about the default variable is no, because default variables are accessible in the same package, so we cannot access and initialize that variable if it is in a class which is outside that package.
     */

    /*
    David's explanation:
        From the most free one to the most restricted one, they are public, protected, default, and private.

        No, I cannot initialize a default instance variable in a separate package. Even if inheritance exists, default access modifier does not allow an access from outside the package.
     */



}
