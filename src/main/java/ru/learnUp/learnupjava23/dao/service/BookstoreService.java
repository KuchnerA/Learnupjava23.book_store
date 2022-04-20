package ru.learnUp.learnupjava23.dao.service;

import org.springframework.stereotype.Service;
import ru.learnUp.learnupjava23.dao.entity.Bookstore;
import ru.learnUp.learnupjava23.dao.repository.BookstoreRepository;

import java.util.List;

@Service
public class BookstoreService {

    private final BookstoreRepository repository;

    public BookstoreService(BookstoreRepository repository) {
        this.repository = repository;
    }

    public Bookstore createBookstore(Bookstore bookstore) {
        return repository.save(bookstore);
    }

    public List<Bookstore> getBookstores() {
        return repository.findAll();
    }

    public Bookstore getBookstoreById(Long id) {
        return repository.getById(id);
    }
}
