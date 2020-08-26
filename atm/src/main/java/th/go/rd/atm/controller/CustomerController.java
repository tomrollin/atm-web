package th.go.rd.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;

@Controller
public class CustomerController {
    @RequestMapping("/customer")
    public String getCustomerPage(Model model){
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1,"Peter","p1001"));
        customers.add(new Customer(2,"Nancy","p1002"));
        customers.add(new Customer(3,"Rick","p1003"));
        model.addAttribute("allCustomers", customers);
        return "customer";
    }
}
