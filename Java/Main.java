class Main {
    public static void main(String[] args) {
        System.out.println("Hola, perras");

        /* Vamos a crear un objeto, vamos a empezar creando objetos de la clase Car; En Java una un objeto debe comenzar por el tipo de clase. */

        Car car = new Car("AMQ123", new Account("Andrés", "GTR435")); /* Con el método constructor actualizado en Car.java, en una linea de código ya estoy creando un car con lo mínimo necesario para que exista */

        /* Con la creación del método constructor en Car.java el método constructor vació que estaba antes se pierde *//* ------------------------- */
        /* Atributos de la clase que utilizará el objeto car*/
        /* car.license = "AMQ123"; */ /* Comentamos estos porque ya no se necesita */
        /* car.driver = "Andrés Herrera"; */
        car.passenger = 4;

        car.printDataCar(); /* Accedo al dato asignado al atributo licencia con el método printDataCar creado en la clase Car.java */
        /* De esta forma con objetos estamos accediendo a los métodos y a los atributos de una clase */

        /* ---------------------------  */

        /* Dar de alta otro objeto: */
        Car car2 = new Car("AMW356", new Account("Andrea H.", "TDD334"));
        car2.passenger = 2;
        car2.printDataCar();

    }

}