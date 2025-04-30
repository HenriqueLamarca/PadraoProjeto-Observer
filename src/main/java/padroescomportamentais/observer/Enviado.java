package padroescomportamentais.observer;

public class Enviado extends StatusPedido {

    @Override
    public void entregar(Pedido pedido) {
        pedido.setStatus(new Entregue());
    }

    @Override
    public void cancelar(Pedido pedido) {
        throw new IllegalStateException("Pedido enviado não pode ser cancelado.");
    }
}