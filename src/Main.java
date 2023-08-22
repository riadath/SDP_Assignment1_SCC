import NotifierSubscriber.NotificationSystem;
import NotifierSubscriber.Subscriber;

public class Main {
    public static void main(String[] args) {
        //car shop test
        System.out.println(" ___________________ Testing CarFactory ___________________");
        CarFactory carFactory = new RacingCarFactory();
        Car car = carFactory.createCar("Red", "Asia", "Ford");
        System.out.println(car.getCarDetails());
        carFactory = new PrivateCarFactory();
        car = carFactory.createCar("White", "Asia", "Ford");
        System.out.println(car.getCarDetails());



        System.out.println(" ___________________ Testing CarShop ___________________");
        CarShop carShop1 = new FordUSA();
        Car car1 = carShop1.orderCar("Red", CarType.RACING);
        Car car2 = carShop1.orderCar("White", CarType.SUV);
        Car car3 = carShop1.orderCar("Black", CarType.PRIVATE);
        System.out.println(car1.getCarDetails());
        System.out.println(car2.getCarDetails());
        System.out.println(car3.getCarDetails());


        System.out.println(" ___________________ Testing CarDecorator ___________________");
        //test CarDecorator
        CarShop carShop2 = new FordUSA();
        car = carShop2.orderCar("Red", CarType.RACING);
        car = new OpenRoofDecorator(car);
        car = new LoosenBigBumperDecorator(new CurvedRainShieldDecorator(car));
        System.out.println(car.getCarDetails());

        System.out.println(" ___________________ Testing Online System ___________________");

        //test notification system
        NotificationSystem notificationSystem = new NotificationSystem();
        System.out.println("Adding subscriber" + " John");
        notificationSystem.addSubscriber(new Subscriber("John","jhon@mailmail.com"));
        System.out.println("Adding subscriber" + " Mary");
        notificationSystem.addSubscriber(new Subscriber("Mary","mary@mailmail.com"));
        System.out.println("Adding subscriber" + " Peter");
        notificationSystem.addSubscriber(new Subscriber("Peter","mailmail.com@mail"));

        System.out.println("Notify price change");
        notificationSystem.notifyPriceChange();
        System.out.println("Notify feature change");
        notificationSystem.notifyFeatureChange();




    }
}

