import java.util.ArrayList;

public class CustomerOrder {
    private ArrayList<String> customerOrder;
    private float orderTotal;
    CustomerOrder() {
        customerOrder = new ArrayList<>();
        orderTotal = 0F;
    }
    public void addItemToCustomerOrder(String orderItem) {
        customerOrder.add(orderItem);
    }
    public void displayCustomerOrder() {
        System.out.println(customerOrder);
    }
    public void addToOrderTotal(float num) {
        orderTotal += num;
    }

    public ArrayList<String> getCustomerOrder() {
        return customerOrder;
    }

    public float getOrderTotal() {
        return orderTotal;
    }
}
