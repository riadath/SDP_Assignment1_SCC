public class Main {
    public static void main(String[] args) {
        //test Car class
        FordUSA fordUSA = new FordUSA();
        Car car = fordUSA.orderCar("Red", CarType.RACING);
        System.out.println(car.getCarDetails());
        System.out.println("====================================");
        FerrariAsia ferrariAsia = new FerrariAsia();
        car = ferrariAsia.orderCar("White", CarType.SUV);
        System.out.println(car.getCarDetails());
        System.out.println("====================================");
        BMWUSA bmwUSA = new BMWUSA();
        car = bmwUSA.orderCar("Black", CarType.PRIVATE);
        System.out.println(car.getCarDetails());
        System.out.println("====================================");
        ToyotaAsia toyotaAsia = new ToyotaAsia();
        car = toyotaAsia.orderCar("White", CarType.MILITARY);
        System.out.println(car.getCarDetails());
        System.out.println("====================================");

    }
}

