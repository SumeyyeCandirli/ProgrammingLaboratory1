package labweek7;

import java.util.ArrayList;

public class Order {
    
    private Customer customer;
    private ArrayList<MenuItem> items;

    private int orderNumber;
    private Coupon coupon;
    private boolean completed;

    private static int nextOrderNumber = 1001;

    public static final double MIN_ORDER = 100.0;
    public static final double DELIVERY_FEE = 20.0;

    private static int completedOrders = 0;
    private static double totalRevenue = 0;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();

        this.orderNumber = nextOrderNumber;
        nextOrderNumber++;

        this.completed = false;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public static int getCompletedOrders() {
        return completedOrders;
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }

    public void addItem(MenuItem item)
            throws InvalidQuantityException {

        for (int i = 0; i < items.size(); i++) {

            if (items.get(i).getName().equals(item.getName())) {

                int newQuantity = items.get(i).getQuantity()
                        + item.getQuantity();

                items.get(i).setQuantity(newQuantity);
                return;
            }
        }

        items.add(item);
    }

    public void removeItem(String name)
            throws ItemNotFoundException {

        for (int i = 0; i < items.size(); i++) {

            if (items.get(i).getName().equals(name)) {
                items.remove(i);
                return;
            }
        }

        throw new ItemNotFoundException("Item not found: " + name);
    }

    public void updateQuantity(String name, int quantity)
            throws ItemNotFoundException,
                   InvalidQuantityException {

        for (int i = 0; i < items.size(); i++) {

            if (items.get(i).getName().equals(name)) {
                items.get(i).setQuantity(quantity);
                return;
            }
        }

        throw new ItemNotFoundException("Item not found: " + name);
    }

    public double getSubtotal() {

        double total = 0;

        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getTotalPrice();
        }

        return total;
    }

    public ArrayList<MenuItem> getItems() {
        return new ArrayList<>(items);
    }

    public void applyCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public double checkout() throws MinimumOrderException {

        if (completed) {
            throw new IllegalStateException("Order already completed!");
        }

        double subtotal = getSubtotal();

        if (subtotal < MIN_ORDER) {
            throw new MinimumOrderException("Minimum order is 100 TL!");
        }

        double discount = 0;

        if (coupon != null &&
                subtotal >= coupon.getMinSubtotal()) {

            discount = subtotal * coupon.getDiscountRate();
        }

        double total = subtotal - discount + DELIVERY_FEE;

        System.out.println("\n===== RECEIPT =====");
        System.out.println("Order Number: " + orderNumber);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Address: " + customer.getAddress());

        System.out.println("\nItems:");

        for (MenuItem item : items) {
            System.out.println(item);
        }

        System.out.println("\nSubtotal: " + subtotal + " TL");
        System.out.println("Coupon Discount: " + discount + " TL");
        System.out.println("Delivery Fee: " + DELIVERY_FEE + " TL");
        System.out.println("Total: " + total + " TL");

        completedOrders++;
        totalRevenue += total;
        completed = true;

        return total;
    }
}
