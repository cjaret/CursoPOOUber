class Car {
    Integer id;
    String license;
    String driver;
    Integer passenger; 

    /* Vamos a declarar un método que me sirva para estar trayendo los datos de esta clase: */

    void printDataCar(){
        System.out.println("Licence: " + license);
        System.out.println("Driver: " + driver);
    }
}