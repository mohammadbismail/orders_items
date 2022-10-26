import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        // Menu items
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();
        item1.price = 4.0;
        item2.price = 6.5;
        item3.price = 3;
        item4.price = 2;
        item1.name = "mocha";
        item2.name = "latte";
        item3.name = "drip coffee";
        item4.name = "capuccino";

        // Order varialles

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        order2.items.add(item1);
        order2.total += item1.price;

        order3.items.add(item4);
        order3.total += item4.price;

        order4.items.add(item2);
        order4.total += item2.price;

        order1.ready = true;

        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += 2 * item2.price;
        order2.ready = true;
        // Application simulation
        System.out.printf("Name %s\n", order1.name);
        System.out.printf("Name %s\n", order1.total);
        System.out.printf("Name %s\n", order1.ready);
    }
}
