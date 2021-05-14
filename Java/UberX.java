public class UberX extends Car {
    private String brand;
    private String model;

    public UberX(Integer id, String license, Account driver,
        Integer passegenger, String brand, String model) {
        super(id, license, driver);
        setPassegenger(passegenger);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
            return "UberX [brand=" + brand + ", model=" + model + ", " + super.toString() + "]";
        }

        return "";
    }

    
    
}
