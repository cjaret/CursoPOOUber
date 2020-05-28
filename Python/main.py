""" Estamos importando las dos clases que usaremos y las estamos instaciando en los métodos constructores: """

from car import Car 
from account import Account

if __name__ == "__main__":
    print("Hola, perras")
    
    """ Creamos el objeto. En python no necesitamos colocar el tipo de dato """
    car = Car("AWS354", Account("Andrés P.", "CURP743"))
    
    """ Para imprimir los datos en python ya no necesito crear un método especial, solo colocamos vars dentro del print y le pasamos el objeto como parámetro"""
    print(vars(car))
    print(vars(car.driver))