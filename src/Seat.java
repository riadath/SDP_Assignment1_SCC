public interface Seat {
    public String seatType();
    public double seatPrice();
}

//implement seat type : private car seat, racing car seat, SUV seat, Military car seat

class PrivateCarSeat implements Seat {
    @Override
    public String seatType() {
        return "Private Car Seat";
    }

    @Override
    public double seatPrice() {
        return 1000;
    }
}

class RacingCarSeat implements Seat {
    @Override
    public String seatType() {
        return "Racing Car Seat";
    }

    @Override
    public double seatPrice() {
        return 2000;
    }
}

class SUVSeat implements Seat {
    @Override
    public String seatType() {
        return "SUV Seat";
    }

    @Override
    public double seatPrice() {
        return 3000;
    }
}

class MilitaryCarSeat implements Seat {
    @Override
    public String seatType() {
        return "Military Car Seat";
    }

    @Override
    public double seatPrice() {
        return 4000;
    }
}

