var driver = new Driver("12345","Carlos", "CURP", "carlos@gmail.com", "bobo1234")
driver.printDataUser();

var car = new Car("QWT465", new Account("CDJR", "CURP"))
car.passenger = 4;
car.printDataCar();

var uberX = new UberX("RYE257", new Account("The great Daniel", "CURP"), "Tesla", "X")
uberX.passenger = 4;
uberX.printDataCar();