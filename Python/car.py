from account import Account

class Car:
    id = int
    license = str
    driver = Account("","")
    """ driver ahora es de tipo Account y como ves está solicitando los dos datos obligatorios para instanciar un objeto de este tipo.  """
    passenger = int

    def __init__(self, license, driver):
        self.license = license
        self.driver = driver