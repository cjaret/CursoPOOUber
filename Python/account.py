class Account:
    id = int
    name = str
    document = str 
    email = str
    password = str

    """ self es muy parecido a lo que venimos trabajando a otros lenguajes con this """
    
    def __init__(self, name, document):
        self.name = name 
        """ self hace referencia a los datos que componen la clase. En este caso self.name está llamando al atributo name que se encuentra en la línea 3 de la clase y, le está asignando el dato que pasa por en el método __init__ de la línea 10 """
        self.document = document