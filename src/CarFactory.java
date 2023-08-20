public abstract class CarFactory {
    Car car;
    public abstract Car createCar();
}

class FordCardFactory extends CarFactory {
    @Override
    public Car createCar() {
       return car;
    }
}
