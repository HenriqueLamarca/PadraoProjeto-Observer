package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EntregueTest {

    @Test
    void deveLancarExcecaoAoAprovarPedidoEntregue() {
        Pedido pedido = new Pedido("P003");
        pedido.setStatus(new Entregue());
        assertThrows(IllegalStateException.class, () -> pedido.getStatus().aprovar(pedido));
    }

    @Test
    void deveLancarExcecaoAoCancelarPedidoEntregue() {
        Pedido pedido = new Pedido("P004");
        pedido.setStatus(new Entregue());
        assertThrows(IllegalStateException.class, () -> pedido.getStatus().cancelar(pedido));
    }

    @Test
    void deveLancarExcecaoAoEnviarPedidoEntregue() {
        Pedido pedido = new Pedido("P005");
        pedido.setStatus(new Entregue());
        assertThrows(IllegalStateException.class, () -> pedido.getStatus().enviar(pedido));
    }

    @Test
    void deveLancarExcecaoAoEntregarPedidoJaEntregue() {
        Pedido pedido = new Pedido("P006");
        pedido.setStatus(new Entregue());
        assertThrows(IllegalStateException.class, () -> pedido.getStatus().entregar(pedido));
    }
}