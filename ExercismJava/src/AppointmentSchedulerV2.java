import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppointmentSchedulerV2 {

    public LocalDateTime schedule(String date) { //format "7/25/2019 13:45:00"
        DateTimeFormatter format = DateTimeFormatter.ofPattern("M/d/yyy kk:mm:ss");
        return LocalDateTime.parse(date,format);
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
        AppointmentSchedulerV2 as = new AppointmentSchedulerV2();
        LocalDateTime date = as.schedule("7/25/2019 18:45:00");
//        System.out.println(as.isAfternoonAppointment(date));
        System.out.println(as.getDescription(LocalDateTime.of(2020, 9, 12, 9, 9, 9)));
//        System.out.println(as.getAnniversaryDate());
    }
}
