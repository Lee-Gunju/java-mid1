package time;

import java.time.LocalTime;

public class LocalTimeMain {

    private static final int noon =0;


    public static void main(String[] args) {
        //LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(23, 59, 59);

        System.out.println((LocalTime.NOON));

        //System.out.println(nowTime.MIN);
        System.out.println(ofTime);

        ofTime = ofTime.plusHours(1);
        System.out.println(ofTime);
    }
}
