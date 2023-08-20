
class RacingCar extends Car{
    public RacingCar(Engine engine, Tire tire, Chassis chassis, AC ac, Color color, BodyDesign bodyDesign, AutomatedAI automatedAI, Seat seat) {
        this.engine = engine;
        this.tire = tire;
        this.chassis = chassis;
        this.ac = ac;
        this.color = color;
        this.bodyDesign = bodyDesign;
        this.automatedAI = automatedAI;
        this.seat = seat;
    }



    @Override
    public double getCarPrice() {
        return engine.getEnginePrice() + tire.getTirePrice() + chassis.getChassisPrice() + ac.getACPrice() + color.getColorPrice() + bodyDesign.getBodyDesignPrice() + automatedAI.getCost();
    }

    @Override
    public String getCarDetails() {
        return "Racing Car Details: " + engine.getEngineType() + ", " + tire.getTireType() + ", " + chassis.getChassisPrice() + ", " + ac.getACType() + ", " + color.getColorType() + ", " + bodyDesign.getBodyDesignType() + ", " + automatedAI.getRegion() + ", " + seat.seatType();
    }
}