<?php 
    require_once('car.php');
    require_once('uberX.php');
    require_once('account.php');
    require_once('payment.php');
    require_once('route.php');

    $car = new Car(123, "AW456", new Account(123,"Wilson Neira"));
    $car->toString();
    echo "<br/>";

    $uberX = new UberX(124, "AED34", new Account(124, "Gustavo Super"), "CherryQQ", "verano2021");
    $uberX->toString();
    echo "<br/>";

    $payment = new Payment(123);
    $payment->toString();
    echo "<br/>";

    $route = new Route(223);
    $route->toString();

?>