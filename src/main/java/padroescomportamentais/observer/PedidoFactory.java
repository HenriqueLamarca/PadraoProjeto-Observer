package padroescomportamentais.observer;

public abstract class PedidoFactory {
    public abstract Pedido criarPedido(String id);

    public Pedido novoPedido(String id) {
        Pedido pedido = criarPedido(id);
        pedido.addObserver(new Notificacao());
        return pedido;
    }
}