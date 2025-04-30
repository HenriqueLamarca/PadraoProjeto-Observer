package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    void deveRetornarIdCorreto() {
        Pedido pedido = new Pedido("P017");
        assertEquals("P017", pedido.getId());
    }

    @Test
    void deveIniciarComStatusPendente() {
        Pedido pedido = new Pedido("P018");
        assertEquals("Pendente", pedido.getStatus().getNomeStatus());
    }

    @Test
    void deveNotificarTodosObservers() {
        Pedido pedido = new Pedido("P019");
        Notificacao obs1 = new Notificacao();
        Notificacao obs2 = new Notificacao();

        pedido.addObserver(obs1);
        pedido.addObserver(obs2);

        pedido.setStatus(new Processando());

        assertAll(
                () -> assertEquals("[Status] Pedido P019 atualizado para: Processando", obs1.getUltimaMensagem()),
                () -> assertEquals("[Status] Pedido P019 atualizado para: Processando", obs2.getUltimaMensagem())
        );
    }
}