class Car {
    Integer id; /* Variables globales respecto a la clase */
    String license;
    Account driver; /* Cambiamos el tipo de dato para driver de String a tipo Account porque en nuestro diagrama de herencia driver hereda de account */
    Integer passenger; 

    /* Método constructor: */

    public Car(/* Aquí dentro colocamos los parámetros que quiero que sean obligatorios para que se cree un objeto de tipo Car */ String license, Account driver/* A estos parámetros se les acostumbra poner (buena práctica), el mismo nombre  de los atributos arriba declarados. Es buena práctica porque de esta forma es más consistente la información y es más intuitivo programar.*/ /* Estos parámetros están siendo declarados de manera local al método Car*/){

        /* Si quiero que cuando alguien le pase un dato a license automáticamente se inicialice el atributo license de la Clase, lo que tenemos que hacer es llamar a ese atributo */

        this.license = license;
        this.driver = driver;

        /* Al colocar this vamos a tener acceso a todos los atributos de esta clase (Car.java), incluso a los métodos como el que se encuentra abajo de este método constructor */
        

    }

    void printDataCar(){
        System.out.println("Licence: " + license);
        System.out.println("Name Driver: " + driver.name); /* Por ser  un atributo derivado de Account */
    }
}