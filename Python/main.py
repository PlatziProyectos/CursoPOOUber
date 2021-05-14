from car import Car
from uberX import UberX
from uberPool import UberPool
from account import Account
from driver import Driver
from payment import Payment
from route import Route

if __name__ == "__main__":
    print("Hola Mundo")
    carro = Car(123, "MQL343", Account(123, "Wilson Neira"))
    print(vars(carro))
    print(vars(carro.driver))

    carroX = UberX(124, "KDJ3445", Account(124, "Gustavo Super"), "CherryQQ", "Verano2021")
    print(vars(carroX))
    
    payment = Payment(123)
    print(vars(payment))

    route = Route(123)
    print(vars(route))

    driver = Driver(345, "Juan")
    uberPool = UberPool(4747, "MDJD454", driver, "TOYOTA", "YARIS");
    print(vars(uberPool))
