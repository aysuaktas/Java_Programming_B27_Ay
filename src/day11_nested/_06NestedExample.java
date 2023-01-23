package day11_nested;

public class _06NestedExample {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = true;

        if(a){                    // the answer of boolean is true or false. -> if a is true, whenever is true, it will be printed
            System.out.println(1);
            if (b){               // todo: Bu yalnizca a true ise will be printed because this is nested if. -> if b is also true, then this block also will be printed.
                System.out.println(2);
            }

        }

        // If statement icinde if statement

        /*
        when
        a = true
        b = true
        output:
            1
            2

        // ((for a nested if example like this one)) when;
        a = false
        b = true  --> it will not run. Cunku a yanlis ise ve else block'u da yoksa orasi tamamen will not run even b is true. -> Cunku b statement is inside of a statement-> yani nested if statement
            output:
            There is no output

        when
        a = true
        b = false  --> a dogru ama b yanlissa a print edilir ama b edilmez.
        output:
            1
         */




    }
}
