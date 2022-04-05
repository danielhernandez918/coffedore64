public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items

        Item item1 = new Item("mocha", 3.50);
        Item item2 = new Item("latte", 3.00);
        Item item3 = new Item("drip coffee", 4.00);
        Item item4 = new Item("cappucino", 5.00);

        // Create 2 orders for unspecified guests (without specifying a name);
        Order order1 =new Order();
        Order order2 =new Order();

        // Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 =new Order("Cindhuri");
        Order order4 =new Order("Jimmy");
        Order order5 =new Order("Noah");

        // Implement the addItem method within the Order class
        order1.addItem(item1);
        order1.addItem(item4);
        order2.addItem(item2);
        order2.addItem(item3);
        order3.addItem(item4);
        order3.addItem(item2);
        order4.addItem(item3);
        order4.addItem(item1);
        order5.addItem(item3);
        order5.addItem(item1);

        // Implement the getStatusMessage method within the Order class
        System.out.println(order3.getStatusMessage());

        // Test your getStatusMessage functionality by setting some orders to ready and printing the messages for each order. For example: order2.setReady(true); System.out.println(order2.getStatusMessage());
        order2.setReady(true);
        System.out.println(order2.getStatusMessage());

        //Test the total by printing the return value like so: System.out.println(order1.getOrderTotal());
        System.out.println(order3.getOrderTotal());

        // Implement the display method within the Order class
        order3.display();
        order2.display();
        

        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();
        //Menu
        coffeeKiosk.addMenuItem("mocha", 3.50);
        coffeeKiosk.addMenuItem("latte", 3.00);
        coffeeKiosk.addMenuItem("drip coffee", 4.00);
        coffeeKiosk.addMenuItem("cappucino", 5.00);

        coffeeKiosk.displayMenu();

        coffeeKiosk.newOrder();
    }
}