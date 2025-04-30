package padroescomportamentais.observer;

public class Cancelado extends StatusPedido {

    @Override
    public void aprovar(Pedido pedido) {
        throw new IllegalStateException("Pedido cancelado não pode ser aprovado.");
    }

    @Override
    public void enviar(Pedido pedido) {
        throw new IllegalStateException("Pedido cancelado não pode ser enviado.");
    }
}