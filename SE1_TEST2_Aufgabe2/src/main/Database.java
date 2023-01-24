package main;

public class Database {

    private Updater database = new Updater();

    public Database() {

    }

    public void insertOrUpdate(Integer customerRowID, Customer customer) {
	if (customerRowID == null) {
	    database.insert(customer);
	} else {
	    database.update(customerRowID, customer);
	}
    }

}
