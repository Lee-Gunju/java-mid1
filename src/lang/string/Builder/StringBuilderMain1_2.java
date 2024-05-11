package lang.string.Builder;

public class StringBuilderMain1_2 {

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        s1.append("Hello").append("a").append("d")
                        .insert(4, "jajvsd").delete(4,8)
                        .reverse().toString();

        System.out.println(s1);

    }
}
