class UberX extends Car{
    /* Atributos propios de esta clase:  */
    String brand;
    String model;

    /* Constructor que coincide con la clase padre:  */
    public UberX(String license, Account driver, String brand, String model){
        super(license, driver); /* Utilizamos la palabra super para referirnos al método constructor de la clase padre.
        
        Llamamos al método constructor de la clase Car*/

        this.brand = brand; /* This hace referencia a los atributos de la clase actual */0
        this.model = model;

        /* Con super automáticamente tenemos acceso a los atributos y métodos de la clase padre. */
    }
}