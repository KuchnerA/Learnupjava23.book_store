package ru.learnUp.learnupjava23;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import ru.learnUp.learnupjava23.dao.entity.Book;
import ru.learnUp.learnupjava23.dao.entity.Role;
import ru.learnUp.learnupjava23.dao.entity.User;
import ru.learnUp.learnupjava23.dao.repository.RoleRepository;
import ru.learnUp.learnupjava23.dao.service.BookService;
import ru.learnUp.learnupjava23.dao.service.BookstoreService;
import ru.learnUp.learnupjava23.dao.service.UserService;
import ru.learnUp.learnupjava23.exceptions.NotEnoughBooksException;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@SpringBootApplication()
@EnableCaching
public class Learnupjava23Application {

    public static void main(String[] args) throws InterruptedException {

        ConfigurableApplicationContext context = SpringApplication.run(Learnupjava23Application.class, args);

//        User user = new User();
//		UserService userService = context.getBean(UserService.class);
//		RoleRepository roleRepository = context.getBean(RoleRepository.class);
//
//		user.setUsername("kind");
//		user.setPassword("123123");
//		Set<Role> roles = roleRepository.findAll().stream()
//				.map(role -> roleRepository.findByName(role.getRole()))
//				.collect(Collectors.toSet());
//		user.setRoles(roles);
//		userService.create(user);


//        BookService bookService = context.getBean(BookService.class);
//        BookstoreService bookstoreService = context.getBean(BookstoreService.class);

        // - method to get all books by one author using JPQL

//        BookRepository bookRepository = context.getBean(BookRepository.class);
//        log.info("Search result: {}", bookRepository.findByAuthor("Dostoevsky Fedor Mikhailovich"));


        // - method parallel purchase of books by multiple users

//        updateAsync(bookstoreService, bookService.getBookById(1L));
    }

    static void updateAsync(BookstoreService service, Book book) {

        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                try {
                    service.buyBook(book, 1);
                    log.info("Book purchase completed!");
                } catch (NotEnoughBooksException e) {
                    log.warn("Sorry, there are no such number of books... try again later");
                }
            }).start();
        }
    }
}
