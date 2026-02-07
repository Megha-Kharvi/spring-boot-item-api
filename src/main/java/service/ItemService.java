package com.example.itemapi.service;

import com.example.itemapi.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    // ✅ This is your in-memory database
    private List<Item> items = new ArrayList<>();

    // ✅ Save item (Add to ArrayList)
    public Item saveItem(Item item) {
        items.add(item);
        return item;
    }

    // ✅ Get all items
    public List<Item> getAllItems() {
        return items;
    }

    // ✅ Get item by ID
    public Optional<Item> getItemById(int id) {
        return items.stream()
                .filter(item -> item.getId() == id)
                .findFirst();
    }
}
