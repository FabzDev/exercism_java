import java.time.LocalDate;
import java.time.LocalDateTime;

public class GigasecondV2 {
    LocalDateTime date;
    private final long GIGASECONDS = 1000000000L;

    public GigasecondV2(LocalDate moment) {
        date = moment.atStartOfDay();
    }

    public GigasecondV2(LocalDateTime moment) {
        date = moment;
    }

    public LocalDateTime getDateTime() {
        return date.plusSeconds(GIGASECONDS);
    }

    public static void main(String[] args) {
        GigasecondV2 gs = new GigasecondV2(LocalDateTime.now());
        System.out.println(gs.getDateTime());
    }
}