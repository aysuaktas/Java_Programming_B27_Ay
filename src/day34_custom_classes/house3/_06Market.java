package day34_custom_classes.house3;

public class _06Market {

    public static void main(String[] args) {

        _05House house1 = new _05House();
        System.out.println(house1);  // _05House{type='null', squareFeet=0.0, numberOfBedrooms=0, numberOfBathrooms=0, inCity=false, hasGarage=false}    ---> default values --> cunku henuz value vermedik

        house1.type = "Townhouse";
        house1.squareFeet = 1300;
        house1.numberOfBathrooms = 2;
        house1.numberOfBedrooms = 3;
        house1.inCity = false;
        house1.hasGarage = true;

        System.out.println(house1);  // --> you don't need to call toString, because it is automatically called
        // Boolean olanlar true veya false yaziyordu otomatik olanda. Onu degistirip metin yazinca console'da -----> _05House{type='Townhouse', squareFeet=1300.0, numberOfBedrooms=3, numberOfBathrooms=2, In the suburbs, Has garage  yaziyor.
        // Buna degistirmeden once otomatik olarak cikanda su sekilde print ediyordu: _05House{type='Townhouse', squareFeet=1300.0, numberOfBedrooms=3, numberOfBathrooms=2, inCity=false, hasGarage=true}

        System.out.println(house1.calculateMorgage());  // 2000.0  --> calculateMorgage methodunu -->  _05House class'indan cagirdik


    }
}
