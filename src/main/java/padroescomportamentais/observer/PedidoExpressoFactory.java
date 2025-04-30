package padroescomportamentais.observer;

public class PedidoExpressoFactory extends PedidoFactory {

    @Override
    public Pedido criarPedido(String id) {
        Pedido pedido = new Pedido(id);
        pedido.setStatus(new Processando()); // Já começa como "Processando"
        return pedido;
    }
}