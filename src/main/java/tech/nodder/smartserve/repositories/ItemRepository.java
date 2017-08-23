package tech.nodder.smartserve.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tech.nodder.smartserve.model.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
}
