package com.example.itemapi.controller;

import com.example.itemapi.model.Item;
import com.example.itemapi.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    // GET all items
    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    // GET item by ID
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable int id) {
        return itemService.getItemById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST add new item
    @PostMapping
    public ResponseEntity<Item> addItem(@Valid @RequestBody Item item) {
        Item savedItem = itemService.saveItem(item);
        return ResponseEntity.ok(savedItem);
    }


}
