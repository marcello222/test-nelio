package enumeracao;

import java.util.Date;

public class Programa {


    public static void main(String[] args) {


        Pedido pedido = new Pedido(1080, new Date(), OrderStatus.PAGAMENTO_PENDENTE);

        System.out.println(pedido);

        OrderStatus os1 = OrderStatus.ENTREGUE;

        OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");

        System.out.println(os1);
        System.out.println(os2);

    }
}
