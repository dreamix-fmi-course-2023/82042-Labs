package bg.fmi.course.wdwj.repository;

import bg.fmi.course.wdwj.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Service
public class BookRepositoryImpl implements BookRepository{
    private Map<String, Book> db = new ConcurrentHashMap<>();

    @Autowired


    @Override
    public boolean add(Book book) {
        db.put(book.getIsbn(), book);
        return false;
    }

    @Override
    public Book getByIsbn(){

    }

    @Override
    public List<Book> getBooks(){
        return db.values().stream().toList();
    }


}