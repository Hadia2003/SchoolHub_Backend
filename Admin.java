class Admin extends User {

    public Admin(String username, String email, String password) {
        super(username, email, password);
    }

    public void manageUser(User user) {
        System.out.println("Managing user: " + user.username);
    }
}
