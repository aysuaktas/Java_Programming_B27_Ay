package day42_abstraction._2_exercise;

public class _09Bench extends _08Lifting {   // extends _08Lifting'i biz yazdik


    @Override
    public void perform() {
        System.out.println("Bench press");
    }

    @Override
    public void getCaloriesBurned(int minutes) {
        System.out.println(10 * minutes);
    }

    @Override
    public void rackWeights() {
        System.out.println("Putting the bar back on the rack");
    }
}  // _09Bench is my concrete class

// Bu _09Bench class'i, _08Lifting class'ini child'i ve dolayisiyla _05Exercise class'inin grandchild'i. O yuzden hem parent'inin hem grandparent'inin methodlarini cagirdik.