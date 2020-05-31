class UberX extends Car{

    String brand;
    String model;
    
    public UberX(String license, Account driver, String brand, String model){
        super(license, driver); 

        this.brand = brand;
        this.model = model;

    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 4){
            super.setPassenger(passenger);
        } else {
            System.out.println("UberVan needs 4 passengers assigned");
        }
    }

    @Override /* Más polimorfismo */
    void printDataCar() {
        super.printDataCar();
        System.out.println("Modelo: " + model);
        System.out.println("Marca: " + brand);
    }
}