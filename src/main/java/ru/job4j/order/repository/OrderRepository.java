package ru.job4j.order.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.job4j.order.model.Order;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Integer> {
    List<Order> findAll();
    @Modifying
    @Query("UPDATE Order o set o.status = :status, o.description = :description WHERE o.id = :id")
    void update(String status, String description, int id);
}
