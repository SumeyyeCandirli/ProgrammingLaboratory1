package labweek7;

public class LabWeek7 {

    public static void main(String[] args) {
        
        try {

            Customer c1 = new Customer("Ali", "5551112233","Ataturk Street", "Melikgazi", "Kayseri");

            Customer c2 = new Customer("Ayse", "5554445566","Cumhuriyet Street", "Kocasinan", "Kayseri");

            Order order1 = new Order(c1);
            Order order2 = new Order(c2);

            System.out.println("Order 1: " + order1.getOrderNumber());
            System.out.println("Order 2: " + order2.getOrderNumber());

            MenuItem pizza = new MenuItem("Pizza", 80, 1);
            MenuItem burger = new MenuItem("Burger", 60, 2);
            MenuItem fries = new MenuItem("Fries", 30, 1);

            order1.addItem(pizza);

            MenuItem anotherPizza = new MenuItem("Pizza", 80, 1);

            order1.addItem(anotherPizza);
            order1.addItem(fries);

            order1.updateQuantity("Pizza", 3);

            order1.removeItem("Fries");

            Coupon coupon1 = new Coupon("SAVE10", 0.10, 150);

            order1.applyCoupon(coupon1);

            try {
                order1.checkout();
            }
            catch (MinimumOrderException e) {
                System.out.println(e.getMessage());
            }
            
            order2.addItem(burger);
            
            Coupon coupon2 = new Coupon("SAVE20", 0.20, 200);

            order2.applyCoupon(coupon2);

            try {
                order2.checkout();
            }
            catch (MinimumOrderException e) {
                System.out.println(e.getMessage());
            }

            try {
                order1.removeItem("Pasta");
            }
            catch (ItemNotFoundException e) {
                System.out.println(e.getMessage());
            }

            try {
                pizza.setQuantity(0);
            }
            catch (InvalidQuantityException e) {
                System.out.println(e.getMessage());
            }

            Order smallOrder = new Order(c1);

            MenuItem tea = new MenuItem("Tea", 10, 1);
            smallOrder.addItem(tea);

            try {
                smallOrder.checkout();
            }
            catch (MinimumOrderException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("\n===== STATISTICS =====");

            System.out.println("Completed Orders: " + Order.getCompletedOrders());

            System.out.println("Total Revenue: " +Order.getTotalRevenue() + " TL");

        }
        catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        }
        catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
