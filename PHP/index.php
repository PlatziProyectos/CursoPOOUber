<?php 
    require_once('car.php');
    require_once('uberX.php');
    require_once('uberPool.php');
    require_once('uberVan.php');
    require_once('account.php');
    require_once('driver.php');
    require_once('payment.php');
    require_once('route.php');

    $car = new Car(123, "AW456", new Account(123,"Wilson Neira"));
    echo $car->__toString();
    echo "<br/>";

    $uberX = new UberX(124, "AED34", new Account(124, "Gustavo Super"), 4, "CherryQQ", "verano2021");
    echo $uberX->__toString();
    echo "<br/>";

    $payment = new Payment(123);
    echo $payment->__toString();
    echo "<br/>";

    $route = new Route(223);
    echo $route->__toString();
    echo "<br/>";

    $driver = new Driver(1233, "Juan");
    $uberPool = new UberPool(4554, "URH455", $driver, 4, "TOYOTA", "YARIS");
    echo $uberPool->__toString();
    echo "<br/>";

    $driver2 = new Driver(12335, "Juan Morocho");
    $uberVan = new UberVan(45544, "URH4554", $driver2, 6, array (), array ());
    echo $uberVan->__toString();
?>