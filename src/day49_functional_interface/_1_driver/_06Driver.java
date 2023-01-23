package day49_functional_interface._1_driver;

import day49_functional_interface._01ConfigRaeder;

import java.util.concurrent.TimeUnit;

public class _06Driver {    // this is the main idea.

    // her seferinde set up your classes, set up your driver yapman gerekiyor automation'da. Bunu tekrar tekrar yapmak istemiyorsak:


    private _06Driver(){}  // this is the constructor of my class --> constructors are used to initialize the object
                           /* peki -> why is the constructor private? --> private means only accessible in the same class
                                                                      --> constructor is used to create object
                                                                      --> so, I cannot create object outside the class

                 Constructor private ise private'tan class disinda object create edemeyiz. It means no object can be created basically. O yuzden ici bos biraktik ve {} yan yana
                            */



    private static _03WebDriver driver;   // buradaki WebDriver -> bu subpackage'daki _03 interface'inden geliyor --> private static _03WebDriver driver; is the reference, there is no any object yet.

            // private -> cannot access outside the class
            // static  -> don't need an object to use

            // default of driver? -> null

    public static _03WebDriver getDriver() {

        // her seferinde driver object olusturmamiz gerekmeyecek, we can keep it in our utility class. // driver.manage().window().maximize(); VEYA driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); falan bunlari bir kez olusturup tekrar tekrar kullanacagiz. // Driver.getDriver() ile eriseceksin ileride. Driver.getDriver().get("google") gibi kullanacagiz. Utility method olarak olacak ve tekrar tekrar create etmen gerekmeyecek

        if (driver == null) {  // if driver equals to null -> eger henuz driver yoksa. If there is no driver instance yet, then this code has to be run. Because once we have a browser, it will always just return driver to us.

            switch (_01ConfigRaeder.getProperty("browser")) {  // _01ConfigReader class'imda browser'im chrome. Eger baska bir sey olsun istersem .properties file'ima gidip onu degistiririm.

                case "chrome":
                    driver = new _04ChromeDriver();
                    // rest of the code for chrome
                    /*
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                     */  // bunlari tekrar tekrar yazmamiz gerekmeyecek
                    break;
                case "firefox":
                    driver = new _05FirefoxDriver();
                    // rest of the code for firefox
            }
        }
        return driver;
    }

}

