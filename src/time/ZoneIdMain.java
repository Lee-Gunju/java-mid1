package time;

import java.time.ZoneId;

public class ZoneIdMain {

    public static void main(String[] args) {
        for (String availavleZoneid : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availavleZoneid);
            System.out.println(zoneId + "  " + zoneId.getRules());

        }
    }
}
