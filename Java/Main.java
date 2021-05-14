public class Main{
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car(1, "MQ123", new Account(1, "Wilson Neira"));
        System.out.println(car);

        UberX uberX = new UberX(2, "RE#4455", new Account(2, "Gustavo Super"), 4, "CherryQQ", "2021");
        System.out.println(uberX);

        Driver driver = new Driver(12334, "Juan");
        UberPool uberPool = new UberPool(3, "UJHH645", driver, 3, "TOYOTA", "YARIS");
        System.out.println(uberPool);

        Driver driver2 = new Driver(12334, "Juan Morocho");
        UberVan uberVan = new UberVan(4, "UJHH645", driver2, 6);
        System.out.println(uberVan);

    }
}