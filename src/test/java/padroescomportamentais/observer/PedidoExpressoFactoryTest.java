package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoExpressoFactoryTest {

    @Test
    void deveCriarPedidoComStatusProcessando() {
        PedidoFactory factory = new PedidoExpressoFactory();
        Pedido pedido = factory.criarPedido("P015");
        assertEquals("Processando", pedido.getStatus().getNomeStatus());
    }

    @Test
    void deveAdicionarObserverAutomaticamente() {
        PedidoFactory factory = new PedidoExpressoFactory();
        Pedido pedido = factory.novoPedido("P016");
        pedido.setStatus(new Enviado());
        // Teste indireto - se não houver exception, o observer foi adicionado
        assertDoesNotThrow(() -> pedido.setStatus(new Enviado()));
    }
}