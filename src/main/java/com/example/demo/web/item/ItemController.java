package com.example.demo.web.item;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Item;

@RestController
public class ItemController {
    
    @GetMapping("/items")
    @ResponseBody
    @CrossOrigin
    public Object findItems() {
        List<Item> itemList = List.of(
            new Item(1,"ペン", 100, "CD-A01", LocalDate.now()),
            new Item(2,"ノート", 200, "CD-A01", LocalDate.now()));
        return itemList;
    }

    @PostMapping("/item")
    @ResponseBody
    @CrossOrigin
    public Object item(Item item){
        System.out.println(item);
        return item;
    }
}
