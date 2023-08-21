class ThickRainShieldDecorator extends CarDecorator{
    public ThickRainShieldDecorator(Car car) {
        this.car = car;
    }
    @Override
    public double getCarPrice() {
        return car.getCarPrice() + 1000;
    }
    @Override
    public String getCarDetails() {
        return car.getCarDetails() + "\nThick Rain Shield";
    }
}

class ThinRainShieldDecorator extends CarDecorator{
    public ThinRainShieldDecorator(Car car) {
        this.car = car;
    }
    @Override
    public double getCarPrice() {
        return car.getCarPrice() + 500;
    }
    @Override
    public String getCarDetails() {
        return car.getCarDetails() + "\nThin Rain Shield";
    }
}

class CurvedRainShieldDecorator extends CarDecorator{
    public CurvedRainShieldDecorator(Car car) {
        this.car = car;
    }
    @Override
    public double getCarPrice() {
        return car.getCarPrice() + 1500;
    }
    @Override
    public String getCarDetails() {
        return car.getCarDetails() + "\nCurved Rain Shield";
    }
}