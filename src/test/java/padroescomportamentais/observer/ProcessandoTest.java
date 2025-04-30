package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ProcessandoTest {

    @Test
    void deveMudarParaEnviadoAoEnviar() {
        Pedido pedido = new Pedido("P012");
        pedido.setStatus(new Processando());
        pedido.getStatus().enviar(pedido);
        assertEquals("Enviado", pedido.getStatus().getNomeStatus());
    }

    @Test
    void deveLancarExcecaoAoAprovarPedidoProcessando() {
        Pedido pedido = new Pedido("P013");
        pedido.setStatus(new Processando());
        assertThrows(IllegalStateException.class, () -> pedido.getStatus().aprovar(pedido));
    }

    @Test
    void deveLancarExcecaoAoEntregarPedidoProcessando() {
        Pedido pedido = new Pedido("P014");
        pedido.setStatus(new Processando());
        assertThrows(IllegalStateException.class, () -> pedido.getStatus().entregar(pedido));
    }
}