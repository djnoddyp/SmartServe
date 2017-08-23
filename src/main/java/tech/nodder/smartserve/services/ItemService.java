package tech.nodder.smartserve.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.nodder.smartserve.model.Item;
import tech.nodder.smartserve.repositories.ItemRepository;

import java.util.List;

@Service
public class ItemService {

    private ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems() {
        return (List<Item>) itemRepository.findAll();
    }

}
