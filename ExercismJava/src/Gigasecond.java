import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Gigasecond {
    LocalDateTime newDate;

    public Gigasecond(LocalDate moment) {
        LocalDateTime momentTime = LocalDateTime.of(moment, LocalTime.of(0, 0, 0));
        newDate = momentTime.plus(1000000000, ChronoUnit.SECONDS);
    }

    public Gigasecond(LocalDateTime moment) {
        newDate = moment.plus(1000000000, ChronoUnit.SECONDS);
    }

    public LocalDateTime getDateTime() {
        return newDate;
    }

    public static void main(String[] args) {
        Gigasecond gs = new Gigasecond(LocalDate.now());
        System.out.println(gs.getDateTime());
    }
}