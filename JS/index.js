var car = new Car(123, "MQE654", new Account(123, "Wilson Neira"));
car.toString();

var carX = new UberX(124, "FEE4534", new Account(124, "Gustavo Super"), "CherryQQ", "Verano2021")
carX.toString();

var route = new Route(123);
route.toString();

var payment = new Payment(123);
payment.toString();

var driver = new Driver(13244, "Juan");
var carPool = new UberPool(1233,"dDD333", driver, "TOYOTA", "YARIS");
carPool.toString();