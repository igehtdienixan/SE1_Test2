package main;

import java.util.HashMap;

public class Updater {

    HashMap<Integer, Customer> database = new HashMap<Integer, Customer>();

    public Updater() {
	super();
    }

    public void insert(Customer custormer) {
	database.put(custormer.getCustomerRowID(), custormer);
    }

    public void update(Integer customerRowID, Customer customer) {
	database.put(customerRowID, customer);
    }

}
