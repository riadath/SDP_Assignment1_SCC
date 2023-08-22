package OnlineSystem;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        //test online system (command pattern)
        CentralOnlineSystem centralOnlineSystem = CentralOnlineSystem.getInstance();
        System.out.println(" ___________________ Testing Online System ___________________");
        Command command = new RequestCarServicingCommand("Akib",LocalDate.of(2021, 5, 10));
        centralOnlineSystem.addCommand(command);
        command = new RequestCarServicingCommand("Rahim", LocalDate.of(2021, 5, 10));
        centralOnlineSystem.addCommand(command);
        command = new RequestCarWashCommand("Karim", LocalDate.of(2021, 5, 10));
        centralOnlineSystem.addCommand(command);
        command = new RequestOnlineDeliveryCommand("Rahim", LocalDate.of(2021, 5, 10));
        centralOnlineSystem.addCommand(command);

        centralOnlineSystem.processCommand();
    }
}
