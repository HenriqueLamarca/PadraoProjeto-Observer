package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoServiceTest {

    @Test
    public void deveProcessarPedidoMudandoParaProcessando() {
        PedidoService service = PedidoService.getInstance();
        Pedido pedido = new Pedido("P010");
        service.processarPedido(pedido);
        assertEquals("Processando", pedido.getStatus().getNomeStatus());
    }

    @Test
    public void deveLancarExcecaoAoProcessarPedidoCancelado() {
        PedidoService service = PedidoService.getInstance();
        Pedido pedido = new Pedido("P011");
        pedido.setStatus(new Cancelado());
        assertThrows(IllegalStateException.class, () -> service.processarPedido(pedido));
    }
}