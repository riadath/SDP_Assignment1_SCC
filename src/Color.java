public interface Color {
    public String getColorType();
    public double getColorPrice();
}


//implement for red , white , grey, black
class RedColor implements Color {
    @Override
    public String getColorType() {
        return "Red";
    }

    @Override
    public double getColorPrice() {
        return 100000;
    }
}

class WhiteColor implements Color {
    @Override
    public String getColorType() {
        return "White";
    }

    @Override
    public double getColorPrice() {
        return 200000;
    }
}

class GreyColor implements Color {
    @Override
    public String getColorType() {
        return "Grey";
    }

    @Override
    public double getColorPrice() {
        return 300000;
    }
}

class BlackColor implements Color {
    @Override
    public String getColorType() {
        return "Black";
    }

    @Override
    public double getColorPrice() {
        return 400000;
    }
}
