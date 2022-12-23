public class Waiters implements Runnable {
    private final int orderQty;
    private final int customerID;
    static int foodPrice = 25000;

    public Waiters(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }
    @Override
    public void run() {
        // call getFood method and pending it to 5000 ms
        while (true) {
            getFood();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Something wrong \n desc: " + e); 
            }
        }
    }
    public void orderInfo() {
        System.out.println("==========================================================");
        System.out.println("Customer ID: " + this.customerID);
        System.out.println("Numbeer of Food: " + this.orderQty);
        System.out.println("Total Price: " + this.orderQty * foodPrice);
        System.out.println("==========================================================");
    }
    // create synchronized method getFood
    public void getFood() {
        synchronized(Restaurant.getLock()) {

            System.out.println("Waiter : food is ready to deliver");
            Restaurant Restaurant = new Restaurant();
            Restaurant.setWaitingForPickup(false);

            // check if value of getFoodNumber form Restaurant class is equal to orderQty
            // if same, call method orderInfo() to print order info and exit the program
            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter : Tell the food machine to make another food\n");

        }
    }
}
