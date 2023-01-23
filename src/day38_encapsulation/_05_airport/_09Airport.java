package day38_encapsulation._05_airport;

import day38_encapsulation._05_airport._08FlightTicket;

public class _09Airport {

    public static void main(String[] args) {

        _08FlightTicket ticket1 = new _08FlightTicket("first", "Chicago", "Virginia");
        System.out.println(ticket1.getType());  // first
        System.out.println(ticket1.getDepartureLocation()); // Chicago
        System.out.println(ticket1.getArrivalLocation());  // Virginia

        _08FlightTicket ticket2 = new _08FlightTicket("flying", "New York", "Canada");
        System.out.println(ticket2.getType());  // null --> flying valid olmadigi icin default value cikti -> first, business veya economy olmasi icin belirlemistik _08FlightTicket class'inda

        ticket2.setType("economy");
        System.out.println(ticket2.getType());  // economy





    }
}
