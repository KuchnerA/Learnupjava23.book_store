package ru.learnUp.learnupjava23.view;

import lombok.Data;
import org.springframework.stereotype.Component;
import ru.learnUp.learnupjava23.dao.entity.BooksOrder;
import ru.learnUp.learnupjava23.dao.entity.Client;

import java.util.ArrayList;
import java.util.List;


@Data
@Component
public class BooksOrderView {
    private Long id;

    private Client client;

    private int purchaseAmount;

    public BooksOrderView mapToView(BooksOrder booksOrder) {
        BooksOrderView view = new BooksOrderView();
        view.setId(booksOrder.getId());
        view.setClient(booksOrder.getClient());
        view.setPurchaseAmount(booksOrder.getPurchaseAmount());
        return view;
    }

    public List<BooksOrderView> mapToViewList(List<BooksOrder> booksOrders) {
        List<BooksOrderView> views = new ArrayList<>();
        booksOrders.forEach(booksOrder -> {
            BooksOrderView view = new BooksOrderView();
            view.setId(booksOrder.getId());
            view.setClient(booksOrder.getClient());
            view.setPurchaseAmount(booksOrder.getPurchaseAmount());
            views.add(view);
        });
        return views;
    }

    public BooksOrder mapFromView(BooksOrderView view) {
        BooksOrder booksOrder = new BooksOrder();
        booksOrder.setId(view.getId());
        booksOrder.setClient(view.getClient());
        booksOrder.setPurchaseAmount(view.getPurchaseAmount());
        return booksOrder;
    }
}
