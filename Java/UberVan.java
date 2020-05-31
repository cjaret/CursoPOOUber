import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    public UberVan(String license, Account driver){
        super(license, driver);
    }

    @Override /* Estamos sobre-escribiendo el método passenger que proviene de la clase padre Car --> This is Polimorfismo */
    public void setPassenger(Integer passenger) {
        if (passenger == 6){
            super.setPassenger(passenger);
        } else {
            System.out.println("UberVan needs 6 passengers assigned");
        }
        
    }
}