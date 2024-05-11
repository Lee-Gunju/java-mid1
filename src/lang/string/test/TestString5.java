package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extIndext = str.indexOf(ext);
        String filename = str.substring(0,extIndext);
        String extName = str.substring(extIndext);

        System.out.println(filename);
        System.out.println(extName);
    }
}
