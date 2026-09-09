import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        UserService service  = new UserService();

        Optional<User> opt = service.fetchUser(1001);
        if (opt.isPresent())
            System.out.println(opt.get().getName());
        else
            System.out.println("User not found ");



        opt.ifPresent(u -> System.out.println(u.getName()));
    }
}
