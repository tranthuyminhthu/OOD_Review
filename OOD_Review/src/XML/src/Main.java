import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        XML item1 = new TagNode("item", "Dog House", Map.of("number", "12660", "quantity", "1"));
        XML item2 = new TagNode("item", "Bird Feeder", Map.of("number", "54678", "quantity", "2"));
        XML order = new TagParentNode("order", Map.of("number", "123")) ;
        XML orders = new TagParentNode("orders", Map.of()) ;

        order.add(item1);
        order.add(item2);
        orders.add(order);
//        System.out.println(item1.generateHtml());
//        System.out.println(item2.generateHtml());
        System.out.println(orders.generateHtml());

    }
}