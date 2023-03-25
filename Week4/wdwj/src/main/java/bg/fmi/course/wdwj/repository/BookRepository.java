package bg.fmi.course.wdwj.repository;

import bg.fmi.course.wdwj.model.Book;

import java.util.List;

public interface BookRepository {

    boolean add(Book book);

    List<Book> getBooks();

    Book getByIsbn(String isbn);
}
