package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnviadoTest {

    @Test
    void deveMudarParaEntregueAoEntregarPedidoEnviado() {
        Pedido pedido = new Pedido("P007");
        pedido.setStatus(new Enviado());
        pedido.getStatus().entregar(pedido);
        assertEquals("Entregue", pedido.getStatus().getNomeStatus());
    }

    @Test
    void deveLancarExcecaoAoCancelarPedidoEnviado() {
        Pedido pedido = new Pedido("P008");
        pedido.setStatus(new Enviado());
        assertThrows(IllegalStateException.class, () -> pedido.getStatus().cancelar(pedido));
    }
}