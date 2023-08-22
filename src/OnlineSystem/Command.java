package OnlineSystem;

import java.time.LocalDate;

public interface Command {
    void execute();
    LocalDate getDate();
}

class RequestCarServicingCommand implements Command{
    public String name;
    public LocalDate date;

    public RequestCarServicingCommand(String name, LocalDate date){
        this.name = name;
        this.date = date;
    }

    @Override
    public void execute() {
        System.out.println("Requesting car servicing for " + name + " on " + date);
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

}

class RequestCarWashCommand implements Command{
    public String name;
    public LocalDate date;

    public RequestCarWashCommand(String name, LocalDate date){
        this.name = name;
        this.date = date;
    }

    @Override
    public void execute() {
        System.out.println("Requesting car wash for " + name + " on " + date);
    }

    @Override
    public LocalDate getDate() {
        return date;
    }
}


class RequestOnlineDeliveryCommand implements Command{
    public String name;
    public LocalDate date;

    public RequestOnlineDeliveryCommand(String name, LocalDate date){
        this.name = name;
        this.date = date;
    }

    @Override
    public void execute() {
        System.out.println("Requesting online delivery for " + name + " on " + date);
    }

    @Override
    public LocalDate getDate() {
        return date;
    }
}


