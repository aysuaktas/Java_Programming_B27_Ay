package day40_inheritance._3_final;

public final class _09FinalExamples {  // "final"i biz ekledik buna. final'da inheritance olmadigi icin, eger ben buraya public final class FinalExamples dersem o zaman _10UsingFinal'e gidip public class'ina 'extends _09FinalExamples' dersem hata verecek, cunku interited olmuyor final class olanlar parent class olamiyor yani.

    // let's start with final variables: hardcoded instance variable, dynamic instance variable and static final variable gorecegiz.

    public final int a = 10; // hard coded instance variable (directly in the file). It means that every object of the class will have access to this one, and it cannot be changed. --> once final sonra public de yazabilirdik syntax acisindan ama not recommended.

    public final int b;  // dynamic instance variable yapalim. I'm only declaring it here, how can I make it dynamic? -> Sadece bunu yazinca hata verdi, because it's a final variable, but it does not have a value yet. It is a problem because it needs some value because they can never be changed.
    /* I want to make it dynamic but how? First of all, this is instance, this is not a static. It's instance, which means that I can make an object by using constructor. -> Altta
        public _09FinalExamples(int num) {
            b = num;
        }
        constructor'unu olusturduk. If I use a constructor to accept some kind of number, I don't have to say 'this. ' because I'm using different names here.

        --> If I use a constructor, which means that it will create an object here, I can kind of dynamically make a variable that's also fixed. It means -> when the object is created, the given argument will be the value of b, then it cannot be changed.

    -> the constructors run when the object was created, which means, after the object is created, the variable will not be changed, which is still okay. It knows that this would be assigned at some point, and so it'll compile again.

    -> Final olunca: So it needs to be assigned once, and that's it. You have to assign something to it because it is final, it cannot be changed.
    --> Remember; there's one rule in Java, some variable needs have some data before it can be used. So you need to have some values. It can be hardcoded or dynamically, but you need some value.

    -> (int) num is just a parameter. When we create an object of that class, when we actually use it, then whatever the value (argument) we give is the one that will be assigned.((When we create an object, then we can assign a value)) --> the local variable (parameter'daki int num) is not the final one. The "b" is the final.
     */



    public static final String PLANET = "Earth"; // // static final variable --> public static final yan yana gelince bu ne oldu? "constant variable" cunku static ve final bir arada kullanilmis. Access modifier olmak zorunda degil constant olmasi icin, ama olabiliyor da. --> Constant variable oldugu icin all uppercase seklinde yazdik variable ismini. Bosluk olsaydi onu da underscore ile ayirirdik. Ama ustteki a ve b variable'lari instance variable oldugu icin constant degiller, o yuzden onlari uppercase A ve B olarak yazmamistik.

    public static final String TEST_1 = "test1.us.google.com";  // Final variables vs cok kullanmayacagiz ama bir kodun icinde gecerse anlayabilecegiz artik. Is yasaminda; mesela TEST_1 environment'in icin boyle bir sey yapilabilir, url yazilabilir oraya mesela -> fixed testing environment'imiz, ya da dev env ya da production env falan varsa.

    // public static final -> these keywords together is what makes a constant

    public _09FinalExamples(int num) {
        b = num; // when the object is created, the given argument will be the value of b, then it cannot be changed
    }

}
