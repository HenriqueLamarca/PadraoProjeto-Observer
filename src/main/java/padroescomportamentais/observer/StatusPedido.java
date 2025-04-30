package padroescomportamentais.observer;

public abstract class StatusPedido {

    public void aprovar(Pedido pedido) {
        throw new IllegalStateException("Operação 'aprovar' não permitida para o estado atual.");
    }

    public void cancelar(Pedido pedido) {
        throw new IllegalStateException("Operação 'cancelar' não permitida para o estado atual.");
    }

    public void enviar(Pedido pedido) {
        throw new IllegalStateException("Operação 'enviar' não permitida para o estado atual.");
    }

    public void entregar(Pedido pedido) {
        throw new IllegalStateException("Operação 'entregar' não permitida para o estado atual.");
    }

    public String getNomeStatus() {
        return this.getClass().getSimpleName();
    }
}