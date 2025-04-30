package padroescomportamentais.observer;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String id;
    private StatusPedido status;
    private List<Observer> observers = new ArrayList<>();

    public Pedido(String id) {
        this.id = id;
        this.status = new Pendente(); // Estado inicial
    }


    public String getId() { return id; }
    public StatusPedido getStatus() { return status; }


    public void setStatus(StatusPedido status) {
        this.status = status;
        notificarObservers();
    }


    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notificarObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

}