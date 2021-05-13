from car import Car
from account import Account
from payment import Payment
from route import Route

if __name__ == "__main__":
    print("Hola Mundo")
    carro = Car(123, "MQL343", Account(123, "Wilson Neira"))
    print(vars(carro))
    print(vars(carro.driver))

    payment = Payment(123)
    print(vars(payment))

    route = Route(123)
    print(vars(route))


