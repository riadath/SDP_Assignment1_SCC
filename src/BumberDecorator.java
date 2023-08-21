class LoosenBigBumperDecorator extends CarDecorator{
    public LoosenBigBumperDecorator(Car car) {
        this.car = car;
    }
    @Override
    public double getCarPrice() {
        return car.getCarPrice() + 1000;
    }
    @Override
    public String getCarDetails() {
        return car.getCarDetails() + "\nLoosen Big Bumper";
    }
}

class TightSmallBumperDecorator extends CarDecorator{
    public TightSmallBumperDecorator(Car car) {
        this.car = car;
    }
    @Override
    public double getCarPrice() {
        return car.getCarPrice() + 500;
    }
    @Override
    public String getCarDetails() {
        return car.getCarDetails() + "\nTight Small Bumper";
    }
}


