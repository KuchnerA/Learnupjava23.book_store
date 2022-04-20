package ru.learnUp.learnupjava23.dao.service;

import org.springframework.stereotype.Service;
import ru.learnUp.learnupjava23.dao.entity.OrderDetails;
import ru.learnUp.learnupjava23.dao.repository.OrderDetailsRepository;

import java.util.List;

@Service
public class OrderDetailsService {

    private final OrderDetailsRepository repository;

    public OrderDetailsService(OrderDetailsRepository repository) {
        this.repository = repository;
    }

    public OrderDetails createOrderDetails(OrderDetails orderDetails) {
        return repository.save(orderDetails);
    }

    public List<OrderDetails> getOrderDetails() {
        return repository.findAll();
    }

    public OrderDetails getOrderDetailsById(Long id) {
        return repository.getById(id);
    }
}
