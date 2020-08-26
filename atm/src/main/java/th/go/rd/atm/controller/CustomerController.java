package th.go.rd.atm.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {
    private ArrayList<Customer> customers = new ArrayList<>();

    @GetMapping("/customer")
    public String getCustomerPage(Model model){

        model.addAttribute("allCustomers", customers);
        return "customer";
    }
    @PostMapping("/customer")
    public String registerCustomer(@ModelAttribute Customer customer, Model model){
        customers.add(customer);
        model.addAttribute("allCustomer",customers);
        return "redirect:customer";
    }
}
