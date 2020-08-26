package atm;

import java.util.ArrayList;

public class DatabaseDataSource implements DataSource{
    public ArrayList<Customer> getCustomerData(){
        // database จำลอง
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(100,"nana","p1000"));
        customers.add(new Customer(101,"tui_wi","p1001"));
        return customers;
    }
}
