class Car {
    private Integer id; 
    private String license;
    private Account driver; 
    private Integer passenger; 

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
        this.passenger = passenger;            
    }

    /* Getters and setters generados con clic derecho + source action en VSC -> */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    
}