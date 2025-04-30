package padroescomportamentais.observer;

public class PedidoService {
    private static class Holder {
        static final PedidoService INSTANCE = new PedidoService();
    }

    private PedidoService() {} // Construtor privado

    public static PedidoService getInstance() {
        return Holder.INSTANCE;
    }

    public void processarPedido(Pedido pedido) {
        pedido.getStatus().aprovar(pedido); // Delega para o State
    }
}