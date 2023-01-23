package practices_group_15;

public class IfReview_19 {

    public static String name;

    static{
        name = "heyo";
    }

    public static void main(String[] args) {

        IfReview_19 ifReview = new IfReview_19();
        ifReview.name = "yoyo";

        IfReview_19 newIfReview = new IfReview_19();
        newIfReview.name = "nono";

        newIfReview.name = "nono";
        IfReview_19 lastIfReview = new IfReview_19();
        System.out.println(lastIfReview.name);

    }
}

    // Zeynep's explanation:
    // "Output of the code: "nono" --> Reason: name is a static variable and has same value for every object. Static variables can be re-assigned. Even it looked like we re-assigned for another object, it actual reassigned for all of them that's why it will be "nono" for all the objects."


    // Merve's explanation: ---> "Because name is a static variable so there is a just single copy of this variable. When we change/reassign a static variable, all the other instances will see the effect of the change."

    /* The answer is : nono
       As everyone explained crystal clear its reason, we can understand it based on the information that static variable accessed by the class and has only a single copy; after we reassigned it, it will be 'nono' anymore, until we change it.
     */

    /* David's explanation:

    Answer is "nono". Static belongs to the class. Therefore


     */







