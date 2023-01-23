package day35_custom_classes.carpet2;

public class _03Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;   // Persian carpets are a little more expensive oldugu icin bunu vermis :D
    double totalPrice;

    public _03Carpet(double inputWidth, double inputLength, double inputUnitPrice, boolean inputPersian){ // I defined 4 parameters. I have 5 instance variable but I used 4 parameters. 5 instance variable'in hepsini kullanmak zorunda degilim, hesaplamak icin 4u bana yetecek
        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
        isPersian = inputPersian;
        calculatePrice();
    }

    public void calculatePrice(){  // simdi konuyu ogreniyoruz sadece. Ama void yerine baska return type da kullanabilecegini bil
        totalPrice = width * length * unitPrice;

        if(isPersian){   // Persian carpets daha pahali oldugu icin
            totalPrice += 200;  // Persian ise total price'a 200 ekle dedik (totalPrice = totalPrice + 200; yani aslinda bu)
        }
    }


    // toString(): [return String] --> (( returns all the information )) :
    /* automatically yazilan:::::
    public String toString() {
        return "_03Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice=" + totalPrice +
                '}';
     }
     */

    // biraz duzenlersek:

    public String toString() {
        return "_03Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", " + (isPersian ? "Persian" : "Regular") + " carpet " +
                ", totalPrice= $" + totalPrice +
                '}';
    }
}
