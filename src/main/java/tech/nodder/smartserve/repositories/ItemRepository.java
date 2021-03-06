package tech.nodder.smartserve.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tech.nodder.smartserve.model.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
