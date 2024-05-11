package lang.string.Builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        s1.append("Hello");
        s1.append("!");
        s1.append("#");

        System.out.println(s1);

        s1.insert(4,"java");
        System.out.println(s1);

        s1.reverse();
        System.out.println(s1);

        // StringBuilder -> String
        String string = s1.toString();
        System.out.println(string);

    }
}
