public class PayPal extends Payment{

    public PayPal(Integer id) {
        super(id);
        
    }

    @Override
    public String toString() {
        return "PayPal [" + super.toString() + "]";
    }
    
}
