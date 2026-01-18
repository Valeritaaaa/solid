public class Main {
    public static void main(String[] args) {
        User user = new User("john_doel", "Password123");
        Account account = new Account();
        account.registerUser(user);
        account.loginUser(user);
    }
}
