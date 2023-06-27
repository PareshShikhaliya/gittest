package class22;

public class OrderStatusExample {
    public static String getOrderStatus(String orderStatus) {
        return switch (orderStatus) {
            case "PENDING", "PROCESSING" -> "Your order is being processed.";
            case "SHIPPED" -> "Your order has been shipped.";
            case "DELIVERED" -> "Your order has been delivered. Thank you!";
            case "CANCELLED" -> "Your order has been cancelled.";
            default -> "Unknown order status.";
        };
    }

    public static void main(String[] args) {
        System.out.println(getOrderStatus("PENDING")); // Output: Your order is being processed.
        System.out.println(getOrderStatus("SHIPPED")); // Output: Your order has been shipped.
        System.out.println(getOrderStatus("DELIVERED")); // Output: Your order has been delivered. Thank you!
        System.out.println(getOrderStatus("CANCELLED")); // Output: Your order has been cancelled.
        System.out.println(getOrderStatus("INVALID")); // Output: Unknown order status.
    }
}
