from account import Account
class Car:
    id          = int
    license     = str
    driver      = Account("", "") 
    passegenger = int

    def __init__(self, id, license, driver):
        self.id = id
        self.license = license
        self.driver = driver