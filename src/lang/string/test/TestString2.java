package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e", "f"};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            String string = arr[i];

            sum += string.length();

        }
        System.out.println(sum);

        }

}
