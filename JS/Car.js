class Car {

    /* Si quisiéramos declarar un método, en esta nueva sintaxis dejaremos de utilizar la palabra clave function. */

    constructor(license, driver){
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }

    printDataCar(){
        console.log(this.driver)
        console.log(this.driver.name)
        console.log(this.driver.document)
    }
}