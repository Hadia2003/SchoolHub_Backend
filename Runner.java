import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        // Example 1: School Profiles
        List<String> facilities = new ArrayList<>();
        facilities.add("Library");
        facilities.add("Sports Complex");

        List<String> faculty = new ArrayList<>();
        faculty.add("Dr. Smith");
        faculty.add("Prof. Johnson");

        List<String> programs = new ArrayList<>();
        programs.add("Computer Science");
        programs.add("Mechanical Engineering");

        SchoolProfile schoolProfile = new SchoolProfile("Greenwood High", "123 Maple St.", "555-1234", facilities, faculty, programs);
        schoolProfile.displayProfile();

        List<SchoolProfile> schoolProfiles = new ArrayList<>();
        schoolProfiles.add(schoolProfile);

        SchoolSearch schoolSearch = new SchoolSearch(schoolProfiles);
        List<SchoolProfile> searchResults = schoolSearch.search("Greenwood");
        for (SchoolProfile profile : searchResults) {
            profile.displayProfile();
        }

        // Example 2: Communication Hub
        CommunicationHub communicationHub = new CommunicationHub();

        Message message1 = new Message("admin", "teacher1", "Meeting at 10 AM.");
        Message message2 = new Message("teacher1", "admin", "Received, thank you.");

        communicationHub.sendMessage(message1);
        communicationHub.sendMessage(message2);

        List<Message> messagesForAdmin = communicationHub.receiveMessages("admin");
        for (Message message : messagesForAdmin) {
            message.displayMessage();
        }

        // Example 3: Calendar and Events
        SchoolCalendar calendar = SchoolCalendar.getInstance();

        Event event1 = new Event("Math Olympiad", LocalDate.of(2024, 6, 15), "Annual Math Competition");
        Event event2 = new Event("Science Fair", LocalDate.of(2024, 7, 20), "Annual Science Fair");

        calendar.addEvent(event1);
        calendar.addEvent(event2);

        List<Event> events = calendar.viewEvents();
        for (Event event : events) {
            event.displayEvent();
        }

        calendar.removeEvent(event1);

        events = calendar.viewEvents();
        for (Event event : events) {
            event.displayEvent();
        }

        // Example 4: User Management and Profiles
        Admin admin = new Admin("admin", "admin@school.com", "admin123");
        Teacher teacher = new Teacher("teacher1", "teacher1@school.com", "teach123");
        Student student = new Student("student1", "student1@school.com", "stud123");

        admin.displayUser();
        teacher.displayUser();
        student.displayUser();

        admin.manageUser(teacher);
        teacher.manageClass();
        student.attendClass();
    }
}
