public class Main{
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car(1, "MQ123", new Account(1, "Wilson Neira"));
        System.out.println(car);
    }
}