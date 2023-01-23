package day30_practice_wrapper;

public class _06GoogleSearch {

    public static void main(String[] args) {

        String str = "About 1,690,000,000 results (0.49 seconds)";  // from some layer; UI, DB, or API
        String [] parts = str.split(" ");
        System.out.println(parts[1]);  // 1,690,000,000
        // System.out.println(parts[1].replace("," , ""));  // 1690000000
        int result = Integer.parseInt(parts[1].replace("," , ""));

        if(result > 1_000_000){
            System.out.println("Please narrow the search down");
        }

        if(result < 50_000){
            System.out.println("Not too much information");
        }

        // Please narrow the search down   is printed

        System.out.println(parts[3]);  // (0.49
        System.out.println(parts[3].substring(1)); // 0.49  --> opening paranthesis'i dahil etmemek icin substring(1) yapip 1. indexten baslattik

        double seconds = Double.parseDouble(parts[3].substring(1));

        if(seconds > 1.0){
            System.out.println("Search took too long");
        } else if(seconds > 0.5){
            System.out.println("Okay but could be better");
        } else {
            System.out.println("Good speed");
        }

        // Good speed  is printed.   --> Bastakinde 2.8 yapsaydik yani String str = "About 1,690,000,000 results (2.8 seconds)"; olsaydi Search took too long would be printed.




    }
}
