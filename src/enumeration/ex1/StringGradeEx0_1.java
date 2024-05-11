package enumeration.ex1;

public class StringGradeEx0_1 {


    public static void main(String[] args) {
        int pirce = 10000;

        enumeration.ex1.DiscountService discountService = new DiscountService();
        int basic = discountService.discount(StringGrade.BASIC, pirce);
        int gold = discountService.discount(StringGrade.GOLD, pirce);
        int diamond = discountService.discount(StringGrade.DIAMOND, pirce);

        System.out.println("basic: " + basic);
        System.out.println("gold: " + gold);
        System.out.println("diamond: " + diamond);
    }
}
