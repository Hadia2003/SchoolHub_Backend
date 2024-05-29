class Student extends User {

    public Student(String username, String email, String password) {
        super(username, email, password);
    }

    public void attendClass() {
        System.out.println("Attending class.");
    }
}
