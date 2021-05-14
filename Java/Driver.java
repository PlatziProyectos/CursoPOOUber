public class Driver extends Account {

    public Driver(Integer id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Driver [" + super.toString() + "]";
    }
}
