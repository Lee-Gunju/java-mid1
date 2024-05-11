package lang.string.method;

public class StringSearchMain {

    public static void main(String[] args) {

        String str1 = "Hello Java! welcome to java world";

        System.out.println(str1.contains("Java"));
        System.out.println("'Java의 첫번째 인덱스:'" + str1.indexOf("Java"));
        System.out.println(str1.indexOf("java", 10));
        System.out.println("'Java'" + str1.lastIndexOf("Java"));
    }
}
