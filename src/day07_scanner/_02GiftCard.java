package day07_scanner;

public class _02GiftCard {

    /*
    declare and assign a gift card variable at 500
    declare and assign times used at 3
    print using giftcard and subtract 150 from the amount
    reduce the times used by one
    print using giftcard and subtract 99 from the amount
    reduce the time used by one
    print information at the end
     */

    public static void main(String[] args) {

        double giftCard = 500; // int de diyebiliriz ama double daha iyi price icin. 500 int type oldugu ve int de double'dan kucuk oldugu icin boyle yazmakta sorun yok

        int uses = 3;

        System.out.println("Using giftcard. $150 removed");
        giftCard -= 150; // giftCard = giftCard - 150; // -=150 yazmakla bu ayni sey

        uses--;  // ((pre-decrement veya post-decrement oldugu burada fark etmez cunku we won't do anything on this line))

        System.out.println("Using giftcard. $99 removed");
        giftCard -= 99; // giftCard = giftCard - 150;
        uses--;    // todo: boyle bir kullanim da var, yukarida int uses = 3; diye declare and assign ettigimiz icin artik boyle de kullanabiliriz

        System.out.println("Gift card balance left $ " + giftCard);
        System.out.println("Number of times card can be used: " + uses);

    }
}
