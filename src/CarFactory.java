public abstract class CarFactory {
    Car car;
    public abstract Car createCar(String color,String region,CarType carType,String brand);

    public static Color getColor(String color){
        if(color.equalsIgnoreCase("red")){
            return new RedColor();
        }
        else if(color.equalsIgnoreCase("white")){
            return new WhiteColor();
        }
        else if(color.equalsIgnoreCase("grey")){
            return new GreyColor();
        }
        else if(color.equalsIgnoreCase("black")){
            return new BlackColor();
        }
        return null;
    }
    public static BodyDesign getDesignByBrand(String design){
        if(design.equalsIgnoreCase("ferrari")){
            return new FerrariBodyDesign();
        }
        else if(design.equalsIgnoreCase("ford")){
            return new FordBodyDesign();
        }
        else if(design.equalsIgnoreCase("toyota")){
            return new ToyotaBodyDesign();
        }
        else if(design.equalsIgnoreCase("bmw")){
            return new BMWBodyDesign();
        }
        return null;
    }
    public static AutomatedAI getAutomatedAI(String region){
        if(region.equalsIgnoreCase("asia")){
            return new AsiaAutomatedAI();
        }
        else if(region.equalsIgnoreCase("usa")){
            return new USAAutomatedAI();
        }
        return null;
    }
}



class RacingCarFactory extends CarFactory {
    @Override
    public Car createCar(String color, String region, CarType carType, String brand)
    {
        car = new RacingCar(
                new CC1800(),
                new SlickTire(),
                new LadderFrameChassis(),
                new HighPoweredAC(),
                getColor(color),
                getDesignByBrand(brand),
                getAutomatedAI(region),
                new RacingCarSeat()
        );
        return car;
    }
}

class PrivateCarFactory extends CarFactory {
    @Override
    public Car createCar(String color, String region, CarType carType, String brand) {
        car = new PrivateCar(
                new CC1300(),
                new SpareTire(),
                new BackboneChassis(),
                new LowPoweredAC(),
                getColor(color),
                getDesignByBrand(brand),
                getAutomatedAI(region),
                new PrivateCarSeat()
        );
        return car;
    }
}

class SUVCarFactory extends CarFactory {
    @Override
    public Car createCar(String color, String region, CarType carType, String brand) {
        car = new SUV(
                new CC1700(),
                new WhitewallTire(),
                new LadderFrameChassis(),
                new HighPoweredAC(),
                getColor(color),
                getDesignByBrand(brand),
                getAutomatedAI(region),
                new SUVCarSeat()
        );
        return car;
    }
}

class MilitaryCarFactory extends CarFactory {
    @Override
    public Car createCar(String color, String region, CarType carType, String brand) {
        car = new MilitaryCar(
                new CC2100(),
                new SnowTire(),
                new LadderFrameChassis(),
                new HighPoweredAC(),
                getColor(color),
                getDesignByBrand(brand),
                getAutomatedAI(region),
                new MilitaryCarSeat()
        );
        return car;
    }
}
