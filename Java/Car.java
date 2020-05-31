class Car {
    Integer id; 
    String license;
    Account driver; 
    Integer passenger; 

    public Car(String license, Account driver){

        this.license = license;
        this.driver = driver;

    }

    void printDataCar(){
        if (passenger != null) {
            System.out.println("Licence: " + license);
            System.out.println("Name Driver: " + driver.name);
            System.out.println("Pasajeros: " + passenger);
        }
        
    }

    /* Integer es el tipo de dato que devolveré ->*/
    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        
        if (passenger == 4) {
            this.passenger = passenger;            
        } else {
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }
}