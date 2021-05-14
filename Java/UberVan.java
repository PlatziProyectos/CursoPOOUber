import java.util.List;
import java.util.Map;

public class UberVan extends Car{
    
    private Map<String, Map<String,Integer>> typeCarAccepted;
    private List<String> seatsMaterial;

    public UberVan(Integer id, String license, Account driver, Integer passegenger,
    Map<String, Map<String,Integer>> typeCarAccepted, List<String> seatsMaterial) {
        super(id, license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
        setPassegenger(passegenger);
    }

    public UberVan(Integer id, String license, Account driver, Integer passegenger) {
        super(id, license, driver);
        setPassegenger(passegenger);
    }

    public Map<String, Map<String, Integer>> getTypeCarAccepted() {
        return typeCarAccepted;
    }

    public void setTypeCarAccepted(Map<String, Map<String, Integer>> typeCarAccepted) {
        this.typeCarAccepted = typeCarAccepted;
    }

    public List<String> getSeatsMaterial() {
        return seatsMaterial;
    }

    public void setSeatsMaterial(List<String> seatsMaterial) {
        this.seatsMaterial = seatsMaterial;
    }

    @Override
    public String toString() {
        if (super.getPassegenger() != null) {
            return "UberVan [seatsMaterial=" + seatsMaterial + ", typeCarAccepted=" + typeCarAccepted + ", " + super.toString()+ "]";
        }
        
        return "";
    }

    @Override
    public void setPassegenger(Integer passegenger) {
        if (passegenger != null && passegenger == 6) {
            super.setPassegenger(passegenger);
        } else {
            System.out.println("Debe ingresar 6 passegenger");
        }
    }

    
}
