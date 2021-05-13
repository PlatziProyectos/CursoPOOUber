public class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passegenger;

    public Car(Integer id, String license, Account driver) {
        this.id = id;
        this.license = license;
        this.driver = driver;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLicense() {
        return license;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public String getDriver() {
        return driver;
    }
    public void setDriver(String driver) {
        this.driver = driver;
    }
    public Integer getPassegenger() {
        return passegenger;
    }
    public void setPassegenger(Integer passegenger) {
        this.passegenger = passegenger;
    }

    @Override
    public String toString() {
        return "Car [driver=" + driver + ", id=" + id + ", license=" + license + ", passegenger=" + passegenger + "]";
    }
    
}
