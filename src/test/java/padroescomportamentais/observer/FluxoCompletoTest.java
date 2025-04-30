package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FluxoCompletoTest {

    @Test
    void deveExecutarFluxoNormalComNotificacoes() {
        PedidoFactory factory = new PedidoNormalFactory();
        Pedido pedido = factory.novoPedido("P020");
        Notificacao notificacao = new Notificacao();
        pedido.addObserver(notificacao);

        // Pendente -> Processando
        pedido.getStatus().aprovar(pedido);
        assertEquals("Processando", pedido.getStatus().getNomeStatus());
        assertEquals("[Status] Pedido P020 atualizado para: Processando", notificacao.getUltimaMensagem());

        // Processando -> Enviado
        pedido.getStatus().enviar(pedido);
        assertEquals("Enviado", pedido.getStatus().getNomeStatus());

        // Enviado -> Entregue
        pedido.getStatus().entregar(pedido);
        assertEquals("Entregue", pedido.getStatus().getNomeStatus());
    }

    @Test
    void deveLancarExcecoesParaTransicoesInvalidas() {
        Pedido pedido = new Pedido("P021");
        pedido.setStatus(new Cancelado());

        assertAll(
                () -> assertThrows(IllegalStateException.class, () -> pedido.getStatus().aprovar(pedido)),
                () -> assertThrows(IllegalStateException.class, () -> pedido.getStatus().enviar(pedido)),
                () -> assertThrows(IllegalStateException.class, () -> pedido.getStatus().entregar(pedido))
        );
    }
}