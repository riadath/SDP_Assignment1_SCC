
public abstract class CarShop {
    Car car;
    public static CarFactory getCarFactory(CarType carType){
        return switch (carType) {
            case RACING -> new RacingCarFactory();
            case PRIVATE -> new PrivateCarFactory();
            case SUV -> new SUVCarFactory();
            case MILITARY -> new MilitaryCarFactory();
            default -> null;
        };
    }
    abstract Car orderCar(String color,CarType carType);
}

//implement CarShop for FordUSA, FordAsia, FerrariUSA, FerrariAsia, BMWUSA, BMWAsia, ToyotaUSA, ToyotaAsia

class FordUSA extends CarShop{

    @Override
    public Car orderCar(String color, CarType carType) {
        CarFactory carFactory = getCarFactory(carType);
        car = carFactory.createCar(color, "USA", "Ford");
        return car;
    }
}
class FordAsia extends CarShop{
    @Override
    public Car orderCar(String color, CarType carType) {
        CarFactory carFactory = getCarFactory(carType);
        car = carFactory.createCar(color, "Asia", "Ford");
        return car;
    }
}

class FerrariUSA extends CarShop{
    @Override
    public Car orderCar(String color, CarType carType) {
        CarFactory carFactory = getCarFactory(carType);
        car = carFactory.createCar(color, "USA", "Ferrari");
        return car;
    }
}
class FerrariAsia extends CarShop{
    @Override
    public Car orderCar(String color, CarType carType) {
        CarFactory carFactory = getCarFactory(carType);
        car = carFactory.createCar(color, "Asia", "Ferrari");
        return car;
    }
}
class BMWUSA extends CarShop{
    @Override
    public Car orderCar(String color, CarType carType) {
        CarFactory carFactory = getCarFactory(carType);
        car = carFactory.createCar(color, "USA", "BMW");
        return car;
    }
}
class BMWAsia extends CarShop{
    @Override
    public Car orderCar(String color, CarType carType) {
        CarFactory carFactory = getCarFactory(carType);
        car = carFactory.createCar(color, "Asia", "BMW");
        return car;
    }
}
class ToyotaUSA extends CarShop{
    @Override
    public Car orderCar(String color, CarType carType) {
        CarFactory carFactory = getCarFactory(carType);
        car = carFactory.createCar(color, "USA", "Toyota");
        return car;
    }
}
class ToyotaAsia extends CarShop{
    @Override
    public Car orderCar(String color, CarType carType) {
        CarFactory carFactory = getCarFactory(carType);
        car = carFactory.createCar(color, "Asia", "Toyota");
        return car;
    }
}


