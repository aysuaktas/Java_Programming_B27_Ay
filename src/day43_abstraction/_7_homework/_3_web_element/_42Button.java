package day43_abstraction._7_homework._3_web_element;

public class _42Button implements  _39WebElement, _40Clickable{

    @Override
    public void getText() {
        System.out.println("Getting a text via a button");
    }

    @Override
    public void click() {
        System.out.println("Clicking the button");
    }
}
