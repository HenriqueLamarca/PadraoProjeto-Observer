package padroescomportamentais.observer;

public class PedidoNormalFactory extends PedidoFactory {
    @Override
    public Pedido criarPedido(String id) {
        return new Pedido(id); // Estado padrão: Pendente
    }
}