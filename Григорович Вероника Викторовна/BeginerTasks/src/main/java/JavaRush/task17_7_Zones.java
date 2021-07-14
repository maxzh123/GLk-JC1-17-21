package JavaRush;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class task17_7_Zones {
    public static void main(String[] args) {
        ZoneId zone1=ZoneId.of("Zulu");
        ZoneId zone2=ZoneId.of("Etc/GMT+8");
        System.out.println(ZonedDateTime.now(zone1));
        System.out.println(ZonedDateTime.now(zone2));
        LocalDateTime localDateTime=changeZone(LocalDateTime.of(2020,3,19,1,40), zone1, zone2);
        System.out.println(localDateTime);
    }

    static LocalDateTime changeZone(LocalDateTime time, ZoneId zoneFrom, ZoneId zoneTo) {
       ZonedDateTime zone1=time.atZone(zoneFrom);
        ZonedDateTime zone2=zone1.withZoneSameInstant(zoneTo);
        return  zone2.toLocalDateTime();
    }
}
