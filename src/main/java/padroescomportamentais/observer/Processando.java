package padroescomportamentais.observer;

public class Processando extends StatusPedido {
    @Override
    public void enviar(Pedido pedido) {
        pedido.setStatus(new Enviado());
    }
}