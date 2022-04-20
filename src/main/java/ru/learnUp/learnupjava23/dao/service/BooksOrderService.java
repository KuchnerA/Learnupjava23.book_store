package ru.learnUp.learnupjava23.dao.service;

import org.springframework.stereotype.Service;
import ru.learnUp.learnupjava23.dao.entity.BooksOrder;
import ru.learnUp.learnupjava23.dao.repository.BooksOrderRepository;

import java.util.List;

@Service
public class BooksOrderService {

    private final BooksOrderRepository repository;

    public BooksOrderService(BooksOrderRepository repository) {
        this.repository = repository;
    }

    public BooksOrder createBooksOrder(BooksOrder booksOrder) {
        return repository.save(booksOrder);
    }

    public List<BooksOrder> getBooksOrders() {
        return repository.findAll();
    }

    public BooksOrder getBooksOrderById(Long id) {
        return repository.getById(id);
    }
}
