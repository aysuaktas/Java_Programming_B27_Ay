package day38_encapsulation._05_airport;

public class _08FlightTicket {

        /*
        declare these instance variables:
            type(first, business, economy)
            departure
            arrival

         encapsulate all of them

         create constructor to set up the object

            Note: type should only be first, business, or economy
     */

    private String type;
    private String departureLocation;
    private String arrivalLocation;

    public _08FlightTicket(String type, String departureLocation, String arrivalLocation) {
        setType(type);
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;  // Zeynep ile denedik: bu son ikisini de aslinda bunlarin setter method'larinda yazdigimiz icin bunlari burada setDepartureLocation(departureLocation); ve setArrivalLocation(arrivalLocation); seklinde de yazabiliriz
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(type.equalsIgnoreCase("first") || type.equalsIgnoreCase("business") || type.equalsIgnoreCase("economy")){
            this.type = type;
        }
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

}
