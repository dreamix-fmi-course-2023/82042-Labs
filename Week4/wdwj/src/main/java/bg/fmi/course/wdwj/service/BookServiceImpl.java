package bg.fmi.course.wdwj.service;

import bg.fmi.course.wdwj.model.Book;
import bg.fmi.course.wdwj.repository.BookRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public boolean add(Book book) {
        Book bookByIsbn = bookRepository.getByIsbn(book.getIsbn());
        if (bookByIsbn != null) {
            return false;
        }
        bookRepository.add(book);
        return true;
    }

    @Override
    public void remove(Book o) {

    }

    @Override
    public List<Book> getAllBooksByAuthor(String author) {
        if (author == null || author.isBlank()) {
            return new ArrayList<>();
        }
        return null;
    }

    @Override
    public List<Book> getAllBooksPublishedAfter(LocalDate from) {
        return null;
    }

    @Override
    public List<Book> getAllBooksBetween(LocalDate from, LocalDate to) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public Map<String, List<Book>> getAllBooksGroupByAuthor() {

        return null;
    }

    @Override
    public Map<String, List<Book>> getAllBooksGroupByPublisher() {
        return null;
    }

    @Override
    public List<Book> getAllBooksFilterBy(Predicate<Book> bookPredicate) {
        return null;
    }
}
