public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        ClienteApp cliente = new ClienteApp();
        RestaurantePainel restaurante = new RestaurantePainel();
        EntregadroApp entregador = new EntregadroApp();

        pedido.addObserver(cliente);
        pedido.addObserver(restaurante);
        pedido.addObserver(entregador);

        pedido.setStatus(StatusPedido.RECEBIDO);
        pedido.setStatus(StatusPedido.PREPARANDO);
        pedido.setStatus(StatusPedido.SAIU_PARA_ENTREGA);
        pedido.setStatus(StatusPedido.ENTREGUE);
    }
}
