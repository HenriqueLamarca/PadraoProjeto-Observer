package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CanceladoTest {

    @Test
    public void testAprovarDeveLancarExcecao() {
        Pedido pedido = new Pedido("P001");
        pedido.setStatus(new Cancelado());
        assertThrows(IllegalStateException.class, () -> pedido.getStatus().aprovar(pedido));
    }

    @Test
    public void testEnviarDeveLancarExcecao() {
        Pedido pedido = new Pedido("P002");
        pedido.setStatus(new Cancelado());
        assertThrows(IllegalStateException.class, () -> pedido.getStatus().enviar(pedido));
    }
}