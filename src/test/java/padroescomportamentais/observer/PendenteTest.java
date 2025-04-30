package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PendenteTest {

    @Test
    void deveMudarParaProcessandoAoAprovar() {
        Pedido pedido = new Pedido("P009");
        pedido.getStatus().aprovar(pedido);
        assertEquals("Processando", pedido.getStatus().getNomeStatus());
    }

    @Test
    void deveMudarParaCanceladoAoCancelar() {
        Pedido pedido = new Pedido("P010");
        pedido.getStatus().cancelar(pedido);
        assertEquals("Cancelado", pedido.getStatus().getNomeStatus());
    }

    @Test
    void deveLancarExcecaoAoEnviarPedidoPendente() {
        Pedido pedido = new Pedido("P011");
        assertThrows(IllegalStateException.class, () -> pedido.getStatus().enviar(pedido));
    }
}