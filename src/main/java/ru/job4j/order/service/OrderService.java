package ru.job4j.order.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.job4j.order.model.Order;
import ru.job4j.order.repository.OrderRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void saveOrder(Order order) {
        orderRepository.save(order);
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Optional<Order> findById(int id) {
        return orderRepository.findById(id);
    }

    public boolean deleteById(int id) {
        if (!orderRepository.existsById(id)) {
            log.error(String.format("It is impossible to delete a non-existing order, with id = %s.", id));
            return false;
        }
        orderRepository.deleteById(id);
        return true;
    }

    public boolean updateOrder(Order order) {
        if (!orderRepository.existsById(order.getId())) {
            log.error(String.format("It is impossible to delete a non-existing order, with id = %s.", order.getId()));
            return false;
        }
        orderRepository.update(order.getStatus().name(), order.getDescription(), order.getId());
        return true;
    }
}
