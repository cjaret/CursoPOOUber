class Main {
    public static void main(String[] args) {
        System.out.println("Hola, perras");

        UberX UberX = new UberX("AMQ123", new Account("Andrés", "GTR435"), "Tesla", "X"); 
        UberX.setPassenger(4);
        UberX.printDataCar(); 

        /* Car car2 = new Car("AMW356", new Account("Andrea H.", "TDD334"));
        car2.passenger = 2;
        car2.printDataCar(); */

    }

}