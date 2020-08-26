package th.go.rd.atm.service;

import org.springframework.stereotype.Service;
import th.go.rd.atm.model.Customer;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private ArrayList<Customer> customerList;

    @PostConstruct
    public void postConstruct(){
        customerList = new ArrayList<>();
    }
    public void createCustomer(Customer customer){
        //.....เพื่อเพิ่ม code ส่วน hash pin ได้.........
        customerList.add(customer);
    }
    public List<Customer> getCustomer(){
        return new ArrayList<>(this.customerList);
    }

}
