package Twenty2ClassTest;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
public class CurrentTimeAllTimeZones {
    public static void main(String[] args) {
                Set<String> availableZones = ZoneId.getAvailableZoneIds();

                for (String zoneId : availableZones) {

                    ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(zoneId));

                    System.out.println("Time in " + zoneId + ": " + zonedDateTime);
                }
            }
        }
