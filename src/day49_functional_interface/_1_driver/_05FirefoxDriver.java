package day49_functional_interface._1_driver;

public class _05FirefoxDriver implements _03WebDriver {

    @Override
    public void get() {
        System.out.println("Opening in firefox");
    }

    @Override
    public void findElement() {
        System.out.println("Finding elements in firefox");
    }
}
