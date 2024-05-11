package enumeration.ex3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        Grade[] values = Grade.values();
        System.out.println(Arrays.toString(values));

        for (Grade value : values) {
            System.out.println(value.name() + value.ordinal());
        }

        String input = "GOLD";
        Grade gold = Grade.valueOf(input);

        System.out.println("gold = " + gold);

    }
}
