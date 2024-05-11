package lang.string.Builder;

public class LoopStringBuilderMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for (int i =0; i < 100000; i++) {
            sb.append("Hello World!");
        }
        long endTime = System.currentTimeMillis();

        String result = sb.toString();
        System.out.println(result);
        System.out.println(endTime - startTime);
    }
}
