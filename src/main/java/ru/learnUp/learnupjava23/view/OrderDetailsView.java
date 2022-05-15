package ru.learnUp.learnupjava23.view;

import lombok.Data;
import org.springframework.stereotype.Component;
import ru.learnUp.learnupjava23.dao.entity.Book;
import ru.learnUp.learnupjava23.dao.entity.BooksOrder;
import ru.learnUp.learnupjava23.dao.entity.OrderDetails;

@Data
@Component
public class OrderDetailsView {

    private Long id;

    private BooksOrder booksOrder;

    private Book book;

    private int countOfBooks;

    private int priceOfBooks;

    public OrderDetailsView mapToView(OrderDetails orderDetails) {
        OrderDetailsView view = new OrderDetailsView();
        view.setId(orderDetails.getId());
        view.setBooksOrder(orderDetails.getBooksOrder());
        view.setBook(orderDetails.getBook());
        view.setCountOfBooks(orderDetails.getCountOfBooks());
        view.setPriceOfBooks(orderDetails.getPriceOfBooks());
        return view;
    }

    public OrderDetails mapFromView(OrderDetailsView view) {
        OrderDetails orderDetails = new OrderDetails();
        orderDetails.setId(view.getId());
        orderDetails.setBooksOrder(view.getBooksOrder());
        orderDetails.setBook(view.getBook());
        orderDetails.setCountOfBooks(view.getCountOfBooks());
        orderDetails.setPriceOfBooks(view.getPriceOfBooks());
        return orderDetails;
    }
}
