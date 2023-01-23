package day02_print_statements;

public class QuotePracticeHomework {

    /*
    Quotations

    Print:
        List of things I will buy soon:
        "Tesla", "Big House\Condo", "80\82 inch TV"
     */

    public static void main(String[] args) {

        System.out.println("List of things I will buy soon: ");
        System.out.print("\"Tesla\""+", ");
        System.out.print("\"Big House\\Condo\""+", ");  // Big house ile condo arasindaki \\ da escape sequence aslinda. The first backslash ( \ ) is used for syntax of escape sequence, the second one is for the backlash as a character
        System.out.print("\"80\\82 inch TV\" ");   // first solution

        System.out.println();  // for empty line
        System.out.println();  // for empty line

        System.out.println("List ot things I will buy soon:\n\"Tesla\", \"Big House\\Condo\", \"80\\82 inch TV\""); //second solution



    }
}
