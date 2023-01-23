package day41_exceptions._3_try_catch;

public class _12MultipleCatch {

    public static void main(String[] args) {


      //  System.out.println(5/0);  // run ettikten sonra ArithmeticException verdi bize.


        try{
            System.out.println(5/0);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());  // bunu yazinca console'da cikan:  / by zero   -> because getMessage() : returns only brief description of the exception
        }

        System.out.println("-----------------");

        /*

        try{
            System.out.println(1/5);

            String s = null;
            s.trim();

        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("END");  // this has nothing to do with any try catch. ((It is directly in the main method, it is always there --> ama burada my program stopped olunca bunu yazmadi))


       // Bunu run edersek:

        0
        Exception in thread "main" java.lang.NullPointerException
	        at day41_exceptions._3_try_catch._12MultipleCatch.main(_12MultipleCatch.java:24)
         */



        System.out.println("-----------------");

        try{
            System.out.println(5/0);

            String s = null;
            s.trim();

        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("END");

        /*  Bunu print edince:
        / by zero
        END
         */


        System.out.println("------Multiple catch block : -----------");

        try{
            System.out.println(1/5);

            String s = null;
            s.trim();

        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (NullPointerException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }

        System.out.println("END"); // this has nothing to do with any try catch


        /* Console'da:
        0
        Second catch block
        END
        java.lang.NullPointerException
        	at day41_exceptions._3_try_catch._12MultipleCatch.main(_12MultipleCatch.java:69)
         */


        /*

         /*
        System.out.println("-------to group multiple catches together----------");  //--> mesela catch kisminda catch(ArithmeticException | NullPointerException e){ yapsak cok mantikli olmazdi cunku farkli, bambaska seyler. Ama catch( StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e){ yapacaksan bu sekilde grouping multiple catches together mantikli olur:


        try{


        } catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
         */


    }
}
