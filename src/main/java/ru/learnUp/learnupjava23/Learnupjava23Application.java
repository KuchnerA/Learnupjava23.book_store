package ru.learnUp.learnupjava23;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.learnUp.learnupjava23.dao.service.*;

@SpringBootApplication
public class Learnupjava23Application {

    private static final Logger log = LoggerFactory.getLogger(Learnupjava23Application.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Learnupjava23Application.class, args);

        AuthorService author = context.getBean(AuthorService.class);

        BookService bookService = context.getBean(BookService.class);

        BookstoreService bookStorageService = context.getBean(BookstoreService.class);

        ClientService clientService = context.getBean(ClientService.class);

        BooksOrderService booksOrderService = context.getBean(BooksOrderService.class);

        log.info("authors: {}", author.getAuthors());
        log.info("books: {}", bookService.getBooks());
        log.info("book storages: {}", bookStorageService.getBookstores());
        log.info("clients: {}", clientService.getClients());
        log.info("book orders: {}", booksOrderService.getBooksOrders());
    }

}
