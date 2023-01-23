package java_interview_coding_David;

public class Q8ArmstrongNumbers {

   /*
    Write a method that can check if a number is Armstrong number
   */

    /* An Armstrong number is a positive m-digit number that is equal to the sum of the m.th powers of their digits.
     For ex:
        - if I have 4-digit number, I need to find the fourth power of each digit, and I need the sum of them. If their total is equal to the original number, it is Armstrong number.

        153:
            1*1*1 = 1
            5*5*5 = 125
            3*3*3 = 27
                125+27+1 = 153
     */


    public static void main(String[] args) {

        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(2));
        System.out.println(isArmstrongNumber(124));
    }

    public static boolean isArmstrongNumber(int num) {   // 153

        int digit = 0;
        int original = num;
        int changedNum = num;
        int result = 0;

        while (num > 0) {     // to find digit number  -> continue as long as num > 0
            num = num / 10;  // dividing by ten --> 153/10= 15    -->   15/10= 1 (( still > 0 ))   -->    1/10= 0.1 so -> 0 -> stops here
            digit++;  // 3-digits
        }

        while (changedNum != 0) {   // stops when changedNum == 0
            int remainder = changedNum % 10;   // 153 % 10= 3   -->   15 % 10= 5    -->  1
            result = result + (int) (Math.pow(remainder, digit));  // --> ((((( with pow() method -> (public static double pow)  & parameters should be (double, double) -> so, casting)))))  --> 3*3*3 = 27 + 5*5*5=125 -> 152 + 1*1*1= 1 --> So, result = 153
            changedNum = changedNum / 10;  // loop --> 153 -> 15 -> 1
        }

        if (original == result) {
            System.out.println(original + " is an Armstrong Number!");
            return true;
        } else {
            System.out.println(original + " is NOT an Armstrong Number!");
            return false;
        }
    }
}

    /*  // David's answer:

    public static boolean armStrongNumber(int num) {
        int a = 0, sum = 0, c = num;

        while (num > 0) {
            a = num % 10;      //  3  7  1      2nd iteration   3 7

            num /= 10;     // 37

            sum = sum + (a * a * a);
        }

        if (c == sum) {
            return true;
        }
        return false;
    }

//Armstrong Number
        int numberToCheck = 371;
        String number = String.valueOf(numberToCheck);
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = Integer.parseInt("" + number.charAt(i));
            sum += Math.pow(digit, number.length());
        }
        System.out.println(number.equals("" + sum) ? "It is Armstrong number" : "It is not Armstrong number");

     */




/*
    // Zeynep's solution:

    public static void armstrongNumbers(int number) {

        int digit = 0;
        int original = number;
        int change = number;
        int result = 0;

        while (number >= 1) { // basamak sayisini bulmak icin -> (( ilk while loop ile kac digit oldugunu bulduk))
            number = number / 10;
            digit++;
        }

        while (change != 0) {
            int remainder = change % 10;
            result = result + (int) (Math.pow(remainder, digit));  // --> ((((( with pow() method -> (public static double pow)  & parameters should be (double, double) -> so, casting)))))
            change = change / 10;
        }

        if (original == result) {
            System.out.println(original + " is an Armstrong Number.");
        } else {
            System.out.println(original + " is not an Armstrong Number.");
        }
    }

    public static void main(String[] args) {
        armstrongNumbers(153);
        armstrongNumbers(2);
        armstrongNumbers(124);
    }
    }
 */






/*
// Adam's solution::

 /*
     Write a method that can check if a number is Armstrong number

			Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.

			Armstrong numbers are     === 153 370 371 407 === for 3 digits


 */

/*
    public static void main(String[] args) {
        boolean isArmstrongNumber = isArmstrong(153);
        System.out.println("isArmstrongNumber = " + isArmstrongNumber);  // isArmstrongNumber = true

    }

    public static boolean isArmstrong(int number) {
        // you can convert number to String, and you can get the numbers with split, and
        // you can use wrapper classes

        // last digit
        int lastDigit = number % 10;  // 153 % 10 = 3
        // System.out.println(lastDigit);   // 3


        // second digit
        int result = number / 10;   // number will be 15 --> result + 153 / 10 = 15
        int secondDigit = result % 10;  // 15 % 10 = 5
        // System.out.println("secondDigit = " + secondDigit);  // secondDigit = 5

        // third digit
        int thirdDigit = number / 100;  // 153 / 100 = 1


        int total = (lastDigit * lastDigit * lastDigit) + (secondDigit * secondDigit * secondDigit) + (thirdDigit * thirdDigit * thirdDigit);


        total = (int) (Math.pow(lastDigit, 3) + Math.pow(secondDigit, 3) + Math.pow(thirdDigit, 3));


        if (total == number) {
            return true;
        } else {
            return false;
        }
    }
}
 */



// Merve -> c'de degerimizi tutmak istiyoruz cunku kaybolacak:

    /*  // Merve's solution: (( assuming it is a 3 digit number)):

    public static boolean isArmstrongNumber(int num) { // 153
        int a = 0;
        int b = 0;
        int c = num; // c = 153

        while (num > 0) {
            a = num % 10; // a = 3 --> a = 5 --> a = 1
            num = num / 10; // num = 15 --> num = 1 --> num = 0
            b = b + (a * a * a); // b = 27 --> b = 27 + 125 = 152 --> b = 152 + 1 = 153
        }

        if (b==c){
            return true;
        }else {
            return false;
        }
    }
     */

    /*
    Ali Ihsan's solution:

    //armstrong number number= digit1^digitnumber+digit2^digitnumber+digit3^digitnumber+...digitN^digitnumber
    //find digits for power
    //store in a flexible container
    //each digits power container size
    //sum
    //compare sum and initial number

    public static boolean isArmstrong(int number) {
        List<String> list = new ArrayList<>(Arrays.asList((number + "").split("")));
        int power = list.size();
        int temp = 0;
        for (int i = 0; i < power; i++) {
            temp += Math.pow(Integer.valueOf(list.get(i)), power);// parseInt can be used
        }
        if (temp == number)// there is redundant coding here...
            return true;
        else return false;
    }

    public static void main(String[] args) {


        for (int i = 0; i < 450; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " : " + isArmstrong(i));
            }
        }
     */