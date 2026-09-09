import java.util.Optional;

public class UserService {

    public Optional<User> fetchUser(int id){
        if (id  == 1001){
            User user = new User();
            user.setId(1001);
            user.setName("Shayan");
            return Optional.of(user);
        }
        return  Optional.empty();

    }
}
