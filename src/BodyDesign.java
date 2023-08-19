public interface BodyDesign {
    public String getBodyDesignType();
    public double getBodyDesignPrice();
}

//implement body design for Ford, Ferrari, Toyota, BMW, Chevrolet

class FordBodyDesign implements BodyDesign {
    @Override
    public String getBodyDesignType() {
        return "Ford";
    }

    @Override
    public double getBodyDesignPrice() {
        return 100000;
    }
}
class FerrariBodyDesign implements BodyDesign {
    @Override
    public String getBodyDesignType() {
        return "Ferrari";
    }

    @Override
    public double getBodyDesignPrice() {
        return 200000;
    }
}
class ToyotaBodyDesign implements BodyDesign {
    @Override
    public String getBodyDesignType() {
        return "Toyota";
    }

    @Override
    public double getBodyDesignPrice() {
        return 300000;
    }
}
class BMWBodyDesign implements BodyDesign {
    @Override
    public String getBodyDesignType() {
        return "BMW";
    }

    @Override
    public double getBodyDesignPrice() {
        return 400000;
    }
}

