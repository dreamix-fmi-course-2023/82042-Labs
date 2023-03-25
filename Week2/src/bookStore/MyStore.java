package bookStore;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyStore implements Store {
    private final Set<Book> books;

    public MyStore() {
        books = new HashSet<Book>();
    }

    @Override
    public boolean add(Book o) {
        boolean result = true;
        for (Book book : books) {
            if (book.equals(o)) {
                result = false;
            } else {
                books.add(o);
            }
        }
        return result;
    }

    @Override
    public void remove(Book o) {
        this.books.remove(o);
    }

    @Override
    public List<Book> getAllBooksByAuthor(String author) {
        return this.books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> getAllBooksPublishedAfter(LocalDate from) {
        return this.books.stream()
                .filter(book -> book.getPublishedYear().isAfter(from))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> getAllBooksBetween(LocalDate from, LocalDate to) {
        return this.books.stream()
                .filter(book -> book.getPublishedYear().isAfter(from) && book.getPublishedYear().isBefore(to))
                .collect(Collectors.toList());
    }

    @Override
    public void clear() {
        this.books.clear();
    }

    @Override
    public Map<String, List<Book>> getAllBooksGroupByAuthor() {
        return books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor));

    }

    @Override
    public Map<String, List<Book>> getAllBooksGroupByPublisher() {
        return books.stream()
                .collect(Collectors.groupingBy(Book::getPublisher));
    }

    @Override
    public List<Book> getAllBooksFilterBy(Predicate<Book> bookPredicate) {
        return books.stream()
                .filter(bookPredicate)
                .collect(Collectors.toList());
    }
}
