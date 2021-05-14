from account import Account

class User(Account):
    def __init__(self, id, name):
        super().__init__(id, name)