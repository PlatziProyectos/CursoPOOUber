public class Efectivo extends Payment {

    public Efectivo(Integer id) {
        super(id);
    }

    @Override
    public String toString() {
        return "Efectivo [ " + super.toString() +"]";
    }

    
    
}