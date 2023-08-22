package NotifierSubscriber;

public class Subscriber {
    private final String name;
    private final String email;

    public Subscriber(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void requestSubscription(){
        NotificationSystem.getInstance().addSubscriber(this);
    }
    public void update(String updateInfo){
        System.out.println("Dear Customer " + name + " " + updateInfo);
    }
}
