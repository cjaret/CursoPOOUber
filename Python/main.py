""" Importar la clase:  """
from car import Car 
""" car es el nombre del archivo: importamos del archivo car.py, la clase Car """

if __name__ == "__main__":
    print("Hola, perras")
    """ Creamos el objeto. En python no necesitamos colocar el tipo de dato """
    car = Car()
    """ Empezamos a utilizar los atributos declarados en la clase car.py:  """
    car.license = "AME234"
    car.driver = "Andrés H."

    """ Para imprimir los datos en python ya no necesito crear un método especial, solo colocamos vars dentro del print y le pasamos el objeto como parámetro"""
    print(vars(car))

    """ Lo imprime en formato json, se puede formatear con un método """
    """ ------------------------------------------------------------ """

    car2 = Car()
    car2.license = "QDE355"
    car2.driver = "Anita"
    print(vars(car2))
