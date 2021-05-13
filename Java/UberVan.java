import java.util.List;
import java.util.Map;

public class UberVan extends Car{
    
    private Map<String, Map<String,Integer>> typeCarAccepted;
    private List<String> seatsMaterial;

    public UberVan(Integer id, String license, Account driver,
    Map<String, Map<String,Integer>> typeCarAccepted, List<String> seatsMaterial) {
        super(id, license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
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

}
