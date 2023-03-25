package bg.fmi.course.wdwj.repository;

import bg.fmi.course.wdwj.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;


@Service
public class BookRepositoryImpl implements BookRepository {
    private Map<String, Book> db = new ConcurrentHashMap<>();

    @Autowired


    @Override
    public boolean add(Book book) {
        db.put(book.getIsbn(), book);
        return false;
    }

    @Override
    public List<Book> getBooks() {
        return db.values()
                .stream()
                .toList();
    }

    @Override
    public Book getByIsbn(String isbn) {
        return (Book) db.values()
                .stream()
                .filter(book -> book.getIsbn().equals(isbn))
                .collect(Collectors.toList());
    }
}