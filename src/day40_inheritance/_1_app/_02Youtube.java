package day40_inheritance._1_app;

import day40_inheritance._1_app._01App;

public class _02Youtube extends _01App {  // extends App'i biz ekledik

    /*
    Create a class Youtube

    - Youtube class inherits App class

    - create constructor to call parent constructor and set up variables (name and version)

    - create method:
        watchVideo()
            Example output: prints Watching java tutorial
     */


    // all informations I need var, sadece inherit edecegim


    /* Default constructor bu:
             public _02Youtube(){
                   super();
             }

        class name kismina extends App ekleyince hata veriyor ama, nedenini onceki (day39) derste de ogrenmistik. name and version vererek bir constructor'imiz olsun istiyoruz, o yuzden bunu _01App class'ina bos bir constructor vs yazmadim da burada duzeltme yaptim
      */

    public _02Youtube(double version){
        super("Youtube", version);
    } // Youtube ismini hardcoded verdik cunku hep ayni olacak

    public void watchVideo(){
        System.out.println("Watching java tutorial");
    }



}
