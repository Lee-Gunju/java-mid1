package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Hello World";

        String[] split = str.split(" ");
        for (String s : split) {
            System.out.println(s);
        }

        String joinStr = "";
        for (String s : split) {
            joinStr += s + "-";
        }

        System.out.println("joinStr = " + joinStr);
        //join


    }
}
