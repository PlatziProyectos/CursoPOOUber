import java.util.List;
import java.util.Map;

public class UberBlack extends Car{
    private Map<String, Map<String,Integer>> typeCarAccepted;
    private List<String> seatsMaterial;

    public UberBlack(Integer id, String license, Account driver, Integer passegenger,
    Map<String, Map<String,Integer>> typeCarAccepted, List<String> seatsMaterial) {
        super(id, license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
        setPassegenger(passegenger);
    }

    public UberBlack(Integer id, String license, Account driver, Integer passegenger) {
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
    public void setPassegenger(Integer passegenger) {
        if (passegenger != null && passegenger==4){
            super.setPassegenger(passegenger); 
        } else {
            System.out.println("Debe ingresar 4 passegenger");
        }
    }

    @Override
    public String toString() {
        if (super.getPassegenger() != null) {
            return "UberBlack [seatsMaterial=" + seatsMaterial + ", typeCarAccepted=" + typeCarAccepted + ", " + super.toString()+ "]";
        }
        return "";
    }

}
