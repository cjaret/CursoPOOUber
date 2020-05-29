import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car{
    Map<String /* Marca */, ArrayList<String, Integer/* Modelo y año */>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    
    public UberBlack(String license, final Account driver, Map<String, ArrayList<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}