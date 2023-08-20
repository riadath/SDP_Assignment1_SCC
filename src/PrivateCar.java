class PrivateCar extends Car{
    public PrivateCar(Engine engine, Tire tire, Chassis chesis, AC ac, Color color, BodyDesign bodyDesign, AutomatedAI automatedAI, Seat seat) {
        this.engine = engine;
        this.tire = tire;
        this.chassis = chesis;
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
        return "Private Car Details: " + engine.getEngineType() + ", " + tire.getTireType() + ", " + chassis.getChassisType() + ", " + ac.getACType() + ", " + color.getColorType() + ", " + bodyDesign.getBodyDesignType() + ", " + automatedAI.getRegion() + ", " + seat.seatType();
    }
}