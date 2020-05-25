function Car(/* Aquí no es necesario colocar el tipo de dato */ license, driver /* <- Esto automáticamente lo toma como si fuera su método constructor y pasa los atributos de abajo como parámetros */){
    this.id;
    this.license = license; /* Aquí ya intancía directamente los datos */
    this.driver = driver;
    this.passenger;
}

/* Método para imprimir: */

Car.prototype.printDataCar = function(){
    console.log(this.driver)
    console.log(this.driver.name)
    console.log(this.driver.document)

}