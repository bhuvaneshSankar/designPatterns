import java.util.List;

public class OrderFullFillment implements IOrder {
    private List<Warehouse> warehouses;

    /*
     * Constructors and other attributes would go here
     */
    public void fullFillOrder(Order order) {
        /*
         * For each item in a customer order, check each warehouse to see if it is in
         * stock. If it is then create a new Order for that warehouse. Else check the
         * next warehouse. Send the all the Orders to the warehouse(s) after you finish
         * iterating over all the items in the original Order.
         */
        for (Item item : order.itemList) {
            for (Warehouse warehouse : warehouses) {
            }
        }
        return;
    }
}