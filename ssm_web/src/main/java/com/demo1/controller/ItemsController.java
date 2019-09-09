package com.demo1.controller;


import com.demo1.pojo.Items;
import com.demo1.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findDetail")
    public String findDetail(Model model){
        System.out.println("111");
        Items items = itemsService.findById(1);
        model.addAttribute("item", items);
        return "list";
    }
}
