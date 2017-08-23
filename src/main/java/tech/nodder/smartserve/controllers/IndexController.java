package tech.nodder.smartserve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.nodder.smartserve.model.Customer;
import tech.nodder.smartserve.services.CustomerService;
import tech.nodder.smartserve.services.ItemService;

@Controller
public class IndexController {

    private ItemService itemService;
    private CustomerService customerService;

    @Autowired
    public IndexController(ItemService itemService, CustomerService customerService) {
        this.itemService = itemService;
        this.customerService = customerService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndex(Model model) {
        model.addAttribute("items", itemService.getAllItems());
        return "index";
    }

    @RequestMapping(value = "/addCustomer", params = {"save"})
    public String saveCustomer(Customer customer) {
        System.out.println("adding customer");
        customerService.add(customer);
        System.out.println("cust: " + customerService.getSingleCustomer().getEmail());
        return "redirect:/index";
    }

}
