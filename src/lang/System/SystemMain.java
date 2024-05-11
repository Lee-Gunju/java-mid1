package lang.System;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);

        long currentNanoTime = System.nanoTime();
        System.out.println(currentNanoTime);

        System.out.println(System.getenv());

        System.out.println(System.getProperties());


        char[] originalArray = {'s', 'd', 'g'};
        char[] copiedArray = new char[3];
        System.arraycopy(originalArray, 0 , copiedArray, 0 , originalArray.length);

        System.out.println(copiedArray);
        System.out.println(Arrays.toString(copiedArray));

        System.exit(0);
        System.out.println(copiedArray);
    }
}
