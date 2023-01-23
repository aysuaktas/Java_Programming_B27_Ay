package day29_methods;

import org.w3c.dom.ls.LSOutput;

public class _01ExtraPractice {

    /*  it was yesterday's homework:

    Create a method that accept an int array. Take the sum of all the numbers and return the sum
     */

    public static void main(String[] args) {
        int[] nums = {1, 24, 5, 12};  // asagida sumFromArray method'unda value yoktu. O value'nun argument kismindan yani parantez icine yazdigimiz kisimdan gelmesi lazim
        System.out.println(sumFromArray(nums));  // 42 ----> return type oldugu icin bunu print statement'in icine yazmadigim surece printed olmuyor ---> int sum = sumFromArray(nums) seklinde de olurmus.

        System.out.println(); // empty line

                // Yani second way: --> with variable ile yapmak:
        int sum = sumFromArray(nums);
        System.out.println(sum);  // this was second way

        System.out.println("------------");

        System.out.println(currencyConvertor("yen", 100));  // 12103.0 --> how many yen that I need for 100 dollar
        System.out.println(currencyConvertor("won", 100));  // 121752.0
        System.out.println(currencyConvertor("EURO", 100)); // 91.0  --> uppercase olan EURO ile de sonuc alabildim cunku case sensitivity'i engellemistik bunda

        System.out.println();  // empty line

        // If I don't have this currency information in my currency converter, for ex: peso;
        System.out.println(currencyConvertor("peso", 100)); // We cannot convert to peso
                                                            //   0.0

        String name = "lira";
        double price = 800;

        System.out.println(currencyConvertor(name, price)); // 11880.0

    }

    public static int sumFromArray(int[] nums) {     // void method kullanamayiz bunda because we need information inside of the code--> in the paranthesis, I should define the input information that I want. // void olmaz dedik, return type olacak ama bu double da olabilirdi; ama int array dedigi icin int kullanmak daha iyi

        int sum = 0;
        for (int eachNum : nums) {  // now there is no value because value comes from the argument part, when you gave the value
            sum += eachNum;
        }
        return sum;   // bunu yazana kadar hata gosteriyordu sonundaki } curly braces'te
    }

    /* it was yesterday's homework

    Currency Converter

    create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type

    Use the following information to convert from given dollars to the desired currency type

        1 dollar = 0.91 euro
        1 dollar = 121.03 yen
        1 dollar = 14.85 lira
        1 dollar = 1,217.52 won
        1 dollar = 181.45 rupee

        Note: Don't worry about decimal formats, focus on method

    Ex:
    	Input:
    		euro, 100

    	Output:
    		91

    Ex:
    	Input:
    		yen, 50

	    Output:
	    	6051.5
     */

    public static double currencyConvertor(String type, double dollar){      // bu soru money ile ilgili, so, we will definitely use the double type. TODO: Bunda iki sey onemli -> 1. double type kullanmak   2. Two parameters'imiz olacak ((parantez icinde olacak iki parameters))

        double converted = 0.0;  // converted yani convert edilen. Double icin default deger olan 0.0'i verdim

        switch (type.toLowerCase()){  // TODO: case sensitivity'i engellemek icin direkt burada .toLowerCase method kullanabiliyormusuz

            case "euro":
                converted = dollar * 0.91;    // 1 dollar = 0.91 euro icin bu ifade
                break;
            case "yen":
                converted = dollar * 121.03;   // 1 dollar = 121.03 yen icin bu ifade
                break;
            case "lira":
                converted = dollar * 14.85;
                break;
            case "won":
                converted = dollar * 1_217.52;
                break;
            case "rupee":
                converted = dollar * 181.45;
                break;
            default:   // what if we don't have this currency convert information? then, we use default for that
                System.out.println("We cannot convert to " + type);
        }
        return converted;
    }

    /*  // alternative with return each case:

    public static double currencyConverter(String type, double dollar) {
        switch (type.toLowerCase()) {
            case "euro":
                return dollar * 0.91;
            case "yen":
                return dollar * 121.03;
            case "lira":
                return dollar * 14.85;
            case "won":
                return dollar * 1_217.52;
            case "rupee":
                return dollar * 181.45;
            default:
                System.out.println("We cannot convert to " + type);
                return 0.0;
       }

    }
     */



}
