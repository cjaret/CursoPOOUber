class Main {
    public static void main(String[] args) {
        System.out.println("Hola, perras");

        /* Vamos a crear un objeto, vamos a empezar creando objetos de la clase Car; En Java una un objeto debe comenzar por el tipo de clase. */

        Car car = new Car(); /* A partir de aquí el objeto ya tiene vida en memoria. */

        /* El compilador de Java siempre nos va a proveer de un método constructor por defecto para todos nuestros objetos. Por eso no es necesario declarar el método en la clase Car. */

        /* Empezamos a utilizar los atributos declarados en la clase: */
        car.license = "AMQ123"; /* Le asignamos un dato al atribubto licencia */
        car.driver = "Andrés Herrera";
        car.passenger = 4;

        car.printDataCar(); /* Accedo al dato asignado al atributo licencia con el método printDataCar creado en la clase Car.java */
        /* De esta forma estamos accediendo a los métodos y a los atributos de una clase */

        /* ---------------------------  */

        /* Dar de alta otro objeto: */
        Car car2 = new Car();
        car2.license = "AMW123";
        car2.driver = "Andrea H.";
        car2.passenger = 2;
        car2.printDataCar();

    }

}