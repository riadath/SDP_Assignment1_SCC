public interface Tire {
    public String getTireType();
    public double getTirePrice();
}
class SnowTire implements Tire {
    @Override
    public String getTireType() {
        return "Snow";
    }

    @Override
    public double getTirePrice() {
        return 10000;
    }
}

class SpareTire implements Tire {
    @Override
    public String getTireType() {
        return "Spare";
    }

    @Override
    public double getTirePrice() {
        return 20000;
    }
}

class WhitewallTire implements Tire {
    @Override
    public String getTireType() {
        return "Whitewall";
    }

    @Override
    public double getTirePrice() {
        return 30000;
    }
}


class SlickTire implements Tire {
    @Override
    public String getTireType() {
        return "Slick";
    }

    @Override
    public double getTirePrice() {
        return 40000;
    }
}











