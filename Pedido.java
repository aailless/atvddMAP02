import java.util.ArrayList;
import java.util.List;

public class Pedido implements Subject {

    private StatusPedido status;
    private List<Observer> observers;

    public Pedido() {
        this.status = StatusPedido.RECEBIDO;
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
        notifyObservers();
    }
}