public interface Chassis {
    public String getChassisType();
    public double getChassisPrice();
}


class TabularChassis implements Chassis {
    @Override
    public String getChassisType() {
        return "Tabular";
    }

    @Override
    public double getChassisPrice() {
        return 100000;
    }
}
class BackboneChassis implements Chassis {
    @Override
    public String getChassisType() {
        return "Backbone";
    }

    @Override
    public double getChassisPrice() {
        return 200000;
    }
}
 class LadderFrameChassis implements Chassis {
    @Override
    public String getChassisType() {
        return "LadderFrame";
    }

    @Override
    public double getChassisPrice() {
        return 300000;
    }
}


