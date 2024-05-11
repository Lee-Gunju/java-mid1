package lang.wrapper;

public class AutoBoxingMain2 {

    public static void main(String[] args) {
        int value = 7;
        Integer boxedValue = value; // 오토 박싱 (자바에서 자동으로 박싱)

        int unboxedValue = boxedValue; // 오토 언박싱 (자바에서 자동으로 언박싱)

        System.out.println(boxedValue);
        System.out.println(unboxedValue);

    }
}
