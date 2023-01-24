package main;

public class Customer {

    private Integer customerRowID;

    public Customer(Integer customerRowID) {

	this.customerRowID = customerRowID;
    }

    public Integer getCustomerRowID() {
	return customerRowID;
    }

    public void setCustomerRowID(Integer customerRowID) {
	this.customerRowID = customerRowID;
    }

}
