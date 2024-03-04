package com.shop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {

    @GetMapping(value= "/admin/item/new")
    public String itemForm() {
        return "/item/itemForm";
    }

    @GetMapping(value = "/admiin/item/new")
    public String itemForm(Model model) {
        model.addAttribute("itemFormDto", new ItemFormDto());
        return "item/itemForm";
    }
}
