public interface AC {
    public String getACType();
    public double getACPrice();
}

class HighPoweredAC implements AC {
    @Override
    public String getACType() {
        return "HighPowered";
    }

    @Override
    public double getACPrice() {
        return 100000;
    }
}

class LowPoweredAC implements AC {
    @Override
    public String getACType() {
        return "LowPowered";
    }

    @Override
    public double getACPrice() {
        return 200000;
    }
}