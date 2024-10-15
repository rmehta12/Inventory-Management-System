package com.project.inventory.service;

import com.project.inventory.model.Item;
import com.project.inventory.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item getItemById(int id) {
        return itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item Not Found"));
    }

    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    public Item updateItem(int id, Item itemDetails) {
        Item item = itemRepository.findById(id).orElseThrow(()-> new RuntimeException("Product Not Found"));
        item.setName(itemDetails.getName());
        item.setQuantity(itemDetails.getQuantity());
        item.setPrice(itemDetails.getPrice());
        return itemRepository.save(item);
    }

    public void deleteItem(int id) {
        itemRepository.deleteById(id);
    }
}
