package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = "world";

        String result1 = a.concat(b);
        // 참조값까지는 더하기가 원래는 안된다. 하지만 너무 자주 사용하니 편의상 쓰게 해줌..!!!
        String result2 = a + b;

        System.out.println(result1);
        System.out.println(result2);
    }
}
