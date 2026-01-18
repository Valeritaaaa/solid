public class Account {
    Validator validator = new Validator();
    public void registerUser(User user) {
        if (validator.validateUsername(user.getUsername()) && validator.validatePassword(user.getPassword())) {
            System.out.println("User registered successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public void loginUser(User user) {
        if (validator.validateUsername(user.getUsername()) && validator.validatePassword(user.getPassword())) {
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
