package enumeration.ref3;



public class EnumRefMain3_2 {

    public static void main(String[] args) {
        int price = 10000;



        System.out.println("Basic discount  " + Grade.BASIC.discount(price));
        System.out.println("gold discount  " + Grade.GOLD.discount(price));
        System.out.println("diamond discount  " + Grade.DIAMOND.discount(price));
    }
}
