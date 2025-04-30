package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoNormalFactoryTest {

    @Test
    public void deveCriarPedidoComStatusPendente() {
        PedidoFactory factory = new PedidoNormalFactory();
        Pedido pedido = factory.criarPedido("P007");
        assertEquals("Pendente", pedido.getStatus().getNomeStatus());
    }

    @Test
    public void deveNotificarObserverAoMudarStatus() {
        PedidoFactory factory = new PedidoNormalFactory();
        Pedido pedido = factory.novoPedido("P008");
        Notificacao notificacao = new Notificacao();
        pedido.addObserver(notificacao);

        pedido.setStatus(new Processando());
        assertNotNull(notificacao.getUltimaMensagem());
        assertEquals("[Status] Pedido P008 atualizado para: Processando",
                notificacao.getUltimaMensagem());
    }
}