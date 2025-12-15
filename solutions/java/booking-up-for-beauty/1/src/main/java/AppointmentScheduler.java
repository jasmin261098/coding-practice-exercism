import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, formatter);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime today = LocalDateTime.now();
        return appointmentDate.isBefore(today);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");
        String formattedDate = appointmentDate.format(formatter);
        return "You have an appointment on " + formattedDate + ".";
    }

    public LocalDate getAnniversaryDate() {
        int currentYear = LocalDate.now().getYear();
        return LocalDate.of(currentYear, 9, 15);
    }
}
