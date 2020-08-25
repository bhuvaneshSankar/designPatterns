import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Channel implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String channelName;
    private String status;

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void notifyObservers() {
        System.out.println("notify...");
        observers.stream()
            .forEach(observer -> observer.update("updated...");;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}