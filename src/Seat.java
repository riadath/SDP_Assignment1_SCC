public interface Seat {
    String seatType();

    int getSeatCount();
}

//implement seat type : private car seat, racing car seat, SUV seat, Military car seat

class PrivateCarSeat implements Seat {
    @Override
    public String seatType() {
        return "Private Car Seat";
    }

    @Override
    public int getSeatCount() {
        return 5;
    }
}

class RacingCarSeat implements Seat {
    @Override
    public String seatType() {
        return "Racing Car Seat";
    }

    @Override
    public int getSeatCount() {
        return 1;
    }
}

class SUVCarSeat implements Seat {
    @Override
    public String seatType() {
        return "SUV Seat";
    }

    @Override
    public int getSeatCount() {
        return 15;
    }
}

class MilitaryCarSeat implements Seat {
    @Override
    public String seatType() {
        return "Military Car Seat";
    }

    @Override
    public int getSeatCount() {
        return 7;
    }
}