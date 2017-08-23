package tech.nodder.smartserve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.nodder.smartserve.services.ItemService;

@Controller
public class IndexController {

    private ItemService itemService;

    @Autowired
    public IndexController(ItemService itemService) {
        this.itemService = itemService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndex(Model model) {
        model.addAttribute("items", itemService.getAllItems());
        return "index";
    }

}
