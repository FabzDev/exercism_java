import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppointmentScheduler {
    private final Pattern pattern = Pattern.compile("([\\d]{1,2})/([\\d]{1,2})/([\\d]{4}) ([\\d]{2}):([\\d]{2}):([\\d]{2})");

    public LocalDateTime schedule(String date) { //format "7/25/2019 13:45:00"
        Matcher matcher = pattern.matcher(date);
        matcher.matches();
        String formattedDate = String.format("%s-%s-%sT%s:%s:%s",
                matcher.group(3),
                matcher.group(1).matches("\\d{2}") ? matcher.group(1) : String.format("0%s", matcher.group(1)),
                matcher.group(2).matches("\\d{2}") ? matcher.group(2) : String.format("0%s", matcher.group(2)),
                matcher.group(4),
                matcher.group(5),
                matcher.group(6)
        );

        return LocalDateTime.parse(formattedDate);
    }

    public boolean hasPassed(LocalDateTime date) {
        return date.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime date) {
        return date.getHour() >= 12 && date.getHour() < 18;
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }

    public String getDescription(LocalDateTime dateIn) {
        DateTimeFormatter printer = DateTimeFormatter.ofPattern("'You have an appointment on 'EEEE, MMMM d, yyy,' at 'K:mm a'.'");
        return printer.format(dateIn);
    }

    public static void main(String[] args) {
        AppointmentScheduler as = new AppointmentScheduler();
        LocalDateTime date = as.schedule("7/25/2019 18:45:00");
//        System.out.println(as.isAfternoonAppointment(date));
        System.out.println(as.getDescription(LocalDateTime.of(2020, 9, 12, 9, 9, 9)));
//        System.out.println(as.getAnniversaryDate());
    }
}
