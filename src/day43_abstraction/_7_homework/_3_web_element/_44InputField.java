package day43_abstraction._7_homework._3_web_element;

public class _44InputField implements _39WebElement, _40Clickable, _41Input {

    @Override
    public void getText() {
        System.out.println("Getting the text from input field");
    }

    @Override
    public void click() {
        System.out.println("Clicking to input field");
    }

    @Override
    public void sentKeys() {
        System.out.println("Sending keys");
    }
}
