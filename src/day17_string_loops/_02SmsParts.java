package day17_string_loops;

public class _02SmsParts {

    /*
    [SMS parts] - // it was yesteday's homework, but I did not do it.

    Given a String in the following format:
    Sender: <James Bond>. From Number: [202-123-3456]. + Message: {"I love programming and problem solving"}

    Separate these parts and print them separately:
    Sender: actualSender
    Number: actualNumber
    Message: actualMessage
     */

    public static void main(String[] args) {

        String msg = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {\"I love programming and problem solving\"}";

        int startSender = msg.indexOf('<');
        int endSender = msg.indexOf('>');

        int startNumber = msg.indexOf('[');
        int endNumber = msg.indexOf(']');

        int startMsg = msg.indexOf('{');
        int endMsg = msg.indexOf('}');


        String sender = msg.substring(startSender +1, endSender);  // < isaretini almamak icin +1 yaptik. sonuna da endSender yaptik ki substring'de last character de alinmadigi icin > dahil olmayacak -> bu sayede sadece ismi elde ediyoruz.

        String number = msg.substring(startNumber +1, endNumber);

        String msgPart = msg.substring(startMsg +1, endMsg);

        // Adlandirmalarda -> msg derken message; msgPart derken messagePart anlaminda kullandik


        System.out.println("Sender: " + sender);
        System.out.println("Number: " + number);
        System.out.println("Message: " + msgPart);


        /* print edince console'da;
        Sender: James Bond
        Number: 202-123-3456
        Message: "I love programming and problem solving"

         */


    }
}
