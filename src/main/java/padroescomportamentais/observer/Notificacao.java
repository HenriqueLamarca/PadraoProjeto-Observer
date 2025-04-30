package padroescomportamentais.observer;

public class Notificacao implements Observer {
    private String ultimaMensagem;

    @Override
    public void update(Pedido pedido) {
        this.ultimaMensagem = gerarMensagem(pedido);
    }

    private String gerarMensagem(Pedido pedido) {
        return "[Status] Pedido " + pedido.getId() + " atualizado para: " + pedido.getStatus();
    }

    public String getUltimaMensagem() {
        return ultimaMensagem;
    }
}