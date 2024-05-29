import java.time.LocalDate;

class Event {
private String title;
private LocalDate date;
private String description;

public Event(String title, LocalDate date, String description) {
        this.title = title;
        this.date = date;
        this.description = description;
        }

public void displayEvent() {
        System.out.println("Event Title: " + title);
        System.out.println("Date: " + date);
        System.out.println("Description: " + description);
        }
        }
