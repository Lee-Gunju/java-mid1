package lang.wrapper;

public class WrapperUtilsMain {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); // 인트를 인티저로
        Integer i2 = Integer.valueOf("20"); // 문자 인티전
        int i3 = Integer.parseInt("20"); // 문자를 인트

        int compareResult = i1.compareTo(20);
        System.out.println(compareResult);


        System.out.println(Integer.sum(i1, i2));
    }
}
