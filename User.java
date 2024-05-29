class User {
    protected String username;
    protected String email;
    protected String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public void displayUser() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }
}
