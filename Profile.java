abstract class Profile {
    protected String name;
    protected String location;
    protected String contactDetails;

    public Profile(String name, String location, String contactDetails) {
        this.name = name;
        this.location = location;
        this.contactDetails = contactDetails;
    }

    public abstract void displayProfile();
}

