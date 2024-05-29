class Teacher extends User {

    public Teacher(String username, String email, String password) {
        super(username, email, password);
    }

    public void manageClass() {
        System.out.println("Managing class.");
    }
}

