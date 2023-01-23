package day16_string;

public class _04DynamicIndexOf {

    public static void main(String[] args) {

        String str = "definition";
             //       0123456789
        // goal is to find all the indexes of all the 'i' characters

        System.out.println("First i: " + str.indexOf('i'));  // First i: 3
        System.out.println("Last i: " + str.lastIndexOf('i'));  // Last i: 7

        System.out.println("other use of indexOf: ");

        System.out.println("First i: " + str.indexOf('i'));  // First i: 3
        System.out.println("Second i: " + str.indexOf('i', 4)); // Second i: 5 --> // TODO:  I gave 4 as my starting point. 4'ten sonraki ilk i'ye bakiyoruz bunda. Su aciklama bununla ilgili //-> (char/String, int): give a String or a char, the value you are searching the index of, then you give number which is the starting point to search from (starting point)

        System.out.println("Third i: " + str.indexOf('i', 6)); // Third i: 7

        // bunlar hardcoded idi

        System.out.println(" Hardcoded above ---------------- Dynamic below");

        // dynamic yapmak icin:

        int firstI = str.indexOf('i');
        int secondI = str.indexOf('i', firstI + 1);  //TODO:  take previous index and add 1 to it, so we can start looking for the next occurrence   --->
        // position farketmeksizin ilk buldugumuza 1 ekleyip sonrasina bakiyoruz. Yukarida da hardcoded olarak bunu yapmistik aslinda. First i'yi 3 bulduktan sonra sonraki print statement ile ('i', 4)'e bakmistik. Bu da dynamic hali;

        int thirdI = str.indexOf('i', secondI + 1);

        System.out.println("First i: " + firstI);   // --> First i: 3
        System.out.println("Second i: " + secondI);  // --> Second i: 5
        System.out.println("Third i: " + thirdI);   // --> Third i: 7


    }
}
