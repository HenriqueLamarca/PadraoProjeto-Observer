package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotificacaoTest {

    @Test
    public void deveAtualizarMensagemQuandoPedidoMudarStatus() {
        Pedido pedido = new Pedido("P009");
        Notificacao notificacao = new Notificacao();
        pedido.addObserver(notificacao);

        pedido.setStatus(new Processando());
        assertEquals("[Status] Pedido P009 atualizado para: Processando",
                notificacao.getUltimaMensagem());
    }

    @Test
    public void deveManterMensagemQuandoNaoHouveAtualizacao() {
        Notificacao notificacao = new Notificacao();
        assertNull(notificacao.getUltimaMensagem());
    }
}