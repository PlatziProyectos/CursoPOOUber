public class User extends Account {

    public User(Integer id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "User [" + super.toString() + "]";
    }
    
}
