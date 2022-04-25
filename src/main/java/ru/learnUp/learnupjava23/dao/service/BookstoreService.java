package ru.learnUp.learnupjava23.dao.service;

import org.springframework.stereotype.Service;
import ru.learnUp.learnupjava23.dao.entity.Bookstore;
import ru.learnUp.learnupjava23.dao.repository.BookstoreRepository;

import java.util.List;

@Service
public class BookstoreService {

    private final BookstoreRepository bookstoreRepository;

    public BookstoreService(BookstoreRepository bookstoreRepository) {
        this.bookstoreRepository = bookstoreRepository;
    }

    public Bookstore createBookstore(Bookstore bookstore) {
        return bookstoreRepository.save(bookstore);
    }

    public List<Bookstore> getBookstores() {
        return bookstoreRepository.findAll();
    }

    public Bookstore getBookstoreById(Long id) {
        return bookstoreRepository.getById(id);
    }
}
