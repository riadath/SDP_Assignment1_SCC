public interface Chassis {
    public String getChesisType();
    public double getChesisPrice();
}


class TabularChassis implements Chassis {
    @Override
    public String getChesisType() {
        return "Tabular";
    }

    @Override
    public double getChesisPrice() {
        return 100000;
    }
}
class BackboneChassis implements Chassis {
    @Override
    public String getChesisType() {
        return "Backbone";
    }

    @Override
    public double getChesisPrice() {
        return 200000;
    }
}
 class LadderFrameChassis implements Chassis {
    @Override
    public String getChesisType() {
        return "LadderFrame";
    }

    @Override
    public double getChesisPrice() {
        return 300000;
    }
}


