package day34_custom_classes.house3;

public class _05House {


    // instance variables olusturalim:
    String type;
    double squareFeet;
    int numberOfBedrooms;
    int numberOfBathrooms;
    boolean inCity;
    boolean hasGarage;

    public double calculateMorgage(){

        if(numberOfBedrooms < 2){
            return  1500;
        } else if(numberOfBedrooms < 4){
            return 2000;
        } else {
            return 2500;
        }
    }

    // class'ta saga tiklayinca Generate ---> toString ---> hepsi secili olsun

    /*
    How to generate toString in IntelliJ?

	right click on the class. —> if you are not in the class, you will not see them
	click ->  generate
	click -> toString
	Select the variable that you want to be in the method
	Ok

        IGNORE OVERRIDE - if you want, you can delete it

        —> shortcut of Generate window:   comment + n
     */

    // right click -> generate -> toString -> select all the variables -> OK tiklayinca asagidaki otomatik olarak olustu:

    /* Original one, otomatik olarak olusan:
    public String toString() {
        return "_05House{" +
                "type='" + type + '\'' +
                ", squareFeet=" + squareFeet +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", inCity=" + inCity +
                ", hasGarage=" + hasGarage +
                '}';
     */

    // _06Market class'inda bu sekilde print edince cikan:
    //  _05House{type='Townhouse', squareFeet=1300.0, numberOfBedrooms=3, numberOfBathrooms=2, inCity=false, hasGarage=true}


    // Boolean olanlar true veya false diye gozukmesin, metin olarak gozuksun deyip biraz adjustment yaptik.

    public String toString() {
        return "_05House{" +
                "type='" + type + '\'' +
                ", squareFeet=" + squareFeet +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBathrooms=" + numberOfBathrooms + ", " +  // ", " + kismini tamamen print edinceki goruntu icin ekledik
                (inCity? "In the City" : "In the suburbs") + ", " +
                (hasGarage ? "Has garage" : "No garage. Street parking");

        /* _06Market class'inda bu boyleyken run edince boolean kismi olan inCity ve hasGarage'a true veya false disinda metin ekledigimiz icin o kisimlari degisiyor ve biraz daha farkli print ediliyorlar:
        Su sekilde:
        // _05House{type='Townhouse', squareFeet=1300.0, numberOfBedrooms=3, numberOfBathrooms=2, In the suburbs, Has garage

         */

    }
}
