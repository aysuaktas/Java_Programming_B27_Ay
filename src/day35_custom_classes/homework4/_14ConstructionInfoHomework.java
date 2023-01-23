package day35_custom_classes.homework4;

public class _14ConstructionInfoHomework {



       // Constructor is a special method that matches the name of the class and has no return type nor a specifier. --> As Saim said, the constructor should be the same as the class name and no return type(no void either)



            /*  Q-1: What does a constructor do?

            -->  Main goal of constructor: setting up OR initialize the instance variables. -> We can use constructors to initialize the objects' instance variables.
            */


             /*  Q-2: When is the constructor called?

            --> Constructor is a special method that every class must have. (Every class has a constructor. There is a constructor there automatically, even we don't see it. --> if we don’t create a constructor, the compiler will create a default constructor, which is a “no-argument constructor”)

            It is used when we create objects of a class. Constructor is called when an object is created. (it is called in relation to "new" operator).
             */


            /*  Q-3: What is the difference of a local variable and instance variable?

                --------
                Gulbeyaz's explanations:
                    =>local variable: local to the code block only
                    =>instance variable: variable that is defined in a class, not belonging to any other code block
                ---------

                // Zirwan Ahmed Salih's explanation:
                    - the instance variable is called outside the constructor/method , while local is called inside the constructor/method.
                 ----------

            --> Java prioritizes local variables over instance variables. So, if you have a local variable and an instance variable with the same name, the local variable will be the one used.


                Q-4: What is "this" keyword used for?

                    --> this.
                    this keyword: acts as a reference to the object. So, it will normally be used to tell the compiler the difference between the local variable and an instance variables. --> Instance variable ile local variable same (ayni) olunca hangisi oldugunu nasil anlayacak? Local a is prioritized, o yuzden by default onu alacak! The solution is "this.". When we want to reference instance variables, --> if the localVariableName is the same with instanceVariableName, we will use " this. " keyword. Yoksa by default -> local variables'i alir.
            */



}
