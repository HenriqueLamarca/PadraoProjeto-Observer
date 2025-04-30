package padroescomportamentais.observer;

public class Pendente extends StatusPedido {
    @Override
    public void aprovar(Pedido pedido) {
        pedido.setStatus(new Processando());
    }
    @Override
    public void cancelar(Pedido pedido) {
        pedido.setStatus(new Cancelado());
    }
}