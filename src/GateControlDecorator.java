class RemoteGateControlDecorator extends CarDecorator{
    public RemoteGateControlDecorator(Car car) {
        this.car = car;
    }
    @Override
    public double getCarPrice() {
        return car.getCarPrice() + 1000;
    }
    @Override
    public String getCarDetails() {
        return car.getCarDetails() + "\nRemote Gate Control";
    }
}

class MobileAppGateControlDecorator extends CarDecorator{
    public MobileAppGateControlDecorator(Car car) {
        this.car = car;
    }
    @Override
    public double getCarPrice() {
        return car.getCarPrice() + 500;
    }
    @Override
    public String getCarDetails() {
        return car.getCarDetails() + "\nMobile App Gate Control";
    }
}


