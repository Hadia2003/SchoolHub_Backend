import java.util.*;
interface Calendar {
    void addEvent(Event event);
    void removeEvent(Event event);
    List<Event> viewEvents();
}

// Calendar functionality implementing Calendar interface
class SchoolCalendar implements Calendar {
    private static SchoolCalendar instance;
    private List<Event> events;

    private SchoolCalendar() {
        this.events = new ArrayList<>();
    }

    public static SchoolCalendar getInstance() {
        if (instance == null) {
            instance = new SchoolCalendar();
        }
        return instance;
    }

    public void addEvent(Event event) {
        events.add(event);
        System.out.println("Event added successfully.");
    }

    public void removeEvent(Event event) {
        events.remove(event);
        System.out.println("Event removed successfully.");
    }

    public List<Event> viewEvents() {
        return events;
}
}


