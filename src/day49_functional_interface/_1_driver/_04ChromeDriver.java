package day49_functional_interface._1_driver;

public class _04ChromeDriver implements _03WebDriver {

    @Override
    public void get() {
        System.out.println("Opening in chrome");
    }

    @Override
    public void findElement() {
        System.out.println("Finding elements in chrome");
    }
}
