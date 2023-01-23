package day40_inheritance._1_app;

public class _01App {

    /*
    Create an App class

    - create variables:
        name (app name), version

    - create constructor to initialize the variables

    - create method:
        download()
            Example output: prints $name is downloading version $version
     */


    String name;
    double version;

    public _01App(String name, double version){
        this.name = name;
        this.version = version;
    }

    public void download(){
        System.out.println(name + " is downloading version " + version);
    }


}
