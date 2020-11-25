import com.skillbox.airport.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Main {
static int count = 0;
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        airport.getTerminals().stream().flatMap(f -> f.getFlights().stream())
                .filter(t -> t.getType() == Flight.Type.DEPARTURE)
                .filter(d -> d.getDate().getTime() >= Date.from(LocalDateTime.now()
                        .atZone(ZoneId.systemDefault()).toInstant()).getTime()
                        && d.getDate().getTime() <= Date.from(LocalDateTime.now().plusHours(2)
                        .atZone(ZoneId.systemDefault()).toInstant()).getTime())
                        .forEach( a -> {
                            System.out.print(a + "   ");
                            System.out.println(a.getAircraft());
                        });
    }
}