package padroescomportamentais.observer;

public class Entregue extends StatusPedido {

    @Override
    public void aprovar(Pedido pedido) {
        throw new IllegalStateException("[ERRO] Pedido entregue não pode ser reprocessado.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        throw new IllegalStateException("[ERRO] Pedido entregue não pode ser cancelado.");
    }

    @Override
    public void enviar(Pedido pedido) {
        throw new IllegalStateException("[ERRO] Pedido já foi entregue.");
    }

    @Override
    public void entregar(Pedido pedido) {
        throw new IllegalStateException("[ERRO] Pedido já está no estado ENTREGUE.");
    }
}