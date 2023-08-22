package NotifierSubscriber;

import java.util.ArrayList;
import java.util.List;

public class NotificationSystem {
    private List<Subscriber> subscriberList = new ArrayList<>();
    private static NotificationSystem notificationSystem;

    public static NotificationSystem getInstance(){
        if(notificationSystem == null){
            notificationSystem = new NotificationSystem();
        }
        return notificationSystem;
    }
    public void addSubscriber(Subscriber subscriber){
        subscriberList.add(subscriber);
    }
    public void removeSubscriber(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }
    public void notifyPriceChange(){
        for(Subscriber subscriber : subscriberList){
            subscriber.update("Price has changed");
        }
    }
    public void notifyFeatureChange(){
        for(Subscriber subscriber : subscriberList){
            subscriber.update("Feature has changed");
        }
    }



}
