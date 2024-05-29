import java.util.*;
public class SchoolProfile extends Profile {
    private List<String> facilities;
    private List<String> faculty;
    private List<String> programsOffered;

    public SchoolProfile(String name, String location, String contactDetails, List<String> facilities, List<String> faculty, List<String> programsOffered) {
        super(name, location, contactDetails);
        this.facilities = facilities;
        this.faculty = faculty;
        this.programsOffered = programsOffered;
    }

    @Override
    public void displayProfile() {
        System.out.println("School Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Contact: " + contactDetails);
        System.out.println("Facilities: " + facilities);
        System.out.println("Faculty: " + faculty);
        System.out.println("Programs Offered: " + programsOffered);
    }

    public void updateProfile(String name, String location, String contactDetails, List<String> facilities, List<String> faculty, List<String> programsOffered) {
        this.name = name;
        this.location = location;
        this.contactDetails = contactDetails;
        this.facilities = facilities;
        this.faculty = faculty;
        this.programsOffered = programsOffered;
    }
}

