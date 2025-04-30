package padroescomportamentais.observer;

public class Notificacao implements Observer {

    @Override
    public String update(Pedido pedido) {
        return String.format("[Status] Pedido %s atualizado para: %s",
                pedido.getId(), pedido.getStatus().getClass().getSimpleName());
    }
}