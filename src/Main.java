public class Main {
    public static void main(String[] args) {
        //car shop test
        CarShop carShop1 = new FordUSA();
        Car car1 = carShop1.orderCar("Red", CarType.RACING);
        Car car2 = carShop1.orderCar("White", CarType.SUV);
        Car car3 = carShop1.orderCar("Black", CarType.PRIVATE);
        System.out.println(car1.getCarDetails());
        System.out.println(car2.getCarDetails());
        System.out.println(car3.getCarDetails());

        //test CarDecorator
        CarShop carShop2 = new FordUSA();
        Car car = carShop2.orderCar("Red", CarType.RACING);
        car = new OpenRoofDecorator(car);
        car = new LoosenBigBumperDecorator(new CurvedRainShieldDecorator(car));
        System.out.println(car.getCarDetails());

        //test notification system
        NotificationSystem notificationSystem = new NotificationSystem();
        notificationSystem.addSubscriber(new Subscriber("John","jhon@mailmail.com"));
        notificationSystem.addSubscriber(new Subscriber("Mary","mary@mailmail.com"));
        notificationSystem.addSubscriber(new Subscriber("Peter","mailmail.com@mail"));

        notificationSystem.notifyPriceChange();
        notificationSystem.notifyFeatureChange();




    }
}

