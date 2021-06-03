import org.mindrot.jbcrypt.BCrypt;

public class Application {
    public static void main(String[] args) {
        String password = "password123";
        System.out.println("password = " + password);

        // hash a string
        String hash = BCrypt.hashpw(password, BCrypt.gensalt());
        System.out.println("hash = " + hash);

        hash = BCrypt.hashpw(password, BCrypt.gensalt());
        System.out.println("hash = " + hash);


        String enteredPassword = "password123";
        boolean passwordsMatch = BCrypt.checkpw(enteredPassword, hash);
        System.out.println("passwordsMatch = " + passwordsMatch);


        passwordsMatch = BCrypt.checkpw("test1234", hash);
        System.out.println("passwordsMatch = " + passwordsMatch);

    }
}
