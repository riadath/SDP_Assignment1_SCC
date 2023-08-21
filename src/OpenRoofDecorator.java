public class OpenRoofDecorator extends CarDecorator{
    public OpenRoofDecorator(Car car) {
        this.car = car;
    }
    @Override
    public double getCarPrice() {
        return car.getCarPrice() + 1000;
    }
    @Override
    public String getCarDetails() {
        return car.getCarDetails() + "\nOpen Roof";
    }
}

