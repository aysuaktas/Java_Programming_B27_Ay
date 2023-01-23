package replit_aysu._3_String;

import java.util.Scanner;

public class _42_Alejandro {

    /*
    Alejandro has many emails, but only has time to read a few of them. Help him sort his inbox by checking the given email variable for his name and for the word 'project'. Use the following requirements to help Alejandro:
        If the email has his name and the word 'project' print: priority
        If the email has only his name, but not the word 'project' print: read
        If the email does not have his name print: don't read

    Note: Case sensitivity for his name doesn't matter, we always want to read the email if his name is there, but there is no difference between the uppercase or lowercase letter. This must be handling by your filtering.
     */

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner s = new Scanner(System.in);
        String email = s.nextLine();

        //WRITE YOUR CODE BELOW

        String name = "alejandro";
        String project = "project";

        // boolean olusturmayi baskasinin kodundan aldim;

        boolean hasName = email.toLowerCase().contains(name);
        boolean hasProject = email.toLowerCase().contains(project);
        // Bunlarda lowercase methodu yazip altta everything'i lowercase yazdigimiz icin case sensitivity yok, case sensitivity'i boyle kaldirmis olduk. //with using lowercase method and using lowercase everywhere in below, we eliminate the case sensitivity

        if (!hasName) {
            System.out.println("don't read");
        } else if (hasName && !hasProject) {
            System.out.println("read");
        } else if (hasName && hasProject){
            System.out.println("priority");
        }



    }
}
